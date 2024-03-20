package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.ChangeType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Change in the container&#39;s filesystem. 
 */

@Schema(name = "FilesystemChange", description = "Change in the container's filesystem. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class FilesystemChange {

  private String path;

  private ChangeType kind;

  public FilesystemChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FilesystemChange(String path, ChangeType kind) {
    this.path = path;
    this.kind = kind;
  }

  public FilesystemChange path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to file or directory that has changed. 
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", description = "Path to file or directory that has changed. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FilesystemChange kind(ChangeType kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  @NotNull @Valid 
  @Schema(name = "Kind", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Kind")
  public ChangeType getKind() {
    return kind;
  }

  public void setKind(ChangeType kind) {
    this.kind = kind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesystemChange filesystemChange = (FilesystemChange) o;
    return Objects.equals(this.path, filesystemChange.path) &&
        Objects.equals(this.kind, filesystemChange.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesystemChange {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

