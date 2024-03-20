package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.EngineDescription;
import com.tgf.vm.model.Platform;
import com.tgf.vm.model.ResourceObject;
import com.tgf.vm.model.TLSInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NodeDescription encapsulates the properties of the Node as reported by the agent. 
 */

@Schema(name = "NodeDescription", description = "NodeDescription encapsulates the properties of the Node as reported by the agent. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NodeDescription {

  private String hostname;

  private Platform platform;

  private ResourceObject resources;

  private EngineDescription engine;

  private TLSInfo tlSInfo;

  public NodeDescription hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  
  @Schema(name = "Hostname", example = "bf3067039e47", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public NodeDescription platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "Platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Platform")
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public NodeDescription resources(ResourceObject resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @Valid 
  @Schema(name = "Resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Resources")
  public ResourceObject getResources() {
    return resources;
  }

  public void setResources(ResourceObject resources) {
    this.resources = resources;
  }

  public NodeDescription engine(EngineDescription engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
  */
  @Valid 
  @Schema(name = "Engine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Engine")
  public EngineDescription getEngine() {
    return engine;
  }

  public void setEngine(EngineDescription engine) {
    this.engine = engine;
  }

  public NodeDescription tlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
    return this;
  }

  /**
   * Get tlSInfo
   * @return tlSInfo
  */
  @Valid 
  @Schema(name = "TLSInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TLSInfo")
  public TLSInfo getTlSInfo() {
    return tlSInfo;
  }

  public void setTlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDescription nodeDescription = (NodeDescription) o;
    return Objects.equals(this.hostname, nodeDescription.hostname) &&
        Objects.equals(this.platform, nodeDescription.platform) &&
        Objects.equals(this.resources, nodeDescription.resources) &&
        Objects.equals(this.engine, nodeDescription.engine) &&
        Objects.equals(this.tlSInfo, nodeDescription.tlSInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, platform, resources, engine, tlSInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDescription {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    tlSInfo: ").append(toIndentedString(tlSInfo)).append("\n");
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

