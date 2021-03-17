package it.tramways.projects.mongo;

import it.tramways.projects.api.ProjectsRepository;
import it.tramways.projects.api.model.ProjectDescription;
import java.util.List;
import org.springframework.data.domain.Example;

public class ProjectsRepositoryImpl implements ProjectsRepository {

    private ProjectsMongoRepository projectsDelegate;
    private ProjectsMongoRepository roadmapsDelegate;

    public ProjectsRepositoryImpl(
        ProjectsMongoRepository projectsDelegate,
        ProjectsMongoRepository roadmapsDelegate
    ) {
        this.projectsDelegate = projectsDelegate;
        this.roadmapsDelegate = roadmapsDelegate;
    }

    @Override
    public List<ProjectDescription> findProjects(String userUuid) {
        return projectsDelegate.findAll(withOwner(userUuid));
    }

    @Override
    public ProjectDescription findProject(String uuid) {
        return projectsDelegate.findOne(withUuid(uuid)).orElse(null);
    }

    @Override
    public ProjectDescription createProject(ProjectDescription project) {
        return projectsDelegate.insert(project);
    }

    @Override
    public ProjectDescription updateProject(ProjectDescription project) {
        return projectsDelegate.save(project);
    }

    private Example<ProjectDescription> withOwner(String userUuid) {
        ProjectDescription probe = new ProjectDescription();
        probe.setOwner(userUuid);
        return Example.of(probe);
    }

    private Example<ProjectDescription> withUuid(String uuid) {
        ProjectDescription probe = new ProjectDescription();
        probe.setUuid(uuid);
        return Example.of(probe);
    }
}
