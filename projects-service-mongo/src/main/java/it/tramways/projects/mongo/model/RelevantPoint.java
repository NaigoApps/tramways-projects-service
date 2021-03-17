package it.tramways.projects.mongo.model;

import java.util.List;

public class RelevantPoint extends Configurable {

    private List<CrossingLink> links;

    public List<CrossingLink> getLinks() {
        return links;
    }

    public void setLinks(List<CrossingLink> links) {
        this.links = links;
    }
}

