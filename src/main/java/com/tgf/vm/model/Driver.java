package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Driver represents a driver (network, logging, secrets).
 */

@Schema(name = "Driver", description = "Driver represents a driver (network, logging, secrets).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Driver {

  private String name;

  @Valid
  private Map<String, String> options = new HashMap<>();

  public Driver() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Driver(String name) {
    this.name = name;
  }

  public Driver name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the driver.
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "some-driver", description = "Name of the driver.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Driver options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Driver putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Key/value map of driver-specific options.
   * @return options
  */
  
  @Schema(name = "Options", example = "{\"OptionA\":\"value for driver-specific option A\",\"OptionB\":\"value for driver-specific option B\"}", description = "Key/value map of driver-specific options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Driver driver = (Driver) o;
    return Objects.equals(this.name, driver.name) &&
        Objects.equals(this.options, driver.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
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

