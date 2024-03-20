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
 * File represents a specific target that is backed by a file. 
 */

@Schema(name = "TaskSpec_ContainerSpec_Secrets_inner_File", description = "File represents a specific target that is backed by a file. ")
@JsonTypeName("TaskSpec_ContainerSpec_Secrets_inner_File")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecSecretsInnerFile {

  private String name;

  private String UID;

  private String GID;

  private Integer mode;

  public TaskSpecContainerSpecSecretsInnerFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name represents the final filename in the filesystem. 
   * @return name
  */
  
  @Schema(name = "Name", description = "Name represents the final filename in the filesystem. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecContainerSpecSecretsInnerFile UID(String UID) {
    this.UID = UID;
    return this;
  }

  /**
   * UID represents the file UID.
   * @return UID
  */
  
  @Schema(name = "UID", description = "UID represents the file UID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UID")
  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public TaskSpecContainerSpecSecretsInnerFile GID(String GID) {
    this.GID = GID;
    return this;
  }

  /**
   * GID represents the file GID.
   * @return GID
  */
  
  @Schema(name = "GID", description = "GID represents the file GID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GID")
  public String getGID() {
    return GID;
  }

  public void setGID(String GID) {
    this.GID = GID;
  }

  public TaskSpecContainerSpecSecretsInnerFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Mode represents the FileMode of the file.
   * @return mode
  */
  
  @Schema(name = "Mode", description = "Mode represents the FileMode of the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecSecretsInnerFile taskSpecContainerSpecSecretsInnerFile = (TaskSpecContainerSpecSecretsInnerFile) o;
    return Objects.equals(this.name, taskSpecContainerSpecSecretsInnerFile.name) &&
        Objects.equals(this.UID, taskSpecContainerSpecSecretsInnerFile.UID) &&
        Objects.equals(this.GID, taskSpecContainerSpecSecretsInnerFile.GID) &&
        Objects.equals(this.mode, taskSpecContainerSpecSecretsInnerFile.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, UID, GID, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecSecretsInnerFile {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

