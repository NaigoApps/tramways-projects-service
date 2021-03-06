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
import it.tramways.projects.api.v1.model.ChoiceElement;
import it.tramways.projects.api.v1.model.ChoicePropertyAllOf;
import it.tramways.projects.api.v1.model.Property;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ChoiceProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-09T23:32:03.721+02:00[Europe/Berlin]")
public class ChoiceProperty extends Property {
  public static final String SERIALIZED_NAME_CHOICES = "choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<ChoiceElement> choices = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ChoiceProperty() {
    this.propertyType = this.getClass().getSimpleName();
  }

  public ChoiceProperty choices(List<ChoiceElement> choices) {
    
    this.choices = choices;
    return this;
  }

  public ChoiceProperty addChoicesItem(ChoiceElement choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<ChoiceElement>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * Get choices
   * @return choices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChoiceElement> getChoices() {
    return choices;
  }


  public void setChoices(List<ChoiceElement> choices) {
    this.choices = choices;
  }


  public ChoiceProperty value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoiceProperty choiceProperty = (ChoiceProperty) o;
    return Objects.equals(this.choices, choiceProperty.choices) &&
        Objects.equals(this.value, choiceProperty.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

