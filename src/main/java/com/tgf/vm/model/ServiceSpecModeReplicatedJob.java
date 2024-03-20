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
 * The mode used for services with a finite number of tasks that run to a completed state. 
 */

@Schema(name = "ServiceSpec_Mode_ReplicatedJob", description = "The mode used for services with a finite number of tasks that run to a completed state. ")
@JsonTypeName("ServiceSpec_Mode_ReplicatedJob")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceSpecModeReplicatedJob {

  private Long maxConcurrent = 1l;

  private Long totalCompletions;

  public ServiceSpecModeReplicatedJob maxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
    return this;
  }

  /**
   * The maximum number of replicas to run simultaneously. 
   * @return maxConcurrent
  */
  
  @Schema(name = "MaxConcurrent", description = "The maximum number of replicas to run simultaneously. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxConcurrent")
  public Long getMaxConcurrent() {
    return maxConcurrent;
  }

  public void setMaxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
  }

  public ServiceSpecModeReplicatedJob totalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
    return this;
  }

  /**
   * The total number of replicas desired to reach the Completed state. If unset, will default to the value of `MaxConcurrent` 
   * @return totalCompletions
  */
  
  @Schema(name = "TotalCompletions", description = "The total number of replicas desired to reach the Completed state. If unset, will default to the value of `MaxConcurrent` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalCompletions")
  public Long getTotalCompletions() {
    return totalCompletions;
  }

  public void setTotalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecModeReplicatedJob serviceSpecModeReplicatedJob = (ServiceSpecModeReplicatedJob) o;
    return Objects.equals(this.maxConcurrent, serviceSpecModeReplicatedJob.maxConcurrent) &&
        Objects.equals(this.totalCompletions, serviceSpecModeReplicatedJob.totalCompletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConcurrent, totalCompletions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecModeReplicatedJob {\n");
    sb.append("    maxConcurrent: ").append(toIndentedString(maxConcurrent)).append("\n");
    sb.append("    totalCompletions: ").append(toIndentedString(totalCompletions)).append("\n");
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

