package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.Configurable;
import it.tramways.projects.api.v1.model.CrossingLink;
import it.tramways.projects.api.v1.model.Property;
import it.tramways.projects.api.v1.model.RelevantPointAllOf;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelevantPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-09T23:31:59.430+02:00[Europe/Berlin]")
public class RelevantPoint extends Configurable  {
  @JsonProperty("links")
  @Valid
  private List<CrossingLink> links = null;

  public RelevantPoint links(List<CrossingLink> links) {
    this.links = links;
    return this;
  }

  public RelevantPoint addLinksItem(CrossingLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

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

