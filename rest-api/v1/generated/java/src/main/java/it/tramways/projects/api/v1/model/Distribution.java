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
import it.tramways.projects.api.v1.model.ExponentialDistribution;
import it.tramways.projects.api.v1.model.UniformDistribution;
import java.io.IOException;

/**
 * Distribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T00:56:01.025+01:00[Europe/Berlin]")
public class Distribution {
  public static final String SERIALIZED_NAME_DISTRIBUTION_TYPE = "distributionType";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_TYPE)
  protected String distributionType;

  public Distribution() {
    this.distributionType = this.getClass().getSimpleName();
  }

  public Distribution distributionType(String distributionType) {
    
    this.distributionType = distributionType;
    return this;
  }

   /**
   * Get distributionType
   * @return distributionType
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDistributionType() {
    return distributionType;
  }


  public void setDistributionType(String distributionType) {
    this.distributionType = distributionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.distributionType, distribution.distributionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    sb.append("    distributionType: ").append(toIndentedString(distributionType)).append("\n");
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

