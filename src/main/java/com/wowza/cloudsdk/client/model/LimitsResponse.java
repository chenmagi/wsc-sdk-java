/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.wowza.cloudsdk.client.model.Limits;
import com.wowza.cloudsdk.client.model.ShmMetrics;
import java.io.IOException;

/**
 * LimitsResponse
 */
public class LimitsResponse {
  @SerializedName("current")
  private ShmMetrics current = null;

  @SerializedName("limits")
  private Limits limits = null;

  public LimitsResponse current(ShmMetrics current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(required = true, value = "")
  public ShmMetrics getCurrent() {
    return current;
  }

  public void setCurrent(ShmMetrics current) {
    this.current = current;
  }

  public LimitsResponse limits(Limits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "")
  public Limits getLimits() {
    return limits;
  }

  public void setLimits(Limits limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitsResponse inlineResponse20043 = (LimitsResponse) o;
    return Objects.equals(this.current, inlineResponse20043.current) &&
        Objects.equals(this.limits, inlineResponse20043.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitsResponse {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
