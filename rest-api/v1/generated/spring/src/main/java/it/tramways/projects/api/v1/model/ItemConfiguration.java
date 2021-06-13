package it.tramways.projects.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.projects.api.v1.model.Property;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItemConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-09T23:31:59.430+02:00[Europe/Berlin]")
public class ItemConfiguration   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("category")
  private String category;

  @JsonProperty("name")
  private String name;

  @JsonProperty("props")
  @Valid
  private List<Property> props = null;

  public ItemConfiguration uuid(String uuid) {
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

  public ItemConfiguration category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ItemConfiguration name(String name) {
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

  public ItemConfiguration props(List<Property> props) {
    this.props = props;
    return this;
  }

  public ItemConfiguration addPropsItem(Property propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<>();
    }
    this.props.add(propsItem);
    return this;
  }

  /**
   * Get props
   * @return props
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Property> getProps() {
    return props;
  }

  public void setProps(List<Property> props) {
    this.props = props;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemConfiguration itemConfiguration = (ItemConfiguration) o;
    return Objects.equals(this.uuid, itemConfiguration.uuid) &&
        Objects.equals(this.category, itemConfiguration.category) &&
        Objects.equals(this.name, itemConfiguration.name) &&
        Objects.equals(this.props, itemConfiguration.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, category, name, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemConfiguration {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

