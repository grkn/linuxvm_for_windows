package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.ObjectVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The status of the service when it is in one of ReplicatedJob or GlobalJob modes. Absent on Replicated and Global mode services. The JobIteration is an ObjectVersion, but unlike the Service&#39;s version, does not need to be sent with an update request. 
 */

@Schema(name = "Service_JobStatus", description = "The status of the service when it is in one of ReplicatedJob or GlobalJob modes. Absent on Replicated and Global mode services. The JobIteration is an ObjectVersion, but unlike the Service's version, does not need to be sent with an update request. ")
@JsonTypeName("Service_JobStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceJobStatus {

  private ObjectVersion jobIteration;

  private String lastExecution;

  public ServiceJobStatus jobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
    return this;
  }

  /**
   * Get jobIteration
   * @return jobIteration
  */
  @Valid 
  @Schema(name = "JobIteration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobIteration")
  public ObjectVersion getJobIteration() {
    return jobIteration;
  }

  public void setJobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
  }

  public ServiceJobStatus lastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
    return this;
  }

  /**
   * The last time, as observed by the server, that this job was started. 
   * @return lastExecution
  */
  
  @Schema(name = "LastExecution", description = "The last time, as observed by the server, that this job was started. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastExecution")
  public String getLastExecution() {
    return lastExecution;
  }

  public void setLastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceJobStatus serviceJobStatus = (ServiceJobStatus) o;
    return Objects.equals(this.jobIteration, serviceJobStatus.jobIteration) &&
        Objects.equals(this.lastExecution, serviceJobStatus.lastExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobIteration, lastExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceJobStatus {\n");
    sb.append("    jobIteration: ").append(toIndentedString(jobIteration)).append("\n");
    sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
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

