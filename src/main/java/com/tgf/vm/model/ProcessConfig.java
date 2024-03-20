package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ProcessConfig {

  private Boolean privileged;

  private String user;

  private Boolean tty;

  private String entrypoint;

  @Valid
  private List<String> arguments;

  public ProcessConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Get privileged
   * @return privileged
  */
  
  @Schema(name = "privileged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privileged")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public ProcessConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ProcessConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Get tty
   * @return tty
  */
  
  @Schema(name = "tty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ProcessConfig entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * Get entrypoint
   * @return entrypoint
  */
  
  @Schema(name = "entrypoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entrypoint")
  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }

  public ProcessConfig arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public ProcessConfig addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  
  @Schema(name = "arguments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessConfig processConfig = (ProcessConfig) o;
    return Objects.equals(this.privileged, processConfig.privileged) &&
        Objects.equals(this.user, processConfig.user) &&
        Objects.equals(this.tty, processConfig.tty) &&
        Objects.equals(this.entrypoint, processConfig.entrypoint) &&
        Objects.equals(this.arguments, processConfig.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileged, user, tty, entrypoint, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessConfig {\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

