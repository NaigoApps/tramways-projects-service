/*
 * Tramways Roadmaps API
 * Tramways Roadmaps API
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.tramways.projects.api.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.RoadMap;
import java.io.IOException;

/**
 * CreateMapRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T00:56:01.025+01:00[Europe/Berlin]")
public class CreateMapRequest {
  public static final String SERIALIZED_NAME_MAP = "map";
  @SerializedName(SERIALIZED_NAME_MAP)
  private RoadMap map;


  public CreateMapRequest map(RoadMap map) {
    
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

