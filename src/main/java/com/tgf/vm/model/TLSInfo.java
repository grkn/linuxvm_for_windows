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
 * Information about the issuer of leaf TLS certificates and the trusted root CA certificate. 
 */

@Schema(name = "TLSInfo", description = "Information about the issuer of leaf TLS certificates and the trusted root CA certificate. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TLSInfo {

  private String trustRoot;

  private String certIssuerSubject;

  private String certIssuerPublicKey;

  public TLSInfo trustRoot(String trustRoot) {
    this.trustRoot = trustRoot;
    return this;
  }

  /**
   * The root CA certificate(s) that are used to validate leaf TLS certificates. 
   * @return trustRoot
  */
  
  @Schema(name = "TrustRoot", description = "The root CA certificate(s) that are used to validate leaf TLS certificates. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrustRoot")
  public String getTrustRoot() {
    return trustRoot;
  }

  public void setTrustRoot(String trustRoot) {
    this.trustRoot = trustRoot;
  }

  public TLSInfo certIssuerSubject(String certIssuerSubject) {
    this.certIssuerSubject = certIssuerSubject;
    return this;
  }

  /**
   * The base64-url-safe-encoded raw subject bytes of the issuer.
   * @return certIssuerSubject
  */
  
  @Schema(name = "CertIssuerSubject", description = "The base64-url-safe-encoded raw subject bytes of the issuer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CertIssuerSubject")
  public String getCertIssuerSubject() {
    return certIssuerSubject;
  }

  public void setCertIssuerSubject(String certIssuerSubject) {
    this.certIssuerSubject = certIssuerSubject;
  }

  public TLSInfo certIssuerPublicKey(String certIssuerPublicKey) {
    this.certIssuerPublicKey = certIssuerPublicKey;
    return this;
  }

  /**
   * The base64-url-safe-encoded raw public key bytes of the issuer. 
   * @return certIssuerPublicKey
  */
  
  @Schema(name = "CertIssuerPublicKey", description = "The base64-url-safe-encoded raw public key bytes of the issuer. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CertIssuerPublicKey")
  public String getCertIssuerPublicKey() {
    return certIssuerPublicKey;
  }

  public void setCertIssuerPublicKey(String certIssuerPublicKey) {
    this.certIssuerPublicKey = certIssuerPublicKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLSInfo tlSInfo = (TLSInfo) o;
    return Objects.equals(this.trustRoot, tlSInfo.trustRoot) &&
        Objects.equals(this.certIssuerSubject, tlSInfo.certIssuerSubject) &&
        Objects.equals(this.certIssuerPublicKey, tlSInfo.certIssuerPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustRoot, certIssuerSubject, certIssuerPublicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLSInfo {\n");
    sb.append("    trustRoot: ").append(toIndentedString(trustRoot)).append("\n");
    sb.append("    certIssuerSubject: ").append(toIndentedString(certIssuerSubject)).append("\n");
    sb.append("    certIssuerPublicKey: ").append(toIndentedString(certIssuerPublicKey)).append("\n");
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

