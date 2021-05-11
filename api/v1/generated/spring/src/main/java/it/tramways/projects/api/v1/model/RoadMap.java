package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.Lane;
import it.tramways.projects.api.v1.model.RelevantPoint;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-09T23:31:59.430+02:00[Europe/Berlin]")
public class RoadMap   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("points")
  @Valid
  private List<RelevantPoint> points = null;

  @JsonProperty("lanes")
  @Valid
  private List<Lane> lanes = null;

  public RoadMap uuid(String uuid) {
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

  public RoadMap name(String name) {
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

  public RoadMap projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  */
  @ApiModelProperty(value = "")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RoadMap points(List<RelevantPoint> points) {
    this.points = points;
    return this;
  }

  public RoadMap addPointsItem(RelevantPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Get points
   * @return points
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RelevantPoint> getPoints() {
    return points;
  }

  public void setPoints(List<RelevantPoint> points) {
    this.points = points;
  }

  public RoadMap lanes(List<Lane> lanes) {
    this.lanes = lanes;
    return this;
  }

  public RoadMap addLanesItem(Lane lanesItem) {
    if (this.lanes == null) {
      this.lanes = new ArrayList<>();
    }
    this.lanes.add(lanesItem);
    return this;
  }

  /**
   * Get lanes
   * @return lanes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Lane> getLanes() {
    return lanes;
  }

  public void setLanes(List<Lane> lanes) {
    this.lanes = lanes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadMap roadMap = (RoadMap) o;
    return Objects.equals(this.uuid, roadMap.uuid) &&
        Objects.equals(this.name, roadMap.name) &&
        Objects.equals(this.projectId, roadMap.projectId) &&
        Objects.equals(this.points, roadMap.points) &&
        Objects.equals(this.lanes, roadMap.lanes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, projectId, points, lanes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadMap {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    lanes: ").append(toIndentedString(lanes)).append("\n");
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

