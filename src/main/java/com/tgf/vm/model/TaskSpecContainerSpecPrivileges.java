package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.TaskSpecContainerSpecPrivilegesCredentialSpec;
import com.tgf.vm.model.TaskSpecContainerSpecPrivilegesSELinuxContext;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Security options for the container
 */

@Schema(name = "TaskSpec_ContainerSpec_Privileges", description = "Security options for the container")
@JsonTypeName("TaskSpec_ContainerSpec_Privileges")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecPrivileges {

  private TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec;

  private TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext;

  public TaskSpecContainerSpecPrivileges credentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
    return this;
  }

  /**
   * Get credentialSpec
   * @return credentialSpec
  */
  @Valid 
  @Schema(name = "CredentialSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CredentialSpec")
  public TaskSpecContainerSpecPrivilegesCredentialSpec getCredentialSpec() {
    return credentialSpec;
  }

  public void setCredentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
  }

  public TaskSpecContainerSpecPrivileges seLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
    return this;
  }

  /**
   * Get seLinuxContext
   * @return seLinuxContext
  */
  @Valid 
  @Schema(name = "SELinuxContext", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SELinuxContext")
  public TaskSpecContainerSpecPrivilegesSELinuxContext getSeLinuxContext() {
    return seLinuxContext;
  }

  public void setSeLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivileges taskSpecContainerSpecPrivileges = (TaskSpecContainerSpecPrivileges) o;
    return Objects.equals(this.credentialSpec, taskSpecContainerSpecPrivileges.credentialSpec) &&
        Objects.equals(this.seLinuxContext, taskSpecContainerSpecPrivileges.seLinuxContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialSpec, seLinuxContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivileges {\n");
    sb.append("    credentialSpec: ").append(toIndentedString(credentialSpec)).append("\n");
    sb.append("    seLinuxContext: ").append(toIndentedString(seLinuxContext)).append("\n");
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

