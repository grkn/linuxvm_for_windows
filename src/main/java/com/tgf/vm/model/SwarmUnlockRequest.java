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
 * SwarmUnlockRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmUnlockRequest {

  private String unlockKey;

  public SwarmUnlockRequest unlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
    return this;
  }

  /**
   * The swarm's unlock key.
   * @return unlockKey
  */
  
  @Schema(name = "UnlockKey", description = "The swarm's unlock key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnlockKey")
  public String getUnlockKey() {
    return unlockKey;
  }

  public void setUnlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmUnlockRequest swarmUnlockRequest = (SwarmUnlockRequest) o;
    return Objects.equals(this.unlockKey, swarmUnlockRequest.unlockKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlockKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmUnlockRequest {\n");
    sb.append("    unlockKey: ").append(toIndentedString(unlockKey)).append("\n");
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

