package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.RoadMapDescription;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-14T00:55:55.334+01:00[Europe/Berlin]")
public class Project   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("roadMaps")
  @Valid
  private List<RoadMapDescription> roadMaps = null;

  public Project uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @ApiModelProperty(value = "")


  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Project roadMaps(List<RoadMapDescription> roadMaps) {
    this.roadMaps = roadMaps;
    return this;
  }

  public Project addRoadMapsItem(RoadMapDescription roadMapsItem) {
    if (this.roadMaps == null) {
      this.roadMaps = new ArrayList<>();
    }
    this.roadMaps.add(roadMapsItem);
    return this;
  }

  /**
   * Get roadMaps
   * @return roadMaps
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RoadMapDescription> getRoadMaps() {
    return roadMaps;
  }

  public void setRoadMaps(List<RoadMapDescription> roadMaps) {
    this.roadMaps = roadMaps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.uuid, project.uuid) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.owner, project.owner) &&
        Objects.equals(this.roadMaps, project.roadMaps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, owner, roadMaps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    roadMaps: ").append(toIndentedString(roadMaps)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

