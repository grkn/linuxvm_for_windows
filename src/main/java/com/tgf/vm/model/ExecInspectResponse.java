package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ProcessConfig;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExecInspectResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ExecInspectResponse {

  private Boolean canRemove;

  private String detachKeys;

  private String ID;

  private Boolean running;

  private Integer exitCode;

  private ProcessConfig processConfig;

  private Boolean openStdin;

  private Boolean openStderr;

  private Boolean openStdout;

  private String containerID;

  private Integer pid;

  public ExecInspectResponse canRemove(Boolean canRemove) {
    this.canRemove = canRemove;
    return this;
  }

  /**
   * Get canRemove
   * @return canRemove
  */
  
  @Schema(name = "CanRemove", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanRemove")
  public Boolean getCanRemove() {
    return canRemove;
  }

  public void setCanRemove(Boolean canRemove) {
    this.canRemove = canRemove;
  }

  public ExecInspectResponse detachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
    return this;
  }

  /**
   * Get detachKeys
   * @return detachKeys
  */
  
  @Schema(name = "DetachKeys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DetachKeys")
  public String getDetachKeys() {
    return detachKeys;
  }

  public void setDetachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
  }

  public ExecInspectResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  */
  
  @Schema(name = "ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ExecInspectResponse running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
  */
  
  @Schema(name = "Running", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Running")
  public Boolean getRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public ExecInspectResponse exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
  */
  
  @Schema(name = "ExitCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public ExecInspectResponse processConfig(ProcessConfig processConfig) {
    this.processConfig = processConfig;
    return this;
  }

  /**
   * Get processConfig
   * @return processConfig
  */
  @Valid 
  @Schema(name = "ProcessConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProcessConfig")
  public ProcessConfig getProcessConfig() {
    return processConfig;
  }

  public void setProcessConfig(ProcessConfig processConfig) {
    this.processConfig = processConfig;
  }

  public ExecInspectResponse openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Get openStdin
   * @return openStdin
  */
  
  @Schema(name = "OpenStdin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenStdin")
  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }

  public ExecInspectResponse openStderr(Boolean openStderr) {
    this.openStderr = openStderr;
    return this;
  }

  /**
   * Get openStderr
   * @return openStderr
  */
  
  @Schema(name = "OpenStderr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenStderr")
  public Boolean getOpenStderr() {
    return openStderr;
  }

  public void setOpenStderr(Boolean openStderr) {
    this.openStderr = openStderr;
  }

  public ExecInspectResponse openStdout(Boolean openStdout) {
    this.openStdout = openStdout;
    return this;
  }

  /**
   * Get openStdout
   * @return openStdout
  */
  
  @Schema(name = "OpenStdout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenStdout")
  public Boolean getOpenStdout() {
    return openStdout;
  }

  public void setOpenStdout(Boolean openStdout) {
    this.openStdout = openStdout;
  }

  public ExecInspectResponse containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Get containerID
   * @return containerID
  */
  
  @Schema(name = "ContainerID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public ExecInspectResponse pid(Integer pid) {
    this.pid = pid;
    return this;
  }

  /**
   * The system process ID for the exec process.
   * @return pid
  */
  
  @Schema(name = "Pid", description = "The system process ID for the exec process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Pid")
  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecInspectResponse execInspectResponse = (ExecInspectResponse) o;
    return Objects.equals(this.canRemove, execInspectResponse.canRemove) &&
        Objects.equals(this.detachKeys, execInspectResponse.detachKeys) &&
        Objects.equals(this.ID, execInspectResponse.ID) &&
        Objects.equals(this.running, execInspectResponse.running) &&
        Objects.equals(this.exitCode, execInspectResponse.exitCode) &&
        Objects.equals(this.processConfig, execInspectResponse.processConfig) &&
        Objects.equals(this.openStdin, execInspectResponse.openStdin) &&
        Objects.equals(this.openStderr, execInspectResponse.openStderr) &&
        Objects.equals(this.openStdout, execInspectResponse.openStdout) &&
        Objects.equals(this.containerID, execInspectResponse.containerID) &&
        Objects.equals(this.pid, execInspectResponse.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRemove, detachKeys, ID, running, exitCode, processConfig, openStdin, openStderr, openStdout, containerID, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecInspectResponse {\n");
    sb.append("    canRemove: ").append(toIndentedString(canRemove)).append("\n");
    sb.append("    detachKeys: ").append(toIndentedString(detachKeys)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    processConfig: ").append(toIndentedString(processConfig)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    openStderr: ").append(toIndentedString(openStderr)).append("\n");
    sb.append("    openStdout: ").append(toIndentedString(openStdout)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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

