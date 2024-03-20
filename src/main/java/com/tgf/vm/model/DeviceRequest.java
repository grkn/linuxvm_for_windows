package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A request for devices to be sent to device drivers
 */

@Schema(name = "DeviceRequest", description = "A request for devices to be sent to device drivers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class DeviceRequest {

  private String driver;

  private Integer count;

  @Valid
  private List<String> deviceIDs;

  @Valid
  private List<List<String>> capabilities;

  @Valid
  private Map<String, String> options = new HashMap<>();

  public DeviceRequest driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "Driver", example = "nvidia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public DeviceRequest count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "Count", example = "-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DeviceRequest deviceIDs(List<String> deviceIDs) {
    this.deviceIDs = deviceIDs;
    return this;
  }

  public DeviceRequest addDeviceIDsItem(String deviceIDsItem) {
    if (this.deviceIDs == null) {
      this.deviceIDs = new ArrayList<>();
    }
    this.deviceIDs.add(deviceIDsItem);
    return this;
  }

  /**
   * Get deviceIDs
   * @return deviceIDs
  */
  
  @Schema(name = "DeviceIDs", example = "[0, 1, GPU-fef8089b-4820-abfc-e83e-94318197576e]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceIDs")
  public List<String> getDeviceIDs() {
    return deviceIDs;
  }

  public void setDeviceIDs(List<String> deviceIDs) {
    this.deviceIDs = deviceIDs;
  }

  public DeviceRequest capabilities(List<List<String>> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public DeviceRequest addCapabilitiesItem(List<String> capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * A list of capabilities; an OR list of AND lists of capabilities. 
   * @return capabilities
  */
  @Valid 
  @Schema(name = "Capabilities", example = "[[gpu, nvidia, compute]]", description = "A list of capabilities; an OR list of AND lists of capabilities. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Capabilities")
  public List<List<String>> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<List<String>> capabilities) {
    this.capabilities = capabilities;
  }

  public DeviceRequest options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public DeviceRequest putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver. 
   * @return options
  */
  
  @Schema(name = "Options", description = "Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DeviceRequest deviceRequest = (DeviceRequest) o;
    return Objects.equals(this.driver, deviceRequest.driver) &&
        Objects.equals(this.count, deviceRequest.count) &&
        Objects.equals(this.deviceIDs, deviceRequest.deviceIDs) &&
        Objects.equals(this.capabilities, deviceRequest.capabilities) &&
        Objects.equals(this.options, deviceRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, count, deviceIDs, capabilities, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRequest {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceIDs: ").append(toIndentedString(deviceIDs)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

