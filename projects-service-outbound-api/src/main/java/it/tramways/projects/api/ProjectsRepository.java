package it.tramways.projects.api;

import it.tramways.projects.api.v1.model.Project;
import it.tramways.projects.api.v1.model.ProjectDescription;
import it.tramways.projects.api.v1.model.RoadMap;
import java.util.List;

public interface ProjectsRepository {

    List<ProjectDescription> findProjects(String userUuid);

    Project findProject(String uuid);

    ProjectDescription createProject(ProjectDescription command);

    Project updateProject(Project project);

    void deleteProject(String id);

    RoadMap createMap(RoadMap map);

    void deleteMap(String mapId);

    RoadMap findMap(String mapId);

    void updateMap(String mapId, RoadMap map);
}
