package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.SwarmSpecCAConfigExternalCAsInner;
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
 * CA configuration.
 */

@Schema(name = "SwarmSpec_CAConfig", description = "CA configuration.")
@JsonTypeName("SwarmSpec_CAConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecCAConfig {

  private Long nodeCertExpiry;

  @Valid
  private List<@Valid SwarmSpecCAConfigExternalCAsInner> externalCAs;

  private String signingCACert;

  private String signingCAKey;

  private Integer forceRotate;

  public SwarmSpecCAConfig nodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
    return this;
  }

  /**
   * The duration node certificates are issued for.
   * @return nodeCertExpiry
  */
  
  @Schema(name = "NodeCertExpiry", example = "7776000000000000", description = "The duration node certificates are issued for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeCertExpiry")
  public Long getNodeCertExpiry() {
    return nodeCertExpiry;
  }

  public void setNodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
  }

  public SwarmSpecCAConfig externalCAs(List<@Valid SwarmSpecCAConfigExternalCAsInner> externalCAs) {
    this.externalCAs = externalCAs;
    return this;
  }

  public SwarmSpecCAConfig addExternalCAsItem(SwarmSpecCAConfigExternalCAsInner externalCAsItem) {
    if (this.externalCAs == null) {
      this.externalCAs = new ArrayList<>();
    }
    this.externalCAs.add(externalCAsItem);
    return this;
  }

  /**
   * Configuration for forwarding signing requests to an external certificate authority. 
   * @return externalCAs
  */
  @Valid 
  @Schema(name = "ExternalCAs", description = "Configuration for forwarding signing requests to an external certificate authority. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalCAs")
  public List<@Valid SwarmSpecCAConfigExternalCAsInner> getExternalCAs() {
    return externalCAs;
  }

  public void setExternalCAs(List<@Valid SwarmSpecCAConfigExternalCAsInner> externalCAs) {
    this.externalCAs = externalCAs;
  }

  public SwarmSpecCAConfig signingCACert(String signingCACert) {
    this.signingCACert = signingCACert;
    return this;
  }

  /**
   * The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format. 
   * @return signingCACert
  */
  
  @Schema(name = "SigningCACert", description = "The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SigningCACert")
  public String getSigningCACert() {
    return signingCACert;
  }

  public void setSigningCACert(String signingCACert) {
    this.signingCACert = signingCACert;
  }

  public SwarmSpecCAConfig signingCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
    return this;
  }

  /**
   * The desired signing CA key for all swarm node TLS leaf certificates, in PEM format. 
   * @return signingCAKey
  */
  
  @Schema(name = "SigningCAKey", description = "The desired signing CA key for all swarm node TLS leaf certificates, in PEM format. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SigningCAKey")
  public String getSigningCAKey() {
    return signingCAKey;
  }

  public void setSigningCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
  }

  public SwarmSpecCAConfig forceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
    return this;
  }

  /**
   * An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey` 
   * @return forceRotate
  */
  
  @Schema(name = "ForceRotate", description = "An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ForceRotate")
  public Integer getForceRotate() {
    return forceRotate;
  }

  public void setForceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecCAConfig swarmSpecCAConfig = (SwarmSpecCAConfig) o;
    return Objects.equals(this.nodeCertExpiry, swarmSpecCAConfig.nodeCertExpiry) &&
        Objects.equals(this.externalCAs, swarmSpecCAConfig.externalCAs) &&
        Objects.equals(this.signingCACert, swarmSpecCAConfig.signingCACert) &&
        Objects.equals(this.signingCAKey, swarmSpecCAConfig.signingCAKey) &&
        Objects.equals(this.forceRotate, swarmSpecCAConfig.forceRotate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeCertExpiry, externalCAs, signingCACert, signingCAKey, forceRotate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecCAConfig {\n");
    sb.append("    nodeCertExpiry: ").append(toIndentedString(nodeCertExpiry)).append("\n");
    sb.append("    externalCAs: ").append(toIndentedString(externalCAs)).append("\n");
    sb.append("    signingCACert: ").append(toIndentedString(signingCACert)).append("\n");
    sb.append("    signingCAKey: ").append(toIndentedString(signingCAKey)).append("\n");
    sb.append("    forceRotate: ").append(toIndentedString(forceRotate)).append("\n");
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

