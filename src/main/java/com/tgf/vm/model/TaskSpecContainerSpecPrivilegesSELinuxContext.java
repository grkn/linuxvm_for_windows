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
 * SELinux labels of the container
 */

@Schema(name = "TaskSpec_ContainerSpec_Privileges_SELinuxContext", description = "SELinux labels of the container")
@JsonTypeName("TaskSpec_ContainerSpec_Privileges_SELinuxContext")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecPrivilegesSELinuxContext {

  private Boolean disable;

  private String user;

  private String role;

  private String type;

  private String level;

  public TaskSpecContainerSpecPrivilegesSELinuxContext disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

  /**
   * Disable SELinux
   * @return disable
  */
  
  @Schema(name = "Disable", description = "Disable SELinux", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Disable")
  public Boolean getDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext user(String user) {
    this.user = user;
    return this;
  }

  /**
   * SELinux user label
   * @return user
  */
  
  @Schema(name = "User", description = "SELinux user label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext role(String role) {
    this.role = role;
    return this;
  }

  /**
   * SELinux role label
   * @return role
  */
  
  @Schema(name = "Role", description = "SELinux role label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext type(String type) {
    this.type = type;
    return this;
  }

  /**
   * SELinux type label
   * @return type
  */
  
  @Schema(name = "Type", description = "SELinux type label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext level(String level) {
    this.level = level;
    return this;
  }

  /**
   * SELinux level label
   * @return level
  */
  
  @Schema(name = "Level", description = "SELinux level label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Level")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesSELinuxContext taskSpecContainerSpecPrivilegesSELinuxContext = (TaskSpecContainerSpecPrivilegesSELinuxContext) o;
    return Objects.equals(this.disable, taskSpecContainerSpecPrivilegesSELinuxContext.disable) &&
        Objects.equals(this.user, taskSpecContainerSpecPrivilegesSELinuxContext.user) &&
        Objects.equals(this.role, taskSpecContainerSpecPrivilegesSELinuxContext.role) &&
        Objects.equals(this.type, taskSpecContainerSpecPrivilegesSELinuxContext.type) &&
        Objects.equals(this.level, taskSpecContainerSpecPrivilegesSELinuxContext.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disable, user, role, type, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesSELinuxContext {\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

