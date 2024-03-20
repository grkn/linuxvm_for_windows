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
 * IndexInfo contains information about a registry.
 */

@Schema(name = "IndexInfo", description = "IndexInfo contains information about a registry.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class IndexInfo {

  private String name;

  @Valid
  private List<String> mirrors;

  private Boolean secure;

  private Boolean official;

  public IndexInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the registry, such as \"docker.io\". 
   * @return name
  */
  
  @Schema(name = "Name", example = "docker.io", description = "Name of the registry, such as \"docker.io\". ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IndexInfo mirrors(List<String> mirrors) {
    this.mirrors = mirrors;
    return this;
  }

  public IndexInfo addMirrorsItem(String mirrorsItem) {
    if (this.mirrors == null) {
      this.mirrors = new ArrayList<>();
    }
    this.mirrors.add(mirrorsItem);
    return this;
  }

  /**
   * List of mirrors, expressed as URIs. 
   * @return mirrors
  */
  
  @Schema(name = "Mirrors", example = "[https://hub-mirror.corp.example.com:5000/, https://registry-2.docker.io/, https://registry-3.docker.io/]", description = "List of mirrors, expressed as URIs. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mirrors")
  public List<String> getMirrors() {
    return mirrors;
  }

  public void setMirrors(List<String> mirrors) {
    this.mirrors = mirrors;
  }

  public IndexInfo secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Indicates if the registry is part of the list of insecure registries.  If `false`, the registry is insecure. Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  > **Warning**: Insecure registries can be useful when running a local > registry. However, because its use creates security vulnerabilities > it should ONLY be enabled for testing purposes. For increased > security, users should add their CA to their system's list of > trusted CAs instead of enabling this option. 
   * @return secure
  */
  
  @Schema(name = "Secure", example = "true", description = "Indicates if the registry is part of the list of insecure registries.  If `false`, the registry is insecure. Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  > **Warning**: Insecure registries can be useful when running a local > registry. However, because its use creates security vulnerabilities > it should ONLY be enabled for testing purposes. For increased > security, users should add their CA to their system's list of > trusted CAs instead of enabling this option. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Secure")
  public Boolean getSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public IndexInfo official(Boolean official) {
    this.official = official;
    return this;
  }

  /**
   * Indicates whether this is an official registry (i.e., Docker Hub / docker.io) 
   * @return official
  */
  
  @Schema(name = "Official", example = "true", description = "Indicates whether this is an official registry (i.e., Docker Hub / docker.io) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Official")
  public Boolean getOfficial() {
    return official;
  }

  public void setOfficial(Boolean official) {
    this.official = official;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexInfo indexInfo = (IndexInfo) o;
    return Objects.equals(this.name, indexInfo.name) &&
        Objects.equals(this.mirrors, indexInfo.mirrors) &&
        Objects.equals(this.secure, indexInfo.secure) &&
        Objects.equals(this.official, indexInfo.official);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mirrors, secure, official);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mirrors: ").append(toIndentedString(mirrors)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
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

