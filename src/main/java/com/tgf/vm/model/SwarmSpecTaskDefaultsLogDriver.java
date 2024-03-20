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
 * The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated. 
 */

@Schema(name = "SwarmSpec_TaskDefaults_LogDriver", description = "The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated. ")
@JsonTypeName("SwarmSpec_TaskDefaults_LogDriver")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecTaskDefaultsLogDriver {

  private String name;

  @Valid
  private Map<String, String> options = new HashMap<>();

  public SwarmSpecTaskDefaultsLogDriver name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The log driver to use as a default for new tasks. 
   * @return name
  */
  
  @Schema(name = "Name", example = "json-file", description = "The log driver to use as a default for new tasks. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwarmSpecTaskDefaultsLogDriver options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public SwarmSpecTaskDefaultsLogDriver putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options for the selectd log driver, specified as key/value pairs. 
   * @return options
  */
  
  @Schema(name = "Options", example = "{\"max-file\":\"10\",\"max-size\":\"100m\"}", description = "Driver-specific options for the selectd log driver, specified as key/value pairs. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SwarmSpecTaskDefaultsLogDriver swarmSpecTaskDefaultsLogDriver = (SwarmSpecTaskDefaultsLogDriver) o;
    return Objects.equals(this.name, swarmSpecTaskDefaultsLogDriver.name) &&
        Objects.equals(this.options, swarmSpecTaskDefaultsLogDriver.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecTaskDefaultsLogDriver {\n");
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

