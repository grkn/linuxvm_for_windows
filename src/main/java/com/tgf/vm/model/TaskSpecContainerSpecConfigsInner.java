package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.TaskSpecContainerSpecConfigsInnerFile;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskSpecContainerSpecConfigsInner
 */

@JsonTypeName("TaskSpec_ContainerSpec_Configs_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecConfigsInner {

  private TaskSpecContainerSpecConfigsInnerFile file;

  private Object runtime;

  private String configID;

  private String configName;

  public TaskSpecContainerSpecConfigsInner file(TaskSpecContainerSpecConfigsInnerFile file) {
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
  public TaskSpecContainerSpecConfigsInnerFile getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecConfigsInnerFile file) {
    this.file = file;
  }

  public TaskSpecContainerSpecConfigsInner runtime(Object runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive 
   * @return runtime
  */
  
  @Schema(name = "Runtime", description = "Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Runtime")
  public Object getRuntime() {
    return runtime;
  }

  public void setRuntime(Object runtime) {
    this.runtime = runtime;
  }

  public TaskSpecContainerSpecConfigsInner configID(String configID) {
    this.configID = configID;
    return this;
  }

  /**
   * ConfigID represents the ID of the specific config that we're referencing. 
   * @return configID
  */
  
  @Schema(name = "ConfigID", description = "ConfigID represents the ID of the specific config that we're referencing. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConfigID")
  public String getConfigID() {
    return configID;
  }

  public void setConfigID(String configID) {
    this.configID = configID;
  }

  public TaskSpecContainerSpecConfigsInner configName(String configName) {
    this.configName = configName;
    return this;
  }

  /**
   * ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID. 
   * @return configName
  */
  
  @Schema(name = "ConfigName", description = "ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConfigName")
  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecConfigsInner taskSpecContainerSpecConfigsInner = (TaskSpecContainerSpecConfigsInner) o;
    return Objects.equals(this.file, taskSpecContainerSpecConfigsInner.file) &&
        Objects.equals(this.runtime, taskSpecContainerSpecConfigsInner.runtime) &&
        Objects.equals(this.configID, taskSpecContainerSpecConfigsInner.configID) &&
        Objects.equals(this.configName, taskSpecContainerSpecConfigsInner.configName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, runtime, configID, configName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecConfigsInner {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    configID: ").append(toIndentedString(configID)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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

