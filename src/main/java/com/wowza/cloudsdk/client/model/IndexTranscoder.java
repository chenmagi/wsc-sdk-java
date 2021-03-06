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
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class IndexTranscoder {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The method by which the transcoder was created, either &lt;strong&gt;transcoder&lt;/strong&gt; for a transcoder created through the transcoder workflow or &lt;strong&gt;live_stream&lt;/strong&gt; for a transcoder created automatically as part of the live stream workflow.
   */
  @JsonAdapter(WorkflowEnum.Adapter.class)
  public enum WorkflowEnum {
    LIVE_STREAM("live_stream"),
    
    TRANSCODER("transcoder");

    private String value;

    WorkflowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowEnum fromValue(String text) {
      for (WorkflowEnum b : WorkflowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WorkflowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorkflowEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("workflow")
  private WorkflowEnum workflow = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public IndexTranscoder createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the transcoder was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the transcoder was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IndexTranscoder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the transcoder.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the transcoder.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IndexTranscoder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the transcoder. Maximum 200 characters.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the transcoder. Maximum 200 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndexTranscoder workflow(WorkflowEnum workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * The method by which the transcoder was created, either &lt;strong&gt;transcoder&lt;/strong&gt; for a transcoder created through the transcoder workflow or &lt;strong&gt;live_stream&lt;/strong&gt; for a transcoder created automatically as part of the live stream workflow.
   * @return workflow
  **/
  @ApiModelProperty(example = "", value = "The method by which the transcoder was created, either <strong>transcoder</strong> for a transcoder created through the transcoder workflow or <strong>live_stream</strong> for a transcoder created automatically as part of the live stream workflow.")
  public WorkflowEnum getWorkflow() {
    return workflow;
  }

  public void setWorkflow(WorkflowEnum workflow) {
    this.workflow = workflow;
  }

  public IndexTranscoder updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the transcoder was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the transcoder was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexTranscoder indexTranscoder = (IndexTranscoder) o;
    return Objects.equals(this.createdAt, indexTranscoder.createdAt) &&
        Objects.equals(this.id, indexTranscoder.id) &&
        Objects.equals(this.name, indexTranscoder.name) &&
        Objects.equals(this.workflow, indexTranscoder.workflow) &&
        Objects.equals(this.updatedAt, indexTranscoder.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, workflow, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexTranscoder {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

