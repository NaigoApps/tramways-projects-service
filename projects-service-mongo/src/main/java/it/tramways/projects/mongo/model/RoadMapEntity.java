package it.tramways.projects.mongo.model;

import java.util.List;

public class RoadMapEntity {

  private List<RelevantPoint> points;
  private List<Lane> lanes;
  private String name;

  public List<Lane> getLanes() {
    return lanes;
  }

  public void setLanes(List<Lane> lanes) {
    this.lanes = lanes;
  }

  public List<RelevantPoint> getPoints() {
    return points;
  }

  public void setPoints(List<RelevantPoint> points) {
    this.points = points;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

