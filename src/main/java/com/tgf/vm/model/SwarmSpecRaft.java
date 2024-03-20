package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Raft configuration.
 */

@Schema(name = "SwarmSpec_Raft", description = "Raft configuration.")
@JsonTypeName("SwarmSpec_Raft")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecRaft {

  private Integer snapshotInterval;

  private Integer keepOldSnapshots;

  private Integer logEntriesForSlowFollowers;

  private Integer electionTick;

  private Integer heartbeatTick;

  public SwarmSpecRaft snapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
    return this;
  }

  /**
   * The number of log entries between snapshots.
   * @return snapshotInterval
  */
  
  @Schema(name = "SnapshotInterval", example = "10000", description = "The number of log entries between snapshots.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SnapshotInterval")
  public Integer getSnapshotInterval() {
    return snapshotInterval;
  }

  public void setSnapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
  }

  public SwarmSpecRaft keepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
    return this;
  }

  /**
   * The number of snapshots to keep beyond the current snapshot. 
   * @return keepOldSnapshots
  */
  
  @Schema(name = "KeepOldSnapshots", description = "The number of snapshots to keep beyond the current snapshot. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KeepOldSnapshots")
  public Integer getKeepOldSnapshots() {
    return keepOldSnapshots;
  }

  public void setKeepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
  }

  public SwarmSpecRaft logEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
    return this;
  }

  /**
   * The number of log entries to keep around to sync up slow followers after a snapshot is created. 
   * @return logEntriesForSlowFollowers
  */
  
  @Schema(name = "LogEntriesForSlowFollowers", example = "500", description = "The number of log entries to keep around to sync up slow followers after a snapshot is created. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogEntriesForSlowFollowers")
  public Integer getLogEntriesForSlowFollowers() {
    return logEntriesForSlowFollowers;
  }

  public void setLogEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
  }

  public SwarmSpecRaft electionTick(Integer electionTick) {
    this.electionTick = electionTick;
    return this;
  }

  /**
   * The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   * @return electionTick
  */
  
  @Schema(name = "ElectionTick", example = "3", description = "The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ElectionTick")
  public Integer getElectionTick() {
    return electionTick;
  }

  public void setElectionTick(Integer electionTick) {
    this.electionTick = electionTick;
  }

  public SwarmSpecRaft heartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
    return this;
  }

  /**
   * The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   * @return heartbeatTick
  */
  
  @Schema(name = "HeartbeatTick", example = "1", description = "The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HeartbeatTick")
  public Integer getHeartbeatTick() {
    return heartbeatTick;
  }

  public void setHeartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecRaft swarmSpecRaft = (SwarmSpecRaft) o;
    return Objects.equals(this.snapshotInterval, swarmSpecRaft.snapshotInterval) &&
        Objects.equals(this.keepOldSnapshots, swarmSpecRaft.keepOldSnapshots) &&
        Objects.equals(this.logEntriesForSlowFollowers, swarmSpecRaft.logEntriesForSlowFollowers) &&
        Objects.equals(this.electionTick, swarmSpecRaft.electionTick) &&
        Objects.equals(this.heartbeatTick, swarmSpecRaft.heartbeatTick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotInterval, keepOldSnapshots, logEntriesForSlowFollowers, electionTick, heartbeatTick);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecRaft {\n");
    sb.append("    snapshotInterval: ").append(toIndentedString(snapshotInterval)).append("\n");
    sb.append("    keepOldSnapshots: ").append(toIndentedString(keepOldSnapshots)).append("\n");
    sb.append("    logEntriesForSlowFollowers: ").append(toIndentedString(logEntriesForSlowFollowers)).append("\n");
    sb.append("    electionTick: ").append(toIndentedString(electionTick)).append("\n");
    sb.append("    heartbeatTick: ").append(toIndentedString(heartbeatTick)).append("\n");
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

