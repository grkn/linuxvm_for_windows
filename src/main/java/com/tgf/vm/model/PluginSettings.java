package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.PluginDevice;
import com.tgf.vm.model.PluginMount;
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
 * Settings that can be modified by users.
 */

@Schema(name = "Plugin_Settings", description = "Settings that can be modified by users.")
@JsonTypeName("Plugin_Settings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginSettings {

  @Valid
  private List<@Valid PluginMount> mounts = new ArrayList<>();

  @Valid
  private List<String> env = new ArrayList<>();

  @Valid
  private List<String> args = new ArrayList<>();

  @Valid
  private List<@Valid PluginDevice> devices = new ArrayList<>();

  public PluginSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginSettings(List<@Valid PluginMount> mounts, List<String> env, List<String> args, List<@Valid PluginDevice> devices) {
    this.mounts = mounts;
    this.env = env;
    this.args = args;
    this.devices = devices;
  }

  public PluginSettings mounts(List<@Valid PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginSettings addMountsItem(PluginMount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
  */
  @NotNull @Valid 
  @Schema(name = "Mounts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Mounts")
  public List<@Valid PluginMount> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid PluginMount> mounts) {
    this.mounts = mounts;
  }

  public PluginSettings env(List<String> env) {
    this.env = env;
    return this;
  }

  public PluginSettings addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
  */
  @NotNull 
  @Schema(name = "Env", example = "[DEBUG=0]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Env")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public PluginSettings args(List<String> args) {
    this.args = args;
    return this;
  }

  public PluginSettings addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
  */
  @NotNull 
  @Schema(name = "Args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Args")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public PluginSettings devices(List<@Valid PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  public PluginSettings addDevicesItem(PluginDevice devicesItem) {
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
    PluginSettings pluginSettings = (PluginSettings) o;
    return Objects.equals(this.mounts, pluginSettings.mounts) &&
        Objects.equals(this.env, pluginSettings.env) &&
        Objects.equals(this.args, pluginSettings.args) &&
        Objects.equals(this.devices, pluginSettings.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mounts, env, args, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginSettings {\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
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

