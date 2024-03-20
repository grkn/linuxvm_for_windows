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
 * NetworkDisconnectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkDisconnectRequest {

  private String container;

  private Boolean force;

  public NetworkDisconnectRequest container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The ID or name of the container to disconnect from the network. 
   * @return container
  */
  
  @Schema(name = "Container", description = "The ID or name of the container to disconnect from the network. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public NetworkDisconnectRequest force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Force the container to disconnect from the network. 
   * @return force
  */
  
  @Schema(name = "Force", description = "Force the container to disconnect from the network. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Force")
  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkDisconnectRequest networkDisconnectRequest = (NetworkDisconnectRequest) o;
    return Objects.equals(this.container, networkDisconnectRequest.container) &&
        Objects.equals(this.force, networkDisconnectRequest.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDisconnectRequest {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

