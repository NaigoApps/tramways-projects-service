/*
 * Tramways Roadmaps API
 * Tramways Roadmaps API
 *
 * The version of the OpenAPI document: 1.0.0
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
import it.tramways.projects.api.v1.model.Configurable;
import it.tramways.projects.api.v1.model.CrossingLink;
import it.tramways.projects.api.v1.model.Property;
import it.tramways.projects.api.v1.model.RelevantPointAllOf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RelevantPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-09T23:32:03.721+02:00[Europe/Berlin]")
public class RelevantPoint extends Configurable {
  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<CrossingLink> links = null;

  public RelevantPoint() {
    this.configurableType = this.getClass().getSimpleName();
  }

  public RelevantPoint links(List<CrossingLink> links) {
    
    this.links = links;
    return this;
  }

  public RelevantPoint addLinksItem(CrossingLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<CrossingLink>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CrossingLink> getLinks() {
    return links;
  }


  public void setLinks(List<CrossingLink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelevantPoint relevantPoint = (RelevantPoint) o;
    return Objects.equals(this.links, relevantPoint.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevantPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

