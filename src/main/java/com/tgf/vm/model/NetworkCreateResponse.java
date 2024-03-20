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
 * NetworkCreateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkCreateResponse {

  private String id;

  private String warning;

  public NetworkCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the created network.
   * @return id
  */
  
  @Schema(name = "Id", description = "The ID of the created network.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NetworkCreateResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * @return warning
  */
  
  @Schema(name = "Warning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Warning")
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkCreateResponse networkCreateResponse = (NetworkCreateResponse) o;
    return Objects.equals(this.id, networkCreateResponse.id) &&
        Objects.equals(this.warning, networkCreateResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkCreateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

