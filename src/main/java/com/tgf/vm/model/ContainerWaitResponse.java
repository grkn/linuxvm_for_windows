package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ContainerWaitExitError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OK response to ContainerWait operation
 */

@Schema(name = "ContainerWaitResponse", description = "OK response to ContainerWait operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerWaitResponse {

  private Long statusCode;

  private ContainerWaitExitError error;

  public ContainerWaitResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContainerWaitResponse(Long statusCode) {
    this.statusCode = statusCode;
  }

  public ContainerWaitResponse statusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Exit code of the container
   * @return statusCode
  */
  @NotNull 
  @Schema(name = "StatusCode", description = "Exit code of the container", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StatusCode")
  public Long getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
  }

  public ContainerWaitResponse error(ContainerWaitExitError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @Valid 
  @Schema(name = "Error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public ContainerWaitExitError getError() {
    return error;
  }

  public void setError(ContainerWaitExitError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerWaitResponse containerWaitResponse = (ContainerWaitResponse) o;
    return Objects.equals(this.statusCode, containerWaitResponse.statusCode) &&
        Objects.equals(this.error, containerWaitResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerWaitResponse {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

