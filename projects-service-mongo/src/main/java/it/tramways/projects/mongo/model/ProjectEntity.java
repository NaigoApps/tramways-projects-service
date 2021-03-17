package it.tramways.projects.mongo.model;

public class ProjectEntity {

    private String owner;
    private String uuid;
    private String name;

    public void setOwner(String userUuid) {
        this.owner = userUuid;
    }

    public String getOwner() {
        return owner;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
