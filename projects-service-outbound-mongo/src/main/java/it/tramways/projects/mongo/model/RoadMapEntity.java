package it.tramways.projects.mongo.model;

import it.tramways.projects.api.v1.spring.server.model.RoadMap;
import it.tramways.projects.api.v1.spring.server.model.RoadMapDescription;

public class RoadMapEntity extends RoadMap {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static RoadMapEntity from(RoadMap roadMap) {
        RoadMapEntity entity = new RoadMapEntity();
        entity.setUuid(roadMap.getUuid());
        entity.setProjectId(roadMap.getProjectId());
        entity.setName(roadMap.getName());
        entity.setLanes(roadMap.getLanes());
        entity.setPoints(roadMap.getPoints());
        return entity;
    }

    public RoadMapDescription toDescription() {
        RoadMapDescription description = new RoadMapDescription();
        description.setUuid(getUuid());
        description.setName(getName());
        return description;
    }
}

