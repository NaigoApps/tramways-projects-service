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
import it.tramways.projects.api.v1.model.ChoiceProperty;
import it.tramways.projects.api.v1.model.DecimalProperty;
import it.tramways.projects.api.v1.model.DistributionProperty;
import it.tramways.projects.api.v1.model.IntegerProperty;
import it.tramways.projects.api.v1.model.StringProperty;
import java.io.IOException;

/**
 * Property
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T00:56:01.025+01:00[Europe/Berlin]")
public class Property {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROPERTY_TYPE = "propertyType";
  @SerializedName(SERIALIZED_NAME_PROPERTY_TYPE)
  protected String propertyType;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public Property() {
    this.propertyType = this.getClass().getSimpleName();
  }

  public Property name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Property description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Property propertyType(String propertyType) {
    
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Get propertyType
   * @return propertyType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPropertyType() {
    return propertyType;
  }


  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  public Property valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.name, property.name) &&
        Objects.equals(this.description, property.description) &&
        Objects.equals(this.propertyType, property.propertyType) &&
        Objects.equals(this.valid, property.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, propertyType, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

