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
 * ServiceCreateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceCreateResponse {

  private String ID;

  private String warning;

  public ServiceCreateResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the created service.
   * @return ID
  */
  
  @Schema(name = "ID", description = "The ID of the created service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ServiceCreateResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Optional warning message
   * @return warning
  */
  
  @Schema(name = "Warning", description = "Optional warning message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ServiceCreateResponse serviceCreateResponse = (ServiceCreateResponse) o;
    return Objects.equals(this.ID, serviceCreateResponse.ID) &&
        Objects.equals(this.warning, serviceCreateResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCreateResponse {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
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

