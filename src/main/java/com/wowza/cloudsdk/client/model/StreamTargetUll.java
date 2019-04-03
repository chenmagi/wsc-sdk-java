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
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value ="com.wowza.cloudsdk.JavaCreate", date = "2019-03-02T10:45:24.077Z")
public class StreamTargetUll {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("connection_code")
  private String connectionCode = null;

  @SerializedName("connection_code_expires_at")
  private OffsetDateTime connectionCodeExpiresAt = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("enable_hls")
  private Boolean enableHls = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ingest_ip_whitelist")
  private List<String> ingestIpWhitelist = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("playback_urls")
  private HashMap<String,List<String>> playbackUrls = null;

  @SerializedName("primary_url")
  private String primaryUrl = null;

  /**
   * Only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **pull**. The location of the ultra low latency stream target&#39;s origin server. If unspecified, Wowza Streaming Cloud determines the optimal region for the origin server.
   */
  @JsonAdapter(RegionOverrideEnum.Adapter.class)
  public enum RegionOverrideEnum {
    ORIGIN_NL_CENTRAL1_CDN_WOWZA_COM("origin-nl-central1.cdn.wowza.com"),
    
    ORIGIN_US_CENTRAL2_CDN_WOWZA_COM("origin-us-central2.cdn.wowza.com"),
    
    ORIGIN_IN_WEST1_CDN_WOWZA_COM("origin-in-west1.cdn.wowza.com"),
    
    ORIGIN_HK_CENTRAL1_CDN_WOWZA_COM("origin-hk-central1.cdn.wowza.com"),
    
    ORIGIN_JP_EAST1_CDN_WOWZA_COM("origin-jp-east1.cdn.wowza.com"),
    
    NULL("null");

    private String value;

    RegionOverrideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegionOverrideEnum fromValue(String text) {
      for (RegionOverrideEnum b : RegionOverrideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RegionOverrideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegionOverrideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegionOverrideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegionOverrideEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("region_override")
  private RegionOverrideEnum regionOverride = null;

  /**
   * The type of connection between the stream source and the ultra low latency stream target. **push** instructs the source to push the stream to the stream target. **pull** instructs the stream target to pull the stream from the source.
   */
  @JsonAdapter(SourceDeliveryMethodEnum.Adapter.class)
  public enum SourceDeliveryMethodEnum {
    PUSH("push"),
    
    PULL("pull");

    private String value;

    SourceDeliveryMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceDeliveryMethodEnum fromValue(String text) {
      for (SourceDeliveryMethodEnum b : SourceDeliveryMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceDeliveryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceDeliveryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceDeliveryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceDeliveryMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source_delivery_method")
  private SourceDeliveryMethodEnum sourceDeliveryMethod = null;

  @SerializedName("source_url")
  private String sourceUrl = null;

  /**
   * The state of the ultra low latency stream target.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    STARTED("started"),
    
    STOPPED("stopped"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("stream_name")
  private String streamName = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public StreamTargetUll createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the ultra low latency stream target was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the ultra low latency stream target was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StreamTargetUll connectionCode(String connectionCode) {
    this.connectionCode = connectionCode;
    return this;
  }

   /**
   * A six-character, alphanumeric string that allows the Wowza GoCoder app to send an encoded stream to an ultra low latency stream target. The code can be used once and expires 24 hours after it&#39;s created.
   * @return connectionCode
  **/
  @ApiModelProperty(example = "2bbeaf", value = "A six-character, alphanumeric string that allows the Wowza GoCoder app to send an encoded stream to an ultra low latency stream target. The code can be used once and expires 24 hours after it's created.")
  public String getConnectionCode() {
    return connectionCode;
  }

  public void setConnectionCode(String connectionCode) {
    this.connectionCode = connectionCode;
  }

  public StreamTargetUll connectionCodeExpiresAt(OffsetDateTime connectionCodeExpiresAt) {
    this.connectionCodeExpiresAt = connectionCodeExpiresAt;
    return this;
  }

   /**
   * The date and time that the &lt;em&gt;connection_code&lt;/em&gt; expires.
   * @return connectionCodeExpiresAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the <em>connection_code</em> expires.")
  public OffsetDateTime getConnectionCodeExpiresAt() {
    return connectionCodeExpiresAt;
  }

  public void setConnectionCodeExpiresAt(OffsetDateTime connectionCodeExpiresAt) {
    this.connectionCodeExpiresAt = connectionCodeExpiresAt;
  }

  public StreamTargetUll enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If &lt;strong&gt;true&lt;/strong&gt; (the default), the source stream is ready to be ingested. If **false**, the source stream won&#39;t be ingested by the target&#39;s origin server.
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "If <strong>true</strong> (the default), the source stream is ready to be ingested. If **false**, the source stream won't be ingested by the target's origin server.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public StreamTargetUll enableHls(Boolean enableHls) {
    this.enableHls = enableHls;
    return this;
  }

   /**
   * If &lt;strong&gt;true&lt;/strong&gt;, creates an Apple HLS URL for playback on iOS devices. The default is &lt;strong&gt;false&lt;/strong&gt;. The HLS stream has the &lt;strong&gt;convertAMFData&lt;/strong&gt; stream target property enabled by default.
   * @return enableHls
  **/
  @ApiModelProperty(example = "true", value = "If <strong>true</strong>, creates an Apple HLS URL for playback on iOS devices. The default is <strong>false</strong>. The HLS stream has the <strong>convertAMFData</strong> stream target property enabled by default.")
  public Boolean isEnableHls() {
    return enableHls;
  }

  public void setEnableHls(Boolean enableHls) {
    this.enableHls = enableHls;
  }

  public StreamTargetUll id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the ultra low latency stream target.
   * @return id
  **/
  @ApiModelProperty(example = "1234abcd", value = "The unique alphanumeric string that identifies the ultra low latency stream target.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StreamTargetUll ingestIpWhitelist(List<String> ingestIpWhitelist) {
    this.ingestIpWhitelist = ingestIpWhitelist;
    return this;
  }

  public StreamTargetUll addIngestIpWhitelistItem(String ingestIpWhitelistItem) {
    if (this.ingestIpWhitelist == null) {
      this.ingestIpWhitelist = new ArrayList<String>();
    }
    this.ingestIpWhitelist.add(ingestIpWhitelistItem);
    return this;
  }

   /**
   * Only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **push**. An array  of IP addresses in dot-decimal notation that can be used to connect to the target&#39;s origin server. Wildcards (*) are accepted for the final value in the IP address only.
   * @return ingestIpWhitelist
  **/
  @ApiModelProperty(example = "[\"10.11.12.*\",\"13.12.11.10\"]", value = "Only for ultra low latency stream targets whose <em>source_delivery_method</em> is **push**. An array  of IP addresses in dot-decimal notation that can be used to connect to the target's origin server. Wildcards (*) are accepted for the final value in the IP address only.")
  public List<String> getIngestIpWhitelist() {
    return ingestIpWhitelist;
  }

  public void setIngestIpWhitelist(List<String> ingestIpWhitelist) {
    this.ingestIpWhitelist = ingestIpWhitelist;
  }

  public StreamTargetUll name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the ultra low latency stream target. Maximum 255 characters.
   * @return name
  **/
  @ApiModelProperty(example = "My Ultra Low Latency Stream Target", value = "A descriptive name for the ultra low latency stream target. Maximum 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StreamTargetUll playbackUrls(HashMap<String,List<String>> playbackUrls) {
    this.playbackUrls = playbackUrls;
    return this;
  }

   /**
   * Get playbackUrls
   * @return playbackUrls
  **/
  @ApiModelProperty(value = "")
  public HashMap<String,List<String>> getPlaybackUrls() {
    return playbackUrls;
  }

  public void setPlaybackUrls(HashMap<String,List<String>> playbackUrls) {
    this.playbackUrls = playbackUrls;
  }
  public StreamTargetUll addPlaybackUrlsItem(String name,String playbackUrlsItem) {
    if (this.playbackUrls == null) {
      this.playbackUrls = new HashMap<String,List<String>>();
    }
        if ( !this.playbackUrls.containsKey(name) )
                {
                List<String> newList = new ArrayList<String>();
                newList.add(playbackUrlsItem);
                this.playbackUrls.put(name,newList);
                }
        else
                {
                List<String> current = this.playbackUrls.get(name);
                current.add(playbackUrlsItem);
                this.playbackUrls.put(name,current);
                }
    return this;
  }


  public StreamTargetUll primaryUrl(String primaryUrl) {
    this.primaryUrl = primaryUrl;
    return this;
  }

   /**
   * Only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **push**.The primary ingest URL of the target.
   * @return primaryUrl
  **/
  @ApiModelProperty(example = "rtmp://origin-subdomain.cdn.wowza.com:1935/live/0I0q1bjZhRzZtfSdv4TpCnlmwQT16239", value = "Only for ultra low latency stream targets whose <em>source_delivery_method</em> is **push**.The primary ingest URL of the target.")
  public String getPrimaryUrl() {
    return primaryUrl;
  }

  public void setPrimaryUrl(String primaryUrl) {
    this.primaryUrl = primaryUrl;
  }

  public StreamTargetUll regionOverride(RegionOverrideEnum regionOverride) {
    this.regionOverride = regionOverride;
    return this;
  }

   /**
   * Only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **pull**. The location of the ultra low latency stream target&#39;s origin server. If unspecified, Wowza Streaming Cloud determines the optimal region for the origin server.
   * @return regionOverride
  **/
  @ApiModelProperty(example = "origin-nl-central1.cdn.wowza.com", value = "Only for ultra low latency stream targets whose <em>source_delivery_method</em> is **pull**. The location of the ultra low latency stream target's origin server. If unspecified, Wowza Streaming Cloud determines the optimal region for the origin server.")
  public RegionOverrideEnum getRegionOverride() {
    return regionOverride;
  }

  public void setRegionOverride(RegionOverrideEnum regionOverride) {
    this.regionOverride = regionOverride;
  }

  public StreamTargetUll sourceDeliveryMethod(SourceDeliveryMethodEnum sourceDeliveryMethod) {
    this.sourceDeliveryMethod = sourceDeliveryMethod;
    return this;
  }

   /**
   * The type of connection between the stream source and the ultra low latency stream target. **push** instructs the source to push the stream to the stream target. **pull** instructs the stream target to pull the stream from the source.
   * @return sourceDeliveryMethod
  **/
  @ApiModelProperty(example = "pull", value = "The type of connection between the stream source and the ultra low latency stream target. **push** instructs the source to push the stream to the stream target. **pull** instructs the stream target to pull the stream from the source.")
  public SourceDeliveryMethodEnum getSourceDeliveryMethod() {
    return sourceDeliveryMethod;
  }

  public void setSourceDeliveryMethod(SourceDeliveryMethodEnum sourceDeliveryMethod) {
    this.sourceDeliveryMethod = sourceDeliveryMethod;
  }

  public StreamTargetUll sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **pull**. The URL of a source IP camera or encoder connecting to the stream target.
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "rtsp://example.com/video", value = "Only for ultra low latency stream targets whose <em>source_delivery_method</em> is **pull**. The URL of a source IP camera or encoder connecting to the stream target.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public StreamTargetUll state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the ultra low latency stream target.
   * @return state
  **/
  @ApiModelProperty(example = "stopped", value = "The state of the ultra low latency stream target.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public StreamTargetUll streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * The name of the stream being ingested into the target. Returned only for ultra low latency stream targets whose &lt;em&gt;source_delivery_method&lt;/em&gt; is **push**.
   * @return streamName
  **/
  @ApiModelProperty(example = "0I0q1bjZhRzZtfSdv4TpCnlmwQT16239", value = "The name of the stream being ingested into the target. Returned only for ultra low latency stream targets whose <em>source_delivery_method</em> is **push**.")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public StreamTargetUll updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the ultra low latency stream target was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the ultra low latency stream target was updated.")
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
    StreamTargetUll streamTargetUll = (StreamTargetUll) o;
    return Objects.equals(this.createdAt, streamTargetUll.createdAt) &&
        Objects.equals(this.connectionCode, streamTargetUll.connectionCode) &&
        Objects.equals(this.connectionCodeExpiresAt, streamTargetUll.connectionCodeExpiresAt) &&
        Objects.equals(this.enabled, streamTargetUll.enabled) &&
        Objects.equals(this.enableHls, streamTargetUll.enableHls) &&
        Objects.equals(this.id, streamTargetUll.id) &&
        Objects.equals(this.ingestIpWhitelist, streamTargetUll.ingestIpWhitelist) &&
        Objects.equals(this.name, streamTargetUll.name) &&
        Objects.equals(this.playbackUrls, streamTargetUll.playbackUrls) &&
        Objects.equals(this.primaryUrl, streamTargetUll.primaryUrl) &&
        Objects.equals(this.regionOverride, streamTargetUll.regionOverride) &&
        Objects.equals(this.sourceDeliveryMethod, streamTargetUll.sourceDeliveryMethod) &&
        Objects.equals(this.sourceUrl, streamTargetUll.sourceUrl) &&
        Objects.equals(this.state, streamTargetUll.state) &&
        Objects.equals(this.streamName, streamTargetUll.streamName) &&
        Objects.equals(this.updatedAt, streamTargetUll.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, connectionCode, connectionCodeExpiresAt, enabled, enableHls, id, ingestIpWhitelist, name, playbackUrls, primaryUrl, regionOverride, sourceDeliveryMethod, sourceUrl, state, streamName, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamTargetUll {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    connectionCode: ").append(toIndentedString(connectionCode)).append("\n");
    sb.append("    connectionCodeExpiresAt: ").append(toIndentedString(connectionCodeExpiresAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enableHls: ").append(toIndentedString(enableHls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestIpWhitelist: ").append(toIndentedString(ingestIpWhitelist)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    playbackUrls: ").append(toIndentedString(playbackUrls)).append("\n");
    sb.append("    primaryUrl: ").append(toIndentedString(primaryUrl)).append("\n");
    sb.append("    regionOverride: ").append(toIndentedString(regionOverride)).append("\n");
    sb.append("    sourceDeliveryMethod: ").append(toIndentedString(sourceDeliveryMethod)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
