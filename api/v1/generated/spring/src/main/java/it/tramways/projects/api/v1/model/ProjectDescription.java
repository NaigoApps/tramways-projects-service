package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-09T23:31:59.430+02:00[Europe/Berlin]")
public class ProjectDescription   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  public ProjectDescription uuid(String uuid) {
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

  public ProjectDescription name(String name) {
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

  public ProjectDescription owner(String owner) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDescription projectDescription = (ProjectDescription) o;
    return Objects.equals(this.uuid, projectDescription.uuid) &&
        Objects.equals(this.name, projectDescription.name) &&
        Objects.equals(this.owner, projectDescription.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDescription {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

