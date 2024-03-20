package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EndpointPortConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class EndpointPortConfig {

  private String name;

  /**
   * Gets or Sets protocol
   */
  public enum ProtocolEnum {
    TCP("tcp"),
    
    UDP("udp"),
    
    SCTP("sctp");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProtocolEnum protocol;

  private Integer targetPort;

  private Integer publishedPort;

  /**
   * The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running. 
   */
  public enum PublishModeEnum {
    INGRESS("ingress"),
    
    HOST("host");

    private String value;

    PublishModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PublishModeEnum fromValue(String value) {
      for (PublishModeEnum b : PublishModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PublishModeEnum publishMode = PublishModeEnum.INGRESS;

  public EndpointPortConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EndpointPortConfig protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  */
  
  @Schema(name = "Protocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public EndpointPortConfig targetPort(Integer targetPort) {
    this.targetPort = targetPort;
    return this;
  }

  /**
   * The port inside the container.
   * @return targetPort
  */
  
  @Schema(name = "TargetPort", description = "The port inside the container.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TargetPort")
  public Integer getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(Integer targetPort) {
    this.targetPort = targetPort;
  }

  public EndpointPortConfig publishedPort(Integer publishedPort) {
    this.publishedPort = publishedPort;
    return this;
  }

  /**
   * The port on the swarm hosts.
   * @return publishedPort
  */
  
  @Schema(name = "PublishedPort", description = "The port on the swarm hosts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishedPort")
  public Integer getPublishedPort() {
    return publishedPort;
  }

  public void setPublishedPort(Integer publishedPort) {
    this.publishedPort = publishedPort;
  }

  public EndpointPortConfig publishMode(PublishModeEnum publishMode) {
    this.publishMode = publishMode;
    return this;
  }

  /**
   * The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running. 
   * @return publishMode
  */
  
  @Schema(name = "PublishMode", example = "ingress", description = "The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishMode")
  public PublishModeEnum getPublishMode() {
    return publishMode;
  }

  public void setPublishMode(PublishModeEnum publishMode) {
    this.publishMode = publishMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointPortConfig endpointPortConfig = (EndpointPortConfig) o;
    return Objects.equals(this.name, endpointPortConfig.name) &&
        Objects.equals(this.protocol, endpointPortConfig.protocol) &&
        Objects.equals(this.targetPort, endpointPortConfig.targetPort) &&
        Objects.equals(this.publishedPort, endpointPortConfig.publishedPort) &&
        Objects.equals(this.publishMode, endpointPortConfig.publishMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, protocol, targetPort, publishedPort, publishMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointPortConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    publishedPort: ").append(toIndentedString(publishedPort)).append("\n");
    sb.append("    publishMode: ").append(toIndentedString(publishMode)).append("\n");
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

