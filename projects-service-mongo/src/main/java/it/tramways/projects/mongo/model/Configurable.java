package it.tramways.projects.mongo.model;

import java.util.List;

public class Configurable {

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public List<Property> getProps() {
    return props;
  }

  public void setProps(List<Property> props) {
    this.props = props;
  }

  private String category;
  private List<Property> props;

}

