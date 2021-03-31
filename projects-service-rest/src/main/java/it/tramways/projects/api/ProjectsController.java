package it.tramways.projects.api;

import it.tramways.commons.web.security.LoggedUserService;
import it.tramways.commons.web.security.TramwaysUserDetails;
import it.tramways.projects.api.model.CreateMapRequest;
import it.tramways.projects.api.model.CreateProjectRequest;
import it.tramways.projects.api.model.Project;
import it.tramways.projects.api.model.ProjectDescription;
import it.tramways.projects.api.model.RoadMap;
import it.tramways.projects.api.model.UpdateMapRequest;
import it.tramways.projects.api.model.UpdateProjectRequest;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tramways/rest")
public class ProjectsController implements ProjectsApi {

    private final LoggedUserService loggedUserService;
    private final ProjectsRepository projectsRepository;

    public ProjectsController(
        LoggedUserService loggedUserService,
        ProjectsRepository projectsRepository
    ) {
        this.loggedUserService = loggedUserService;
        this.projectsRepository = projectsRepository;
    }

    @Override
    public ResponseEntity<List<ProjectDescription>> getProjects() {
        TramwaysUserDetails userDetails = loggedUserService.getLoggedUser();
        if (userDetails == null) {
            return ResponseEntity.ok(Collections.emptyList());
        }
        String userUuid = userDetails.getUuid();
        return ResponseEntity.ok(projectsRepository.findProjects(userUuid));
    }

    @Override
    public ResponseEntity<Void> createProject(@Valid CreateProjectRequest createProjectRequest) {
        return withLoggedUser(user -> {
            ProjectDescription project = new ProjectDescription();
            project.setUuid(UUID.randomUUID().toString());
            project.setName(createProjectRequest.getName());
            project.setOwner(user.getUuid());
            projectsRepository.createProject(project);
            return ResponseEntity.ok().build();
        });
    }

    @Override
    public ResponseEntity<Project> getProject(String id) {
        return withLoggedUser(user -> {
            Project project = projectsRepository.findProject(id);
            if (project == null) {
                return ResponseEntity.notFound().build();
            }
            if (!user.getUuid().equals(project.getOwner())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            return ResponseEntity.ok(project);
        });
    }

    @Override
    public ResponseEntity<Void> updateProject(String id,
        @Valid UpdateProjectRequest updateProjectRequest) {
        return withLoggedUser(user -> {
            Project oldProject = projectsRepository.findProject(id);
            if (oldProject == null) {
                return ResponseEntity.notFound().build();
            }
            if (!user.getUuid().equals(oldProject.getOwner())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            oldProject.setName(updateProjectRequest.getName());
            projectsRepository.updateProject(oldProject);
            return ResponseEntity.ok().build();
        });
    }

    @Override
    public ResponseEntity<Void> deleteProject(String id) {
        return withLoggedUser(user -> {
            Project project = projectsRepository.findProject(id);
            if (project == null) {
                return ResponseEntity.notFound().build();
            }
            if (!user.getUuid().equals(project.getOwner())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            projectsRepository.deleteProject(id);
            return ResponseEntity.ok().build();

        });
    }

    @Override
    public ResponseEntity<RoadMap> createMap(String projectId,
        @Valid CreateMapRequest createMapRequest) {
        return withLoggedUser(user -> {
            Project project = projectsRepository.findProject(projectId);
            if (!project.getOwner().equals(user.getUuid())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            RoadMap map = createMapRequest.getMap();
            map.setUuid(UUID.randomUUID().toString());
            map.setProjectId(projectId);
            return ResponseEntity.ok(projectsRepository.createMap(map));
        });
    }

    @Override
    public ResponseEntity<RoadMap> getMap(String projectId, String mapId) {
        return withLoggedUser(user -> {
            Project project = projectsRepository.findProject(projectId);
            if (!project.getOwner().equals(user.getUuid())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            return ResponseEntity.ok(projectsRepository.findMap(mapId));
        });
    }

    @Override
    public ResponseEntity<Void> updateMap(String projectId, String mapId,
        @Valid UpdateMapRequest updateMapRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteMap(String projectId, String mapId) {
        return withLoggedUser(user -> {
            Project project = projectsRepository.findProject(projectId);
            if (!project.getOwner().equals(user.getUuid())) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
            if (project.getRoadMaps().stream().noneMatch(map -> map.getUuid().equals(mapId))) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            projectsRepository.deleteMap(mapId);
            return ResponseEntity.ok().build();
        });
    }


    private <T> ResponseEntity<T> withLoggedUser(
        Function<TramwaysUserDetails, ResponseEntity<T>> action) {
        return withLoggedUser(action, unauthorizedSupplier());
    }

    private <T> ResponseEntity<T> withLoggedUser(
        Function<TramwaysUserDetails, ResponseEntity<T>> action,
        Supplier<ResponseEntity<T>> errorSupplier) {
        TramwaysUserDetails userDetails = loggedUserService.getLoggedUser();
        if (userDetails == null) {
            return errorSupplier.get();
        }
        return action.apply(userDetails);
    }

    private <T> Supplier<ResponseEntity<T>> unauthorizedSupplier() {
        return () -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
