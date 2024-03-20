package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.Health;
import java.util.Arrays;
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
 * ContainerState stores container&#39;s running state. It&#39;s part of ContainerJSONBase and will be returned by the \&quot;inspect\&quot; command. 
 */

@Schema(name = "ContainerState", description = "ContainerState stores container's running state. It's part of ContainerJSONBase and will be returned by the \"inspect\" command. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerState {

  /**
   * String representation of the container state. Can be one of \"created\", \"running\", \"paused\", \"restarting\", \"removing\", \"exited\", or \"dead\". 
   */
  public enum StatusEnum {
    CREATED("created"),
    
    RUNNING("running"),
    
    PAUSED("paused"),
    
    RESTARTING("restarting"),
    
    REMOVING("removing"),
    
    EXITED("exited"),
    
    DEAD("dead");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Boolean running;

  private Boolean paused;

  private Boolean restarting;

  private Boolean ooMKilled;

  private Boolean dead;

  private Integer pid;

  private Integer exitCode;

  private String error;

  private String startedAt;

  private String finishedAt;

  private JsonNullable<Health> health = JsonNullable.<Health>undefined();

  public ContainerState status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * String representation of the container state. Can be one of \"created\", \"running\", \"paused\", \"restarting\", \"removing\", \"exited\", or \"dead\". 
   * @return status
  */
  
  @Schema(name = "Status", example = "running", description = "String representation of the container state. Can be one of \"created\", \"running\", \"paused\", \"restarting\", \"removing\", \"exited\", or \"dead\". ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ContainerState running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Whether this container is running.  Note that a running container can be _paused_. The `Running` and `Paused` booleans are not mutually exclusive:  When pausing a container (on Linux), the freezer cgroup is used to suspend all processes in the container. Freezing the process requires the process to be running. As a result, paused containers are both `Running` _and_ `Paused`.  Use the `Status` field instead to determine if a container's state is \"running\". 
   * @return running
  */
  
  @Schema(name = "Running", example = "true", description = "Whether this container is running.  Note that a running container can be _paused_. The `Running` and `Paused` booleans are not mutually exclusive:  When pausing a container (on Linux), the freezer cgroup is used to suspend all processes in the container. Freezing the process requires the process to be running. As a result, paused containers are both `Running` _and_ `Paused`.  Use the `Status` field instead to determine if a container's state is \"running\". ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Running")
  public Boolean getRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public ContainerState paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * Whether this container is paused.
   * @return paused
  */
  
  @Schema(name = "Paused", example = "false", description = "Whether this container is paused.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Paused")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public ContainerState restarting(Boolean restarting) {
    this.restarting = restarting;
    return this;
  }

  /**
   * Whether this container is restarting.
   * @return restarting
  */
  
  @Schema(name = "Restarting", example = "false", description = "Whether this container is restarting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Restarting")
  public Boolean getRestarting() {
    return restarting;
  }

  public void setRestarting(Boolean restarting) {
    this.restarting = restarting;
  }

  public ContainerState ooMKilled(Boolean ooMKilled) {
    this.ooMKilled = ooMKilled;
    return this;
  }

  /**
   * Whether a process within this container has been killed because it ran out of memory since the container was last started. 
   * @return ooMKilled
  */
  
  @Schema(name = "OOMKilled", example = "false", description = "Whether a process within this container has been killed because it ran out of memory since the container was last started. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OOMKilled")
  public Boolean getOoMKilled() {
    return ooMKilled;
  }

  public void setOoMKilled(Boolean ooMKilled) {
    this.ooMKilled = ooMKilled;
  }

  public ContainerState dead(Boolean dead) {
    this.dead = dead;
    return this;
  }

  /**
   * Get dead
   * @return dead
  */
  
  @Schema(name = "Dead", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Dead")
  public Boolean getDead() {
    return dead;
  }

  public void setDead(Boolean dead) {
    this.dead = dead;
  }

  public ContainerState pid(Integer pid) {
    this.pid = pid;
    return this;
  }

  /**
   * The process ID of this container
   * @return pid
  */
  
  @Schema(name = "Pid", example = "1234", description = "The process ID of this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Pid")
  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public ContainerState exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * The last exit code of this container
   * @return exitCode
  */
  
  @Schema(name = "ExitCode", example = "0", description = "The last exit code of this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public ContainerState error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "Error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ContainerState startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * The time when this container was last started.
   * @return startedAt
  */
  
  @Schema(name = "StartedAt", example = "2020-01-06T09:06:59.461876391Z", description = "The time when this container was last started.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartedAt")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public ContainerState finishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * The time when this container last exited.
   * @return finishedAt
  */
  
  @Schema(name = "FinishedAt", example = "2020-01-06T09:07:59.461876391Z", description = "The time when this container last exited.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FinishedAt")
  public String getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }

  public ContainerState health(Health health) {
    this.health = JsonNullable.of(health);
    return this;
  }

  /**
   * Get health
   * @return health
  */
  @Valid 
  @Schema(name = "Health", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Health")
  public JsonNullable<Health> getHealth() {
    return health;
  }

  public void setHealth(JsonNullable<Health> health) {
    this.health = health;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerState containerState = (ContainerState) o;
    return Objects.equals(this.status, containerState.status) &&
        Objects.equals(this.running, containerState.running) &&
        Objects.equals(this.paused, containerState.paused) &&
        Objects.equals(this.restarting, containerState.restarting) &&
        Objects.equals(this.ooMKilled, containerState.ooMKilled) &&
        Objects.equals(this.dead, containerState.dead) &&
        Objects.equals(this.pid, containerState.pid) &&
        Objects.equals(this.exitCode, containerState.exitCode) &&
        Objects.equals(this.error, containerState.error) &&
        Objects.equals(this.startedAt, containerState.startedAt) &&
        Objects.equals(this.finishedAt, containerState.finishedAt) &&
        equalsNullable(this.health, containerState.health);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, running, paused, restarting, ooMKilled, dead, pid, exitCode, error, startedAt, finishedAt, hashCodeNullable(health));
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
    sb.append("class ContainerState {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    restarting: ").append(toIndentedString(restarting)).append("\n");
    sb.append("    ooMKilled: ").append(toIndentedString(ooMKilled)).append("\n");
    sb.append("    dead: ").append(toIndentedString(dead)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

