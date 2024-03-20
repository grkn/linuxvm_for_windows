package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.TaskSpecContainerSpecSecretsInnerFile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskSpecContainerSpecSecretsInner
 */

@JsonTypeName("TaskSpec_ContainerSpec_Secrets_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecSecretsInner {

  private TaskSpecContainerSpecSecretsInnerFile file;

  private String secretID;

  private String secretName;

  public TaskSpecContainerSpecSecretsInner file(TaskSpecContainerSpecSecretsInnerFile file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @Valid 
  @Schema(name = "File", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("File")
  public TaskSpecContainerSpecSecretsInnerFile getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecSecretsInnerFile file) {
    this.file = file;
  }

  public TaskSpecContainerSpecSecretsInner secretID(String secretID) {
    this.secretID = secretID;
    return this;
  }

  /**
   * SecretID represents the ID of the specific secret that we're referencing. 
   * @return secretID
  */
  
  @Schema(name = "SecretID", description = "SecretID represents the ID of the specific secret that we're referencing. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecretID")
  public String getSecretID() {
    return secretID;
  }

  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }

  public TaskSpecContainerSpecSecretsInner secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID. 
   * @return secretName
  */
  
  @Schema(name = "SecretName", description = "SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecretName")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecSecretsInner taskSpecContainerSpecSecretsInner = (TaskSpecContainerSpecSecretsInner) o;
    return Objects.equals(this.file, taskSpecContainerSpecSecretsInner.file) &&
        Objects.equals(this.secretID, taskSpecContainerSpecSecretsInner.secretID) &&
        Objects.equals(this.secretName, taskSpecContainerSpecSecretsInner.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, secretID, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecSecretsInner {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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

