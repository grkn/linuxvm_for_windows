package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PluginDevice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginDevice {

  private String name;

  private String description;

  @Valid
  private List<String> settable = new ArrayList<>();

  private String path;

  public PluginDevice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginDevice(String name, String description, List<String> settable, String path) {
    this.name = name;
    this.description = description;
    this.settable = settable;
    this.path = path;
  }

  public PluginDevice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PluginDevice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginDevice settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PluginDevice addSettableItem(String settableItem) {
    if (this.settable == null) {
      this.settable = new ArrayList<>();
    }
    this.settable.add(settableItem);
    return this;
  }

  /**
   * Get settable
   * @return settable
  */
  @NotNull 
  @Schema(name = "Settable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Settable")
  public List<String> getSettable() {
    return settable;
  }

  public void setSettable(List<String> settable) {
    this.settable = settable;
  }

  public PluginDevice path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", example = "/dev/fuse", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginDevice pluginDevice = (PluginDevice) o;
    return Objects.equals(this.name, pluginDevice.name) &&
        Objects.equals(this.description, pluginDevice.description) &&
        Objects.equals(this.settable, pluginDevice.settable) &&
        Objects.equals(this.path, pluginDevice.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginDevice {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

