package it.tramways.projects.api;

import it.tramways.projects.api.model.ProjectDescription;
import java.util.List;

public interface ProjectsRepository {

    List<ProjectDescription> findProjects(String userUuid);

    ProjectDescription findProject(String uuid);

    ProjectDescription createProject(ProjectDescription command);

    ProjectDescription updateProject(ProjectDescription project);

}
