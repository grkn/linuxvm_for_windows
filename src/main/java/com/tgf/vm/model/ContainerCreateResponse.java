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
 * OK response to ContainerCreate operation
 */

@Schema(name = "ContainerCreateResponse", description = "OK response to ContainerCreate operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerCreateResponse {

  private String id;

  @Valid
  private List<String> warnings = new ArrayList<>();

  public ContainerCreateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContainerCreateResponse(String id, List<String> warnings) {
    this.id = id;
    this.warnings = warnings;
  }

  public ContainerCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the created container
   * @return id
  */
  @NotNull 
  @Schema(name = "Id", example = "ede54ee1afda366ab42f824e8a5ffd195155d853ceaec74a927f249ea270c743", description = "The ID of the created container", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerCreateResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ContainerCreateResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Warnings encountered when creating the container
   * @return warnings
  */
  @NotNull 
  @Schema(name = "Warnings", example = "[]", description = "Warnings encountered when creating the container", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCreateResponse containerCreateResponse = (ContainerCreateResponse) o;
    return Objects.equals(this.id, containerCreateResponse.id) &&
        Objects.equals(this.warnings, containerCreateResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerCreateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

