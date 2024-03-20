package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ObjectVersion;
import com.tgf.vm.model.ServiceEndpoint;
import com.tgf.vm.model.ServiceJobStatus;
import com.tgf.vm.model.ServiceServiceStatus;
import com.tgf.vm.model.ServiceSpec;
import com.tgf.vm.model.ServiceUpdateStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Service
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Service {

  private String ID;

  private ObjectVersion version;

  private String createdAt;

  private String updatedAt;

  private ServiceSpec spec;

  private ServiceEndpoint endpoint;

  private ServiceUpdateStatus updateStatus;

  private ServiceServiceStatus serviceStatus;

  private ServiceJobStatus jobStatus;

  public Service ID(String ID) {
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

  public Service version(ObjectVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Valid 
  @Schema(name = "Version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public ObjectVersion getVersion() {
    return version;
  }

  public void setVersion(ObjectVersion version) {
    this.version = version;
  }

  public Service createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "CreatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Service updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "UpdatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Service spec(ServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @Valid 
  @Schema(name = "Spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Spec")
  public ServiceSpec getSpec() {
    return spec;
  }

  public void setSpec(ServiceSpec spec) {
    this.spec = spec;
  }

  public Service endpoint(ServiceEndpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
  */
  @Valid 
  @Schema(name = "Endpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Endpoint")
  public ServiceEndpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(ServiceEndpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Service updateStatus(ServiceUpdateStatus updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

  /**
   * Get updateStatus
   * @return updateStatus
  */
  @Valid 
  @Schema(name = "UpdateStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdateStatus")
  public ServiceUpdateStatus getUpdateStatus() {
    return updateStatus;
  }

  public void setUpdateStatus(ServiceUpdateStatus updateStatus) {
    this.updateStatus = updateStatus;
  }

  public Service serviceStatus(ServiceServiceStatus serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

  /**
   * Get serviceStatus
   * @return serviceStatus
  */
  @Valid 
  @Schema(name = "ServiceStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceStatus")
  public ServiceServiceStatus getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(ServiceServiceStatus serviceStatus) {
    this.serviceStatus = serviceStatus;
  }

  public Service jobStatus(ServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @Valid 
  @Schema(name = "JobStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobStatus")
  public ServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(ServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.ID, service.ID) &&
        Objects.equals(this.version, service.version) &&
        Objects.equals(this.createdAt, service.createdAt) &&
        Objects.equals(this.updatedAt, service.updatedAt) &&
        Objects.equals(this.spec, service.spec) &&
        Objects.equals(this.endpoint, service.endpoint) &&
        Objects.equals(this.updateStatus, service.updateStatus) &&
        Objects.equals(this.serviceStatus, service.serviceStatus) &&
        Objects.equals(this.jobStatus, service.jobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, spec, endpoint, updateStatus, serviceStatus, jobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
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

