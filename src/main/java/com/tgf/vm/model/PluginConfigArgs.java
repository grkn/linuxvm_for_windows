package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * PluginConfigArgs
 */

@JsonTypeName("Plugin_Config_Args")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfigArgs {

  private String name;

  private String description;

  @Valid
  private List<String> settable = new ArrayList<>();

  @Valid
  private List<String> value = new ArrayList<>();

  public PluginConfigArgs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginConfigArgs(String name, String description, List<String> settable, List<String> value) {
    this.name = name;
    this.description = description;
    this.settable = settable;
    this.value = value;
  }

  public PluginConfigArgs name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PluginConfigArgs description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "Description", example = "command line arguments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginConfigArgs settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PluginConfigArgs addSettableItem(String settableItem) {
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

  public PluginConfigArgs value(List<String> value) {
    this.value = value;
    return this;
  }

  public PluginConfigArgs addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "Value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Value")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
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
    PluginConfigArgs pluginConfigArgs = (PluginConfigArgs) o;
    return Objects.equals(this.name, pluginConfigArgs.name) &&
        Objects.equals(this.description, pluginConfigArgs.description) &&
        Objects.equals(this.settable, pluginConfigArgs.settable) &&
        Objects.equals(this.value, pluginConfigArgs.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigArgs {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
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

