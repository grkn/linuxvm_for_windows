package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.ServiceSpecModeReplicated;
import com.tgf.vm.model.ServiceSpecModeReplicatedJob;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Scheduling mode for the service.
 */

@Schema(name = "ServiceSpec_Mode", description = "Scheduling mode for the service.")
@JsonTypeName("ServiceSpec_Mode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceSpecMode {

  private ServiceSpecModeReplicated replicated;

  private Object global;

  private ServiceSpecModeReplicatedJob replicatedJob;

  private Object globalJob;

  public ServiceSpecMode replicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
    return this;
  }

  /**
   * Get replicated
   * @return replicated
  */
  @Valid 
  @Schema(name = "Replicated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Replicated")
  public ServiceSpecModeReplicated getReplicated() {
    return replicated;
  }

  public void setReplicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
  }

  public ServiceSpecMode global(Object global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
  */
  
  @Schema(name = "Global", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Global")
  public Object getGlobal() {
    return global;
  }

  public void setGlobal(Object global) {
    this.global = global;
  }

  public ServiceSpecMode replicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
    return this;
  }

  /**
   * Get replicatedJob
   * @return replicatedJob
  */
  @Valid 
  @Schema(name = "ReplicatedJob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReplicatedJob")
  public ServiceSpecModeReplicatedJob getReplicatedJob() {
    return replicatedJob;
  }

  public void setReplicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
  }

  public ServiceSpecMode globalJob(Object globalJob) {
    this.globalJob = globalJob;
    return this;
  }

  /**
   * The mode used for services which run a task to the completed state on each valid node. 
   * @return globalJob
  */
  
  @Schema(name = "GlobalJob", description = "The mode used for services which run a task to the completed state on each valid node. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GlobalJob")
  public Object getGlobalJob() {
    return globalJob;
  }

  public void setGlobalJob(Object globalJob) {
    this.globalJob = globalJob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecMode serviceSpecMode = (ServiceSpecMode) o;
    return Objects.equals(this.replicated, serviceSpecMode.replicated) &&
        Objects.equals(this.global, serviceSpecMode.global) &&
        Objects.equals(this.replicatedJob, serviceSpecMode.replicatedJob) &&
        Objects.equals(this.globalJob, serviceSpecMode.globalJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicated, global, replicatedJob, globalJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecMode {\n");
    sb.append("    replicated: ").append(toIndentedString(replicated)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    replicatedJob: ").append(toIndentedString(replicatedJob)).append("\n");
    sb.append("    globalJob: ").append(toIndentedString(globalJob)).append("\n");
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

