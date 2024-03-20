package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.Reachability;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ManagerStatus represents the status of a manager.  It provides the current status of a node&#39;s manager component, if the node is a manager. 
 */

@Schema(name = "ManagerStatus", description = "ManagerStatus represents the status of a manager.  It provides the current status of a node's manager component, if the node is a manager. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ManagerStatus {

  private Boolean leader = false;

  private Reachability reachability;

  private String addr;

  public ManagerStatus leader(Boolean leader) {
    this.leader = leader;
    return this;
  }

  /**
   * Get leader
   * @return leader
  */
  
  @Schema(name = "Leader", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Leader")
  public Boolean getLeader() {
    return leader;
  }

  public void setLeader(Boolean leader) {
    this.leader = leader;
  }

  public ManagerStatus reachability(Reachability reachability) {
    this.reachability = reachability;
    return this;
  }

  /**
   * Get reachability
   * @return reachability
  */
  @Valid 
  @Schema(name = "Reachability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reachability")
  public Reachability getReachability() {
    return reachability;
  }

  public void setReachability(Reachability reachability) {
    this.reachability = reachability;
  }

  public ManagerStatus addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * The IP address and port at which the manager is reachable. 
   * @return addr
  */
  
  @Schema(name = "Addr", example = "10.0.0.46:2377", description = "The IP address and port at which the manager is reachable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Addr")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerStatus managerStatus = (ManagerStatus) o;
    return Objects.equals(this.leader, managerStatus.leader) &&
        Objects.equals(this.reachability, managerStatus.reachability) &&
        Objects.equals(this.addr, managerStatus.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leader, reachability, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerStatus {\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    reachability: ").append(toIndentedString(reachability)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

