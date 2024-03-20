package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.EndpointSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NetworkConnectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkConnectRequest {

  private String container;

  private EndpointSettings endpointConfig;

  public NetworkConnectRequest container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The ID or name of the container to connect to the network.
   * @return container
  */
  
  @Schema(name = "Container", description = "The ID or name of the container to connect to the network.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public NetworkConnectRequest endpointConfig(EndpointSettings endpointConfig) {
    this.endpointConfig = endpointConfig;
    return this;
  }

  /**
   * Get endpointConfig
   * @return endpointConfig
  */
  @Valid 
  @Schema(name = "EndpointConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndpointConfig")
  public EndpointSettings getEndpointConfig() {
    return endpointConfig;
  }

  public void setEndpointConfig(EndpointSettings endpointConfig) {
    this.endpointConfig = endpointConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectRequest networkConnectRequest = (NetworkConnectRequest) o;
    return Objects.equals(this.container, networkConnectRequest.container) &&
        Objects.equals(this.endpointConfig, networkConnectRequest.endpointConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, endpointConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectRequest {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    endpointConfig: ").append(toIndentedString(endpointConfig)).append("\n");
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

