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
 * PluginMount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginMount {

  private String name;

  private String description;

  @Valid
  private List<String> settable = new ArrayList<>();

  private String source;

  private String destination;

  private String type;

  @Valid
  private List<String> options = new ArrayList<>();

  public PluginMount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginMount(String name, String description, List<String> settable, String source, String destination, String type, List<String> options) {
    this.name = name;
    this.description = description;
    this.settable = settable;
    this.source = source;
    this.destination = destination;
    this.type = type;
    this.options = options;
  }

  public PluginMount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "some-mount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PluginMount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "Description", example = "This is a mount that's used by the plugin.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginMount settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PluginMount addSettableItem(String settableItem) {
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

  public PluginMount source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @NotNull 
  @Schema(name = "Source", example = "/var/lib/docker/plugins/", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PluginMount destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @NotNull 
  @Schema(name = "Destination", example = "/mnt/state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public PluginMount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "Type", example = "bind", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PluginMount options(List<String> options) {
    this.options = options;
    return this;
  }

  public PluginMount addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @NotNull 
  @Schema(name = "Options", example = "[rbind, rw]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Options")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
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
    PluginMount pluginMount = (PluginMount) o;
    return Objects.equals(this.name, pluginMount.name) &&
        Objects.equals(this.description, pluginMount.description) &&
        Objects.equals(this.settable, pluginMount.settable) &&
        Objects.equals(this.source, pluginMount.source) &&
        Objects.equals(this.destination, pluginMount.destination) &&
        Objects.equals(this.type, pluginMount.type) &&
        Objects.equals(this.options, pluginMount.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, source, destination, type, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginMount {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

