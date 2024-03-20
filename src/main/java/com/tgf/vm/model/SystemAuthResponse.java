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
 * SystemAuthResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemAuthResponse {

  private String status;

  private String identityToken;

  public SystemAuthResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SystemAuthResponse(String status) {
    this.status = status;
  }

  public SystemAuthResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the authentication
   * @return status
  */
  @NotNull 
  @Schema(name = "Status", description = "The status of the authentication", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SystemAuthResponse identityToken(String identityToken) {
    this.identityToken = identityToken;
    return this;
  }

  /**
   * An opaque token used to authenticate a user after a successful login
   * @return identityToken
  */
  
  @Schema(name = "IdentityToken", description = "An opaque token used to authenticate a user after a successful login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentityToken")
  public String getIdentityToken() {
    return identityToken;
  }

  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuthResponse systemAuthResponse = (SystemAuthResponse) o;
    return Objects.equals(this.status, systemAuthResponse.status) &&
        Objects.equals(this.identityToken, systemAuthResponse.identityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, identityToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identityToken: ").append(toIndentedString(identityToken)).append("\n");
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

