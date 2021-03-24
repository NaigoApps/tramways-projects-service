package it.tramways.projects.api;

import it.tramways.projects.api.model.Project;
import it.tramways.projects.api.model.ProjectDescription;
import java.util.List;

public interface ProjectsRepository {

    List<ProjectDescription> findProjects(String userUuid);

    Project findProject(String uuid);

    ProjectDescription createProject(ProjectDescription command);

    Project updateProject(Project project);

    void deleteProject(String id);
}
