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
import it.tramways.projects.api.v1.model.Distribution;
import it.tramways.projects.api.v1.model.ExponentialDistribution;
import it.tramways.projects.api.v1.model.ExponentialDistributionAllOf;
import it.tramways.projects.api.v1.model.UniformDistribution;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ExponentialDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T22:49:26.797120+02:00[Europe/Rome]")
public class ExponentialDistribution extends Distribution {
  public static final String SERIALIZED_NAME_LAMBDA = "lambda";
  @SerializedName(SERIALIZED_NAME_LAMBDA)
  private BigDecimal lambda;

  public ExponentialDistribution() {
    this.distributionType = this.getClass().getSimpleName();
  }

  public ExponentialDistribution lambda(BigDecimal lambda) {
    
    this.lambda = lambda;
    return this;
  }

   /**
   * Get lambda
   * @return lambda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLambda() {
    return lambda;
  }


  public void setLambda(BigDecimal lambda) {
    this.lambda = lambda;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExponentialDistribution exponentialDistribution = (ExponentialDistribution) o;
    return Objects.equals(this.lambda, exponentialDistribution.lambda) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lambda, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExponentialDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lambda: ").append(toIndentedString(lambda)).append("\n");
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

