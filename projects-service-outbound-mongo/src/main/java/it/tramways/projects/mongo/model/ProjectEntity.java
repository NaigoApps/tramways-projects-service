package it.tramways.projects.mongo.model;

import it.tramways.projects.api.v1.model.Project;
import it.tramways.projects.api.v1.model.ProjectDescription;

public class ProjectEntity extends Project {

    private String id;

    public static ProjectEntity from(ProjectDescription project) {
        ProjectEntity result = new ProjectEntity();
        result.setUuid(project.getUuid());
        result.setName(project.getName());
        result.setOwner(project.getOwner());
        return result;
    }

    public static ProjectEntity from(Project project) {
        ProjectEntity result = new ProjectEntity();
        result.setUuid(project.getUuid());
        result.setName(project.getName());
        result.setOwner(project.getOwner());
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
