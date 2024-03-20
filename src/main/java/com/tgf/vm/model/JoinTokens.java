package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * JoinTokens contains the tokens workers and managers need to join the swarm. 
 */

@Schema(name = "JoinTokens", description = "JoinTokens contains the tokens workers and managers need to join the swarm. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class JoinTokens {

  private String worker;

  private String manager;

  public JoinTokens worker(String worker) {
    this.worker = worker;
    return this;
  }

  /**
   * The token workers can use to join the swarm. 
   * @return worker
  */
  
  @Schema(name = "Worker", example = "SWMTKN-1-3pu6hszjas19xyp7ghgosyx9k8atbfcr8p2is99znpy26u2lkl-1awxwuwd3z9j1z3puu7rcgdbx", description = "The token workers can use to join the swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Worker")
  public String getWorker() {
    return worker;
  }

  public void setWorker(String worker) {
    this.worker = worker;
  }

  public JoinTokens manager(String manager) {
    this.manager = manager;
    return this;
  }

  /**
   * The token managers can use to join the swarm. 
   * @return manager
  */
  
  @Schema(name = "Manager", example = "SWMTKN-1-3pu6hszjas19xyp7ghgosyx9k8atbfcr8p2is99znpy26u2lkl-7p73s1dx5in4tatdymyhg9hu2", description = "The token managers can use to join the swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Manager")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinTokens joinTokens = (JoinTokens) o;
    return Objects.equals(this.worker, joinTokens.worker) &&
        Objects.equals(this.manager, joinTokens.manager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worker, manager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinTokens {\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

