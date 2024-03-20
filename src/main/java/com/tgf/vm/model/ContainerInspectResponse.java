package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ContainerConfig;
import com.tgf.vm.model.ContainerState;
import com.tgf.vm.model.GraphDriverData;
import com.tgf.vm.model.HostConfig;
import com.tgf.vm.model.MountPoint;
import com.tgf.vm.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContainerInspectResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerInspectResponse {

  private String id;

  private String created;

  private String path;

  @Valid
  private List<String> args;

  private JsonNullable<ContainerState> state = JsonNullable.<ContainerState>undefined();

  private String image;

  private String resolvConfPath;

  private String hostnamePath;

  private String hostsPath;

  private String logPath;

  private String name;

  private Integer restartCount;

  private String driver;

  private String platform;

  private String mountLabel;

  private String processLabel;

  private String appArmorProfile;

  @Valid
  private JsonNullable<List<String>> execIDs = JsonNullable.<List<String>>undefined();

  private HostConfig hostConfig;

  private GraphDriverData graphDriver;

  private Long sizeRw;

  private Long sizeRootFs;

  @Valid
  private List<@Valid MountPoint> mounts;

  private ContainerConfig config;

  private NetworkSettings networkSettings;

  public ContainerInspectResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the container
   * @return id
  */
  
  @Schema(name = "Id", description = "The ID of the container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerInspectResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The time the container was created
   * @return created
  */
  
  @Schema(name = "Created", description = "The time the container was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ContainerInspectResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the command being run
   * @return path
  */
  
  @Schema(name = "Path", description = "The path to the command being run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ContainerInspectResponse args(List<String> args) {
    this.args = args;
    return this;
  }

  public ContainerInspectResponse addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * The arguments to the command being run
   * @return args
  */
  
  @Schema(name = "Args", description = "The arguments to the command being run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Args")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public ContainerInspectResponse state(ContainerState state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public JsonNullable<ContainerState> getState() {
    return state;
  }

  public void setState(JsonNullable<ContainerState> state) {
    this.state = state;
  }

  public ContainerInspectResponse image(String image) {
    this.image = image;
    return this;
  }

  /**
   * The container's image ID
   * @return image
  */
  
  @Schema(name = "Image", description = "The container's image ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContainerInspectResponse resolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
    return this;
  }

  /**
   * Get resolvConfPath
   * @return resolvConfPath
  */
  
  @Schema(name = "ResolvConfPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResolvConfPath")
  public String getResolvConfPath() {
    return resolvConfPath;
  }

  public void setResolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
  }

  public ContainerInspectResponse hostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
    return this;
  }

  /**
   * Get hostnamePath
   * @return hostnamePath
  */
  
  @Schema(name = "HostnamePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostnamePath")
  public String getHostnamePath() {
    return hostnamePath;
  }

  public void setHostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
  }

  public ContainerInspectResponse hostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
    return this;
  }

  /**
   * Get hostsPath
   * @return hostsPath
  */
  
  @Schema(name = "HostsPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostsPath")
  public String getHostsPath() {
    return hostsPath;
  }

  public void setHostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
  }

  public ContainerInspectResponse logPath(String logPath) {
    this.logPath = logPath;
    return this;
  }

  /**
   * Get logPath
   * @return logPath
  */
  
  @Schema(name = "LogPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogPath")
  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  public ContainerInspectResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContainerInspectResponse restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  /**
   * Get restartCount
   * @return restartCount
  */
  
  @Schema(name = "RestartCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestartCount")
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  public ContainerInspectResponse driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "Driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public ContainerInspectResponse platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  
  @Schema(name = "Platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Platform")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ContainerInspectResponse mountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
    return this;
  }

  /**
   * Get mountLabel
   * @return mountLabel
  */
  
  @Schema(name = "MountLabel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MountLabel")
  public String getMountLabel() {
    return mountLabel;
  }

  public void setMountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
  }

  public ContainerInspectResponse processLabel(String processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
  */
  
  @Schema(name = "ProcessLabel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProcessLabel")
  public String getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(String processLabel) {
    this.processLabel = processLabel;
  }

  public ContainerInspectResponse appArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
    return this;
  }

  /**
   * Get appArmorProfile
   * @return appArmorProfile
  */
  
  @Schema(name = "AppArmorProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AppArmorProfile")
  public String getAppArmorProfile() {
    return appArmorProfile;
  }

  public void setAppArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
  }

  public ContainerInspectResponse execIDs(List<String> execIDs) {
    this.execIDs = JsonNullable.of(execIDs);
    return this;
  }

  public ContainerInspectResponse addExecIDsItem(String execIDsItem) {
    if (this.execIDs == null || !this.execIDs.isPresent()) {
      this.execIDs = JsonNullable.of(new ArrayList<>());
    }
    this.execIDs.get().add(execIDsItem);
    return this;
  }

  /**
   * IDs of exec instances that are running in the container.
   * @return execIDs
  */
  
  @Schema(name = "ExecIDs", description = "IDs of exec instances that are running in the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExecIDs")
  public JsonNullable<List<String>> getExecIDs() {
    return execIDs;
  }

  public void setExecIDs(JsonNullable<List<String>> execIDs) {
    this.execIDs = execIDs;
  }

  public ContainerInspectResponse hostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
    return this;
  }

  /**
   * Get hostConfig
   * @return hostConfig
  */
  @Valid 
  @Schema(name = "HostConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostConfig")
  public HostConfig getHostConfig() {
    return hostConfig;
  }

  public void setHostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
  }

  public ContainerInspectResponse graphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
  */
  @Valid 
  @Schema(name = "GraphDriver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GraphDriver")
  public GraphDriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
  }

  public ContainerInspectResponse sizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
    return this;
  }

  /**
   * The size of files that have been created or changed by this container. 
   * @return sizeRw
  */
  
  @Schema(name = "SizeRw", description = "The size of files that have been created or changed by this container. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SizeRw")
  public Long getSizeRw() {
    return sizeRw;
  }

  public void setSizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
  }

  public ContainerInspectResponse sizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
    return this;
  }

  /**
   * The total size of all the files in this container.
   * @return sizeRootFs
  */
  
  @Schema(name = "SizeRootFs", description = "The total size of all the files in this container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SizeRootFs")
  public Long getSizeRootFs() {
    return sizeRootFs;
  }

  public void setSizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
  }

  public ContainerInspectResponse mounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
    return this;
  }

  public ContainerInspectResponse addMountsItem(MountPoint mountsItem) {
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
  @Valid 
  @Schema(name = "Mounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mounts")
  public List<@Valid MountPoint> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
  }

  public ContainerInspectResponse config(ContainerConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @Valid 
  @Schema(name = "Config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Config")
  public ContainerConfig getConfig() {
    return config;
  }

  public void setConfig(ContainerConfig config) {
    this.config = config;
  }

  public ContainerInspectResponse networkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }

  /**
   * Get networkSettings
   * @return networkSettings
  */
  @Valid 
  @Schema(name = "NetworkSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkSettings")
  public NetworkSettings getNetworkSettings() {
    return networkSettings;
  }

  public void setNetworkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerInspectResponse containerInspectResponse = (ContainerInspectResponse) o;
    return Objects.equals(this.id, containerInspectResponse.id) &&
        Objects.equals(this.created, containerInspectResponse.created) &&
        Objects.equals(this.path, containerInspectResponse.path) &&
        Objects.equals(this.args, containerInspectResponse.args) &&
        equalsNullable(this.state, containerInspectResponse.state) &&
        Objects.equals(this.image, containerInspectResponse.image) &&
        Objects.equals(this.resolvConfPath, containerInspectResponse.resolvConfPath) &&
        Objects.equals(this.hostnamePath, containerInspectResponse.hostnamePath) &&
        Objects.equals(this.hostsPath, containerInspectResponse.hostsPath) &&
        Objects.equals(this.logPath, containerInspectResponse.logPath) &&
        Objects.equals(this.name, containerInspectResponse.name) &&
        Objects.equals(this.restartCount, containerInspectResponse.restartCount) &&
        Objects.equals(this.driver, containerInspectResponse.driver) &&
        Objects.equals(this.platform, containerInspectResponse.platform) &&
        Objects.equals(this.mountLabel, containerInspectResponse.mountLabel) &&
        Objects.equals(this.processLabel, containerInspectResponse.processLabel) &&
        Objects.equals(this.appArmorProfile, containerInspectResponse.appArmorProfile) &&
        equalsNullable(this.execIDs, containerInspectResponse.execIDs) &&
        Objects.equals(this.hostConfig, containerInspectResponse.hostConfig) &&
        Objects.equals(this.graphDriver, containerInspectResponse.graphDriver) &&
        Objects.equals(this.sizeRw, containerInspectResponse.sizeRw) &&
        Objects.equals(this.sizeRootFs, containerInspectResponse.sizeRootFs) &&
        Objects.equals(this.mounts, containerInspectResponse.mounts) &&
        Objects.equals(this.config, containerInspectResponse.config) &&
        Objects.equals(this.networkSettings, containerInspectResponse.networkSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, path, args, hashCodeNullable(state), image, resolvConfPath, hostnamePath, hostsPath, logPath, name, restartCount, driver, platform, mountLabel, processLabel, appArmorProfile, hashCodeNullable(execIDs), hostConfig, graphDriver, sizeRw, sizeRootFs, mounts, config, networkSettings);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerInspectResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    resolvConfPath: ").append(toIndentedString(resolvConfPath)).append("\n");
    sb.append("    hostnamePath: ").append(toIndentedString(hostnamePath)).append("\n");
    sb.append("    hostsPath: ").append(toIndentedString(hostsPath)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    mountLabel: ").append(toIndentedString(mountLabel)).append("\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    appArmorProfile: ").append(toIndentedString(appArmorProfile)).append("\n");
    sb.append("    execIDs: ").append(toIndentedString(execIDs)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    sizeRw: ").append(toIndentedString(sizeRw)).append("\n");
    sb.append("    sizeRootFs: ").append(toIndentedString(sizeRootFs)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
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

