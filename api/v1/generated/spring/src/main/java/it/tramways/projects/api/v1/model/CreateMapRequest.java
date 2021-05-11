package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.RoadMap;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateMapRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-09T23:31:59.430+02:00[Europe/Berlin]")
public class CreateMapRequest   {
  @JsonProperty("map")
  private RoadMap map;

  public CreateMapRequest map(RoadMap map) {
    this.map = map;
    return this;
  }

  /**
   * Get map
   * @return map
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoadMap getMap() {
    return map;
  }

  public void setMap(RoadMap map) {
    this.map = map;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMapRequest createMapRequest = (CreateMapRequest) o;
    return Objects.equals(this.map, createMapRequest.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(map);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMapRequest {\n");
    
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

