package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.IPAMConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IPAM
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class IPAM {

  private String driver = "default";

  @Valid
  private List<@Valid IPAMConfig> config;

  @Valid
  private Map<String, String> options = new HashMap<>();

  public IPAM driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the IPAM driver to use.
   * @return driver
  */
  
  @Schema(name = "Driver", description = "Name of the IPAM driver to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public IPAM config(List<@Valid IPAMConfig> config) {
    this.config = config;
    return this;
  }

  public IPAM addConfigItem(IPAMConfig configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ``` 
   * @return config
  */
  @Valid 
  @Schema(name = "Config", description = "List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ``` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Config")
  public List<@Valid IPAMConfig> getConfig() {
    return config;
  }

  public void setConfig(List<@Valid IPAMConfig> config) {
    this.config = config;
  }

  public IPAM options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public IPAM putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options, specified as a map.
   * @return options
  */
  
  @Schema(name = "Options", description = "Driver-specific options, specified as a map.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IPAM IPAM = (IPAM) o;
    return Objects.equals(this.driver, IPAM.driver) &&
        Objects.equals(this.config, IPAM.config) &&
        Objects.equals(this.options, IPAM.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, config, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAM {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

