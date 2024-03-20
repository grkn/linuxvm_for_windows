package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.HealthConfig;
import com.tgf.vm.model.HostConfig;
import com.tgf.vm.model.NetworkingConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * ContainerCreateRequest
 */

@JsonTypeName("ContainerCreate_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerCreateRequest {

  private String hostname;

  private String domainname;

  private String user;

  private Boolean attachStdin = false;

  private Boolean attachStdout = true;

  private Boolean attachStderr = true;

  @Valid
  private JsonNullable<Map<String, Object>> exposedPorts = JsonNullable.<Map<String, Object>>undefined();

  private Boolean tty = false;

  private Boolean openStdin = false;

  private Boolean stdinOnce = false;

  @Valid
  private List<String> env;

  @Valid
  private List<String> cmd;

  private HealthConfig healthcheck;

  private JsonNullable<Boolean> argsEscaped = JsonNullable.<Boolean>undefined();

  private String image;

  @Valid
  private Map<String, Object> volumes = new HashMap<>();

  private String workingDir;

  @Valid
  private List<String> entrypoint;

  private JsonNullable<Boolean> networkDisabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> macAddress = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> onBuild = JsonNullable.<List<String>>undefined();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private JsonNullable<String> stopSignal = JsonNullable.<String>undefined();

  private JsonNullable<Integer> stopTimeout = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<String>> shell = JsonNullable.<List<String>>undefined();

  private HostConfig hostConfig;

  private NetworkingConfig networkingConfig;

  public ContainerCreateRequest hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The hostname to use for the container, as a valid RFC 1123 hostname. 
   * @return hostname
  */
  
  @Schema(name = "Hostname", example = "439f4e91bd1d", description = "The hostname to use for the container, as a valid RFC 1123 hostname. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ContainerCreateRequest domainname(String domainname) {
    this.domainname = domainname;
    return this;
  }

  /**
   * The domain name to use for the container. 
   * @return domainname
  */
  
  @Schema(name = "Domainname", description = "The domain name to use for the container. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Domainname")
  public String getDomainname() {
    return domainname;
  }

  public void setDomainname(String domainname) {
    this.domainname = domainname;
  }

  public ContainerCreateRequest user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The user that commands are run as inside the container.
   * @return user
  */
  
  @Schema(name = "User", description = "The user that commands are run as inside the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ContainerCreateRequest attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Whether to attach to `stdin`.
   * @return attachStdin
  */
  
  @Schema(name = "AttachStdin", description = "Whether to attach to `stdin`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStdin")
  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }

  public ContainerCreateRequest attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Whether to attach to `stdout`.
   * @return attachStdout
  */
  
  @Schema(name = "AttachStdout", description = "Whether to attach to `stdout`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStdout")
  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }

  public ContainerCreateRequest attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Whether to attach to `stderr`.
   * @return attachStderr
  */
  
  @Schema(name = "AttachStderr", description = "Whether to attach to `stderr`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStderr")
  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }

  public ContainerCreateRequest exposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = JsonNullable.of(exposedPorts);
    return this;
  }

  public ContainerCreateRequest putExposedPortsItem(String key, Object exposedPortsItem) {
    if (this.exposedPorts == null || !this.exposedPorts.isPresent()) {
      this.exposedPorts = JsonNullable.of(new HashMap<>());
    }
    this.exposedPorts.get().put(key, exposedPortsItem);
    return this;
  }

  /**
   * An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}` 
   * @return exposedPorts
  */
  
  @Schema(name = "ExposedPorts", example = "{80/tcp={}, 443/tcp={}}", description = "An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExposedPorts")
  public JsonNullable<Map<String, Object>> getExposedPorts() {
    return exposedPorts;
  }

  public void setExposedPorts(JsonNullable<Map<String, Object>> exposedPorts) {
    this.exposedPorts = exposedPorts;
  }

  public ContainerCreateRequest tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Attach standard streams to a TTY, including `stdin` if it is not closed. 
   * @return tty
  */
  
  @Schema(name = "Tty", description = "Attach standard streams to a TTY, including `stdin` if it is not closed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ContainerCreateRequest openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Open `stdin`
   * @return openStdin
  */
  
  @Schema(name = "OpenStdin", description = "Open `stdin`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenStdin")
  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }

  public ContainerCreateRequest stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Close `stdin` after one attached client disconnects
   * @return stdinOnce
  */
  
  @Schema(name = "StdinOnce", description = "Close `stdin` after one attached client disconnects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StdinOnce")
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public ContainerCreateRequest env(List<String> env) {
    this.env = env;
    return this;
  }

  public ContainerCreateRequest addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value. 
   * @return env
  */
  
  @Schema(name = "Env", example = "[PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin]", description = "A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Env")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public ContainerCreateRequest cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public ContainerCreateRequest addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * Command to run specified as a string or an array of strings. 
   * @return cmd
  */
  
  @Schema(name = "Cmd", example = "[/bin/sh]", description = "Command to run specified as a string or an array of strings. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cmd")
  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }

  public ContainerCreateRequest healthcheck(HealthConfig healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

  /**
   * Get healthcheck
   * @return healthcheck
  */
  @Valid 
  @Schema(name = "Healthcheck", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Healthcheck")
  public HealthConfig getHealthcheck() {
    return healthcheck;
  }

  public void setHealthcheck(HealthConfig healthcheck) {
    this.healthcheck = healthcheck;
  }

  public ContainerCreateRequest argsEscaped(Boolean argsEscaped) {
    this.argsEscaped = JsonNullable.of(argsEscaped);
    return this;
  }

  /**
   * Command is already escaped (Windows only)
   * @return argsEscaped
  */
  
  @Schema(name = "ArgsEscaped", example = "false", description = "Command is already escaped (Windows only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ArgsEscaped")
  public JsonNullable<Boolean> getArgsEscaped() {
    return argsEscaped;
  }

  public void setArgsEscaped(JsonNullable<Boolean> argsEscaped) {
    this.argsEscaped = argsEscaped;
  }

  public ContainerCreateRequest image(String image) {
    this.image = image;
    return this;
  }

  /**
   * The name (or reference) of the image to use when creating the container, or which was used when the container was created. 
   * @return image
  */
  
  @Schema(name = "Image", example = "example-image:1.0", description = "The name (or reference) of the image to use when creating the container, or which was used when the container was created. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContainerCreateRequest volumes(Map<String, Object> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ContainerCreateRequest putVolumesItem(String key, Object volumesItem) {
    if (this.volumes == null) {
      this.volumes = new HashMap<>();
    }
    this.volumes.put(key, volumesItem);
    return this;
  }

  /**
   * An object mapping mount point paths inside the container to empty objects. 
   * @return volumes
  */
  
  @Schema(name = "Volumes", description = "An object mapping mount point paths inside the container to empty objects. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Volumes")
  public Map<String, Object> getVolumes() {
    return volumes;
  }

  public void setVolumes(Map<String, Object> volumes) {
    this.volumes = volumes;
  }

  public ContainerCreateRequest workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * The working directory for commands to run in.
   * @return workingDir
  */
  
  @Schema(name = "WorkingDir", example = "/public/", description = "The working directory for commands to run in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WorkingDir")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  public ContainerCreateRequest entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public ContainerCreateRequest addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`). 
   * @return entrypoint
  */
  
  @Schema(name = "Entrypoint", example = "[]", description = "The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Entrypoint")
  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }

  public ContainerCreateRequest networkDisabled(Boolean networkDisabled) {
    this.networkDisabled = JsonNullable.of(networkDisabled);
    return this;
  }

  /**
   * Disable networking for the container.
   * @return networkDisabled
  */
  
  @Schema(name = "NetworkDisabled", description = "Disable networking for the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkDisabled")
  public JsonNullable<Boolean> getNetworkDisabled() {
    return networkDisabled;
  }

  public void setNetworkDisabled(JsonNullable<Boolean> networkDisabled) {
    this.networkDisabled = networkDisabled;
  }

  public ContainerCreateRequest macAddress(String macAddress) {
    this.macAddress = JsonNullable.of(macAddress);
    return this;
  }

  /**
   * MAC address of the container.
   * @return macAddress
  */
  
  @Schema(name = "MacAddress", description = "MAC address of the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MacAddress")
  public JsonNullable<String> getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(JsonNullable<String> macAddress) {
    this.macAddress = macAddress;
  }

  public ContainerCreateRequest onBuild(List<String> onBuild) {
    this.onBuild = JsonNullable.of(onBuild);
    return this;
  }

  public ContainerCreateRequest addOnBuildItem(String onBuildItem) {
    if (this.onBuild == null || !this.onBuild.isPresent()) {
      this.onBuild = JsonNullable.of(new ArrayList<>());
    }
    this.onBuild.get().add(onBuildItem);
    return this;
  }

  /**
   * `ONBUILD` metadata that were defined in the image's `Dockerfile`. 
   * @return onBuild
  */
  
  @Schema(name = "OnBuild", example = "[]", description = "`ONBUILD` metadata that were defined in the image's `Dockerfile`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OnBuild")
  public JsonNullable<List<String>> getOnBuild() {
    return onBuild;
  }

  public void setOnBuild(JsonNullable<List<String>> onBuild) {
    this.onBuild = onBuild;
  }

  public ContainerCreateRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ContainerCreateRequest putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  
  @Schema(name = "Labels", example = "{com.example.some-label=some-value, com.example.some-other-label=some-other-value}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ContainerCreateRequest stopSignal(String stopSignal) {
    this.stopSignal = JsonNullable.of(stopSignal);
    return this;
  }

  /**
   * Signal to stop a container as a string or unsigned integer. 
   * @return stopSignal
  */
  
  @Schema(name = "StopSignal", example = "SIGTERM", description = "Signal to stop a container as a string or unsigned integer. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StopSignal")
  public JsonNullable<String> getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(JsonNullable<String> stopSignal) {
    this.stopSignal = stopSignal;
  }

  public ContainerCreateRequest stopTimeout(Integer stopTimeout) {
    this.stopTimeout = JsonNullable.of(stopTimeout);
    return this;
  }

  /**
   * Timeout to stop a container in seconds.
   * @return stopTimeout
  */
  
  @Schema(name = "StopTimeout", description = "Timeout to stop a container in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StopTimeout")
  public JsonNullable<Integer> getStopTimeout() {
    return stopTimeout;
  }

  public void setStopTimeout(JsonNullable<Integer> stopTimeout) {
    this.stopTimeout = stopTimeout;
  }

  public ContainerCreateRequest shell(List<String> shell) {
    this.shell = JsonNullable.of(shell);
    return this;
  }

  public ContainerCreateRequest addShellItem(String shellItem) {
    if (this.shell == null || !this.shell.isPresent()) {
      this.shell = JsonNullable.of(new ArrayList<>());
    }
    this.shell.get().add(shellItem);
    return this;
  }

  /**
   * Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell. 
   * @return shell
  */
  
  @Schema(name = "Shell", example = "[/bin/sh, -c]", description = "Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Shell")
  public JsonNullable<List<String>> getShell() {
    return shell;
  }

  public void setShell(JsonNullable<List<String>> shell) {
    this.shell = shell;
  }

  public ContainerCreateRequest hostConfig(HostConfig hostConfig) {
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

  public ContainerCreateRequest networkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
    return this;
  }

  /**
   * Get networkingConfig
   * @return networkingConfig
  */
  @Valid 
  @Schema(name = "NetworkingConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkingConfig")
  public NetworkingConfig getNetworkingConfig() {
    return networkingConfig;
  }

  public void setNetworkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCreateRequest containerCreateRequest = (ContainerCreateRequest) o;
    return Objects.equals(this.hostname, containerCreateRequest.hostname) &&
        Objects.equals(this.domainname, containerCreateRequest.domainname) &&
        Objects.equals(this.user, containerCreateRequest.user) &&
        Objects.equals(this.attachStdin, containerCreateRequest.attachStdin) &&
        Objects.equals(this.attachStdout, containerCreateRequest.attachStdout) &&
        Objects.equals(this.attachStderr, containerCreateRequest.attachStderr) &&
        equalsNullable(this.exposedPorts, containerCreateRequest.exposedPorts) &&
        Objects.equals(this.tty, containerCreateRequest.tty) &&
        Objects.equals(this.openStdin, containerCreateRequest.openStdin) &&
        Objects.equals(this.stdinOnce, containerCreateRequest.stdinOnce) &&
        Objects.equals(this.env, containerCreateRequest.env) &&
        Objects.equals(this.cmd, containerCreateRequest.cmd) &&
        Objects.equals(this.healthcheck, containerCreateRequest.healthcheck) &&
        equalsNullable(this.argsEscaped, containerCreateRequest.argsEscaped) &&
        Objects.equals(this.image, containerCreateRequest.image) &&
        Objects.equals(this.volumes, containerCreateRequest.volumes) &&
        Objects.equals(this.workingDir, containerCreateRequest.workingDir) &&
        Objects.equals(this.entrypoint, containerCreateRequest.entrypoint) &&
        equalsNullable(this.networkDisabled, containerCreateRequest.networkDisabled) &&
        equalsNullable(this.macAddress, containerCreateRequest.macAddress) &&
        equalsNullable(this.onBuild, containerCreateRequest.onBuild) &&
        Objects.equals(this.labels, containerCreateRequest.labels) &&
        equalsNullable(this.stopSignal, containerCreateRequest.stopSignal) &&
        equalsNullable(this.stopTimeout, containerCreateRequest.stopTimeout) &&
        equalsNullable(this.shell, containerCreateRequest.shell) &&
        Objects.equals(this.hostConfig, containerCreateRequest.hostConfig) &&
        Objects.equals(this.networkingConfig, containerCreateRequest.networkingConfig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, domainname, user, attachStdin, attachStdout, attachStderr, hashCodeNullable(exposedPorts), tty, openStdin, stdinOnce, env, cmd, healthcheck, hashCodeNullable(argsEscaped), image, volumes, workingDir, entrypoint, hashCodeNullable(networkDisabled), hashCodeNullable(macAddress), hashCodeNullable(onBuild), labels, hashCodeNullable(stopSignal), hashCodeNullable(stopTimeout), hashCodeNullable(shell), hostConfig, networkingConfig);
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
    sb.append("class ContainerCreateRequest {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    domainname: ").append(toIndentedString(domainname)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    argsEscaped: ").append(toIndentedString(argsEscaped)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    networkDisabled: ").append(toIndentedString(networkDisabled)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    onBuild: ").append(toIndentedString(onBuild)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
    sb.append("    stopTimeout: ").append(toIndentedString(stopTimeout)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    networkingConfig: ").append(toIndentedString(networkingConfig)).append("\n");
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

