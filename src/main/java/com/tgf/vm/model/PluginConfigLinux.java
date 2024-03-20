package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.PluginDevice;
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
 * PluginConfigLinux
 */

@JsonTypeName("Plugin_Config_Linux")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfigLinux {

  @Valid
  private List<String> capabilities = new ArrayList<>();

  private Boolean allowAllDevices;

  @Valid
  private List<@Valid PluginDevice> devices = new ArrayList<>();

  public PluginConfigLinux() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginConfigLinux(List<String> capabilities, Boolean allowAllDevices, List<@Valid PluginDevice> devices) {
    this.capabilities = capabilities;
    this.allowAllDevices = allowAllDevices;
    this.devices = devices;
  }

  public PluginConfigLinux capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PluginConfigLinux addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  @NotNull 
  @Schema(name = "Capabilities", example = "[CAP_SYS_ADMIN, CAP_SYSLOG]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Capabilities")
  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public PluginConfigLinux allowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
    return this;
  }

  /**
   * Get allowAllDevices
   * @return allowAllDevices
  */
  @NotNull 
  @Schema(name = "AllowAllDevices", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AllowAllDevices")
  public Boolean getAllowAllDevices() {
    return allowAllDevices;
  }

  public void setAllowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
  }

  public PluginConfigLinux devices(List<@Valid PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  public PluginConfigLinux addDevicesItem(PluginDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Get devices
   * @return devices
  */
  @NotNull @Valid 
  @Schema(name = "Devices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Devices")
  public List<@Valid PluginDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid PluginDevice> devices) {
    this.devices = devices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigLinux pluginConfigLinux = (PluginConfigLinux) o;
    return Objects.equals(this.capabilities, pluginConfigLinux.capabilities) &&
        Objects.equals(this.allowAllDevices, pluginConfigLinux.allowAllDevices) &&
        Objects.equals(this.devices, pluginConfigLinux.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, allowAllDevices, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigLinux {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    allowAllDevices: ").append(toIndentedString(allowAllDevices)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

