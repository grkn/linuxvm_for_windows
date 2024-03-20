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
 * Parameters related to encryption-at-rest.
 */

@Schema(name = "SwarmSpec_EncryptionConfig", description = "Parameters related to encryption-at-rest.")
@JsonTypeName("SwarmSpec_EncryptionConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecEncryptionConfig {

  private Boolean autoLockManagers;

  public SwarmSpecEncryptionConfig autoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
    return this;
  }

  /**
   * If set, generate a key and use it to lock data stored on the managers. 
   * @return autoLockManagers
  */
  
  @Schema(name = "AutoLockManagers", example = "false", description = "If set, generate a key and use it to lock data stored on the managers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoLockManagers")
  public Boolean getAutoLockManagers() {
    return autoLockManagers;
  }

  public void setAutoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecEncryptionConfig swarmSpecEncryptionConfig = (SwarmSpecEncryptionConfig) o;
    return Objects.equals(this.autoLockManagers, swarmSpecEncryptionConfig.autoLockManagers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLockManagers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecEncryptionConfig {\n");
    sb.append("    autoLockManagers: ").append(toIndentedString(autoLockManagers)).append("\n");
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

