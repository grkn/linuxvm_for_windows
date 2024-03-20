package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.ClusterVolume;
import com.tgf.vm.model.VolumeUsageData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Volume
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Volume {

  private String name;

  private String driver;

  private String mountpoint;

  private String createdAt;

  @Valid
  private Map<String, Object> status = new HashMap<>();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  /**
   * The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. 
   */
  public enum ScopeEnum {
    LOCAL("local"),
    
    GLOBAL("global");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ScopeEnum scope = ScopeEnum.LOCAL;

  private ClusterVolume clusterVolume;

  @Valid
  private Map<String, String> options = new HashMap<>();

  private JsonNullable<VolumeUsageData> usageData = JsonNullable.<VolumeUsageData>undefined();

  public Volume() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Volume(String name, String driver, String mountpoint, Map<String, String> labels, ScopeEnum scope, Map<String, String> options) {
    this.name = name;
    this.driver = driver;
    this.mountpoint = mountpoint;
    this.labels = labels;
    this.scope = scope;
    this.options = options;
  }

  public Volume name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the volume.
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "tardis", description = "Name of the volume.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Volume driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver used by the volume.
   * @return driver
  */
  @NotNull 
  @Schema(name = "Driver", example = "custom", description = "Name of the volume driver used by the volume.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public Volume mountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
    return this;
  }

  /**
   * Mount path of the volume on the host.
   * @return mountpoint
  */
  @NotNull 
  @Schema(name = "Mountpoint", example = "/var/lib/docker/volumes/tardis", description = "Mount path of the volume on the host.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Mountpoint")
  public String getMountpoint() {
    return mountpoint;
  }

  public void setMountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
  }

  public Volume createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date/Time the volume was created.
   * @return createdAt
  */
  
  @Schema(name = "CreatedAt", example = "2016-06-07T20:31:11.853781916Z", description = "Date/Time the volume was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Volume status(Map<String, Object> status) {
    this.status = status;
    return this;
  }

  public Volume putStatusItem(String key, Object statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

  /**
   * Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature. 
   * @return status
  */
  
  @Schema(name = "Status", example = "{\"hello\":\"world\"}", description = "Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public Map<String, Object> getStatus() {
    return status;
  }

  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }

  public Volume labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Volume putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @NotNull 
  @Schema(name = "Labels", example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public Volume scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. 
   * @return scope
  */
  @NotNull 
  @Schema(name = "Scope", example = "local", description = "The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public Volume clusterVolume(ClusterVolume clusterVolume) {
    this.clusterVolume = clusterVolume;
    return this;
  }

  /**
   * Get clusterVolume
   * @return clusterVolume
  */
  @Valid 
  @Schema(name = "ClusterVolume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClusterVolume")
  public ClusterVolume getClusterVolume() {
    return clusterVolume;
  }

  public void setClusterVolume(ClusterVolume clusterVolume) {
    this.clusterVolume = clusterVolume;
  }

  public Volume options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Volume putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * The driver specific options used when creating the volume. 
   * @return options
  */
  @NotNull 
  @Schema(name = "Options", example = "{\"device\":\"tmpfs\",\"o\":\"size=100m,uid=1000\",\"type\":\"tmpfs\"}", description = "The driver specific options used when creating the volume. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public Volume usageData(VolumeUsageData usageData) {
    this.usageData = JsonNullable.of(usageData);
    return this;
  }

  /**
   * Get usageData
   * @return usageData
  */
  @Valid 
  @Schema(name = "UsageData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UsageData")
  public JsonNullable<VolumeUsageData> getUsageData() {
    return usageData;
  }

  public void setUsageData(JsonNullable<VolumeUsageData> usageData) {
    this.usageData = usageData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.name, volume.name) &&
        Objects.equals(this.driver, volume.driver) &&
        Objects.equals(this.mountpoint, volume.mountpoint) &&
        Objects.equals(this.createdAt, volume.createdAt) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.labels, volume.labels) &&
        Objects.equals(this.scope, volume.scope) &&
        Objects.equals(this.clusterVolume, volume.clusterVolume) &&
        Objects.equals(this.options, volume.options) &&
        equalsNullable(this.usageData, volume.usageData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, mountpoint, createdAt, status, labels, scope, clusterVolume, options, hashCodeNullable(usageData));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    clusterVolume: ").append(toIndentedString(clusterVolume)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    usageData: ").append(toIndentedString(usageData)).append("\n");
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

