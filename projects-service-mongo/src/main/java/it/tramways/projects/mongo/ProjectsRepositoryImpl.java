package it.tramways.projects.mongo;

import it.tramways.projects.api.ProjectsRepository;
import it.tramways.projects.api.model.Project;
import it.tramways.projects.api.model.ProjectDescription;
import it.tramways.projects.api.model.RoadMap;
import it.tramways.projects.mongo.model.ProjectEntity;
import it.tramways.projects.mongo.model.RoadMapEntity;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectsRepositoryImpl implements ProjectsRepository {

    private final ProjectsMongoRepository projectsDelegate;
    private final RoadMapsMongoRepository roadmapsDelegate;

    public ProjectsRepositoryImpl(
        ProjectsMongoRepository projectsDelegate,
        RoadMapsMongoRepository roadmapsDelegate
    ) {
        this.projectsDelegate = projectsDelegate;
        this.roadmapsDelegate = roadmapsDelegate;
    }

    @Override
    public List<ProjectDescription> findProjects(String userUuid) {
        return projectsDelegate.findAll(projectWithOwner(userUuid)).stream()
            .map(this::convertProject).collect(
                Collectors.toList());
    }

    private ProjectDescription convertProject(ProjectEntity entity) {
        ProjectDescription result = new ProjectDescription();
        result.setUuid(entity.getUuid());
        result.setName(entity.getName());
        result.setOwner(entity.getOwner());
        return result;
    }

    @Override
    public Project findProject(String uuid) {
        ProjectEntity entity = projectsDelegate.findOne(projectWithUuid(uuid)).orElse(null);
        if (entity == null) {
            return null;
        }
        Project result = new Project();
        result.setUuid(entity.getUuid());
        result.setOwner(entity.getOwner());
        result.setName(entity.getName());
        result.setRoadMaps(roadmapsDelegate.findAll(withProjectId(entity.getUuid())).stream()
            .map(RoadMapEntity::toDescription).collect(Collectors.toList()));
        return result;
    }

    private Example<RoadMapEntity> withProjectId(String projectUuid) {
        RoadMapEntity probe = new RoadMapEntity();
        probe.setProjectId(projectUuid);
        return Example.of(probe);
    }

    @Override
    public ProjectDescription createProject(ProjectDescription project) {
        return convertProject(projectsDelegate.insert(ProjectEntity.from(project)));
    }

    @Override
    public Project updateProject(Project project) {
        Optional<ProjectEntity> optTarget = projectsDelegate
            .findOne(projectWithUuid(project.getUuid()));
        if (optTarget.isPresent()) {
            ProjectEntity target = optTarget.get();
            ProjectEntity from = ProjectEntity.from(project);
            from.setId(target.getId());
            projectsDelegate.save(from);
        }
        return project;
    }

    @Override
    public void deleteProject(String uuid) {
        projectsDelegate.findOne(projectWithUuid(uuid)).ifPresent(projectsDelegate::delete);
    }

    @Override
    public RoadMap createMap(RoadMap map) {
        return roadmapsDelegate.insert(RoadMapEntity.from(map));
    }

    @Override
    public void deleteMap(String mapId) {
        roadmapsDelegate.findOne(mapWithUuid(mapId)).ifPresent(roadmapsDelegate::delete);
    }

    @Override
    public RoadMap findMap(String mapId) {
        return roadmapsDelegate.findOne(mapWithUuid(mapId)).orElse(null);
    }

    private Example<ProjectEntity> projectWithOwner(String userUuid) {
        ProjectEntity probe = new ProjectEntity();
        probe.setOwner(userUuid);
        return Example.of(probe);
    }

    private Example<ProjectEntity> projectWithUuid(String uuid) {
        ProjectEntity probe = new ProjectEntity();
        probe.setUuid(uuid);
        return Example.of(probe);
    }

    private Example<RoadMapEntity> mapWithUuid(String uuid) {
        RoadMapEntity probe = new RoadMapEntity();
        probe.setUuid(uuid);
        return Example.of(probe);
    }
}
