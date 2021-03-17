package it.tramways.projects.mongo.model;

public class CrossingLink extends Configurable  {

  private String sourceId;

  private String destinationId;

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }
}

