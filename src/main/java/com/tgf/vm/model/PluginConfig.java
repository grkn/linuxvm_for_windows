package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.PluginConfigArgs;
import com.tgf.vm.model.PluginConfigInterface;
import com.tgf.vm.model.PluginConfigLinux;
import com.tgf.vm.model.PluginConfigNetwork;
import com.tgf.vm.model.PluginConfigRootfs;
import com.tgf.vm.model.PluginConfigUser;
import com.tgf.vm.model.PluginEnv;
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
 * The config of a plugin.
 */

@Schema(name = "Plugin_Config", description = "The config of a plugin.")
@JsonTypeName("Plugin_Config")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfig {

  private String dockerVersion;

  private String description;

  private String documentation;

  private PluginConfigInterface _interface;

  @Valid
  private List<String> entrypoint = new ArrayList<>();

  private String workDir;

  private PluginConfigUser user;

  private PluginConfigNetwork network;

  private PluginConfigLinux linux;

  private String propagatedMount;

  private Boolean ipcHost;

  private Boolean pidHost;

  @Valid
  private List<@Valid PluginMount> mounts = new ArrayList<>();

  @Valid
  private List<@Valid PluginEnv> env = new ArrayList<>();

  private PluginConfigArgs args;

  private PluginConfigRootfs rootfs;

  public PluginConfig() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginConfig(String description, String documentation, PluginConfigInterface _interface, List<String> entrypoint, String workDir, PluginConfigNetwork network, PluginConfigLinux linux, String propagatedMount, Boolean ipcHost, Boolean pidHost, List<@Valid PluginMount> mounts, List<@Valid PluginEnv> env, PluginConfigArgs args) {
    this.description = description;
    this.documentation = documentation;
    this._interface = _interface;
    this.entrypoint = entrypoint;
    this.workDir = workDir;
    this.network = network;
    this.linux = linux;
    this.propagatedMount = propagatedMount;
    this.ipcHost = ipcHost;
    this.pidHost = pidHost;
    this.mounts = mounts;
    this.env = env;
    this.args = args;
  }

  public PluginConfig dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * Docker Version used to create the plugin
   * @return dockerVersion
  */
  
  @Schema(name = "DockerVersion", example = "17.06.0-ce", description = "Docker Version used to create the plugin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DockerVersion")
  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }

  public PluginConfig description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "Description", example = "A sample volume plugin for Docker", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginConfig documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
  */
  @NotNull 
  @Schema(name = "Documentation", example = "https://docs.docker.com/engine/extend/plugins/", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Documentation")
  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public PluginConfig _interface(PluginConfigInterface _interface) {
    this._interface = _interface;
    return this;
  }

  /**
   * Get _interface
   * @return _interface
  */
  @NotNull @Valid 
  @Schema(name = "Interface", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Interface")
  public PluginConfigInterface getInterface() {
    return _interface;
  }

  public void setInterface(PluginConfigInterface _interface) {
    this._interface = _interface;
  }

  public PluginConfig entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public PluginConfig addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * Get entrypoint
   * @return entrypoint
  */
  @NotNull 
  @Schema(name = "Entrypoint", example = "[/usr/bin/sample-volume-plugin, /data]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Entrypoint")
  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }

  public PluginConfig workDir(String workDir) {
    this.workDir = workDir;
    return this;
  }

  /**
   * Get workDir
   * @return workDir
  */
  @NotNull 
  @Schema(name = "WorkDir", example = "/bin/", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("WorkDir")
  public String getWorkDir() {
    return workDir;
  }

  public void setWorkDir(String workDir) {
    this.workDir = workDir;
  }

  public PluginConfig user(PluginConfigUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public PluginConfigUser getUser() {
    return user;
  }

  public void setUser(PluginConfigUser user) {
    this.user = user;
  }

  public PluginConfig network(PluginConfigNetwork network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
  */
  @NotNull @Valid 
  @Schema(name = "Network", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Network")
  public PluginConfigNetwork getNetwork() {
    return network;
  }

  public void setNetwork(PluginConfigNetwork network) {
    this.network = network;
  }

  public PluginConfig linux(PluginConfigLinux linux) {
    this.linux = linux;
    return this;
  }

  /**
   * Get linux
   * @return linux
  */
  @NotNull @Valid 
  @Schema(name = "Linux", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Linux")
  public PluginConfigLinux getLinux() {
    return linux;
  }

  public void setLinux(PluginConfigLinux linux) {
    this.linux = linux;
  }

  public PluginConfig propagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
    return this;
  }

  /**
   * Get propagatedMount
   * @return propagatedMount
  */
  @NotNull 
  @Schema(name = "PropagatedMount", example = "/mnt/volumes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PropagatedMount")
  public String getPropagatedMount() {
    return propagatedMount;
  }

  public void setPropagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
  }

  public PluginConfig ipcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
    return this;
  }

  /**
   * Get ipcHost
   * @return ipcHost
  */
  @NotNull 
  @Schema(name = "IpcHost", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("IpcHost")
  public Boolean getIpcHost() {
    return ipcHost;
  }

  public void setIpcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
  }

  public PluginConfig pidHost(Boolean pidHost) {
    this.pidHost = pidHost;
    return this;
  }

  /**
   * Get pidHost
   * @return pidHost
  */
  @NotNull 
  @Schema(name = "PidHost", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PidHost")
  public Boolean getPidHost() {
    return pidHost;
  }

  public void setPidHost(Boolean pidHost) {
    this.pidHost = pidHost;
  }

  public PluginConfig mounts(List<@Valid PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginConfig addMountsItem(PluginMount mountsItem) {
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

  public PluginConfig env(List<@Valid PluginEnv> env) {
    this.env = env;
    return this;
  }

  public PluginConfig addEnvItem(PluginEnv envItem) {
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
  @NotNull @Valid 
  @Schema(name = "Env", example = "[{Name=DEBUG, Description=If set, prints debug messages, Value=0}]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Env")
  public List<@Valid PluginEnv> getEnv() {
    return env;
  }

  public void setEnv(List<@Valid PluginEnv> env) {
    this.env = env;
  }

  public PluginConfig args(PluginConfigArgs args) {
    this.args = args;
    return this;
  }

  /**
   * Get args
   * @return args
  */
  @NotNull @Valid 
  @Schema(name = "Args", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Args")
  public PluginConfigArgs getArgs() {
    return args;
  }

  public void setArgs(PluginConfigArgs args) {
    this.args = args;
  }

  public PluginConfig rootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
    return this;
  }

  /**
   * Get rootfs
   * @return rootfs
  */
  @Valid 
  @Schema(name = "rootfs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootfs")
  public PluginConfigRootfs getRootfs() {
    return rootfs;
  }

  public void setRootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfig pluginConfig = (PluginConfig) o;
    return Objects.equals(this.dockerVersion, pluginConfig.dockerVersion) &&
        Objects.equals(this.description, pluginConfig.description) &&
        Objects.equals(this.documentation, pluginConfig.documentation) &&
        Objects.equals(this._interface, pluginConfig._interface) &&
        Objects.equals(this.entrypoint, pluginConfig.entrypoint) &&
        Objects.equals(this.workDir, pluginConfig.workDir) &&
        Objects.equals(this.user, pluginConfig.user) &&
        Objects.equals(this.network, pluginConfig.network) &&
        Objects.equals(this.linux, pluginConfig.linux) &&
        Objects.equals(this.propagatedMount, pluginConfig.propagatedMount) &&
        Objects.equals(this.ipcHost, pluginConfig.ipcHost) &&
        Objects.equals(this.pidHost, pluginConfig.pidHost) &&
        Objects.equals(this.mounts, pluginConfig.mounts) &&
        Objects.equals(this.env, pluginConfig.env) &&
        Objects.equals(this.args, pluginConfig.args) &&
        Objects.equals(this.rootfs, pluginConfig.rootfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerVersion, description, documentation, _interface, entrypoint, workDir, user, network, linux, propagatedMount, ipcHost, pidHost, mounts, env, args, rootfs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfig {\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
    sb.append("    propagatedMount: ").append(toIndentedString(propagatedMount)).append("\n");
    sb.append("    ipcHost: ").append(toIndentedString(ipcHost)).append("\n");
    sb.append("    pidHost: ").append(toIndentedString(pidHost)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
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

