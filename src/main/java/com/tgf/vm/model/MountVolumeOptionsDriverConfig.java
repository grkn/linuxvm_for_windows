package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Map of driver specific options
 */

@Schema(name = "Mount_VolumeOptions_DriverConfig", description = "Map of driver specific options")
@JsonTypeName("Mount_VolumeOptions_DriverConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class MountVolumeOptionsDriverConfig {

  private String name;

  @Valid
  private Map<String, String> options = new HashMap<>();

  public MountVolumeOptionsDriverConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the driver to use to create the volume.
   * @return name
  */
  
  @Schema(name = "Name", description = "Name of the driver to use to create the volume.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MountVolumeOptionsDriverConfig options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public MountVolumeOptionsDriverConfig putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * key/value map of driver specific options.
   * @return options
  */
  
  @Schema(name = "Options", description = "key/value map of driver specific options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountVolumeOptionsDriverConfig mountVolumeOptionsDriverConfig = (MountVolumeOptionsDriverConfig) o;
    return Objects.equals(this.name, mountVolumeOptionsDriverConfig.name) &&
        Objects.equals(this.options, mountVolumeOptionsDriverConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountVolumeOptionsDriverConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

