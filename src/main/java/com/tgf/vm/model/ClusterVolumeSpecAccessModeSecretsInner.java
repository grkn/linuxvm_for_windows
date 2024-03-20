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
 * One cluster volume secret entry. Defines a key-value pair that is passed to the plugin. 
 */

@Schema(name = "ClusterVolumeSpec_AccessMode_Secrets_inner", description = "One cluster volume secret entry. Defines a key-value pair that is passed to the plugin. ")
@JsonTypeName("ClusterVolumeSpec_AccessMode_Secrets_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeSpecAccessModeSecretsInner {

  private String key;

  private String secret;

  public ClusterVolumeSpecAccessModeSecretsInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key is the name of the key of the key-value pair passed to the plugin. 
   * @return key
  */
  
  @Schema(name = "Key", description = "Key is the name of the key of the key-value pair passed to the plugin. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ClusterVolumeSpecAccessModeSecretsInner secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Secret is the swarm Secret object from which to read data. This can be a Secret name or ID. The Secret data is retrieved by swarm and used as the value of the key-value pair passed to the plugin. 
   * @return secret
  */
  
  @Schema(name = "Secret", description = "Secret is the swarm Secret object from which to read data. This can be a Secret name or ID. The Secret data is retrieved by swarm and used as the value of the key-value pair passed to the plugin. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Secret")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpecAccessModeSecretsInner clusterVolumeSpecAccessModeSecretsInner = (ClusterVolumeSpecAccessModeSecretsInner) o;
    return Objects.equals(this.key, clusterVolumeSpecAccessModeSecretsInner.key) &&
        Objects.equals(this.secret, clusterVolumeSpecAccessModeSecretsInner.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpecAccessModeSecretsInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

