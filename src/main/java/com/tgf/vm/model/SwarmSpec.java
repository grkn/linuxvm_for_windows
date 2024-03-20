package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.SwarmSpecCAConfig;
import com.tgf.vm.model.SwarmSpecDispatcher;
import com.tgf.vm.model.SwarmSpecEncryptionConfig;
import com.tgf.vm.model.SwarmSpecOrchestration;
import com.tgf.vm.model.SwarmSpecRaft;
import com.tgf.vm.model.SwarmSpecTaskDefaults;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User modifiable swarm configuration.
 */

@Schema(name = "SwarmSpec", description = "User modifiable swarm configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpec {

  private String name;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private JsonNullable<SwarmSpecOrchestration> orchestration = JsonNullable.<SwarmSpecOrchestration>undefined();

  private SwarmSpecRaft raft;

  private JsonNullable<SwarmSpecDispatcher> dispatcher = JsonNullable.<SwarmSpecDispatcher>undefined();

  private JsonNullable<SwarmSpecCAConfig> caConfig = JsonNullable.<SwarmSpecCAConfig>undefined();

  private SwarmSpecEncryptionConfig encryptionConfig;

  private SwarmSpecTaskDefaults taskDefaults;

  public SwarmSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the swarm.
   * @return name
  */
  
  @Schema(name = "Name", example = "default", description = "Name of the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwarmSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SwarmSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  
  @Schema(name = "Labels", example = "{\"com.example.corp.type\":\"production\",\"com.example.corp.department\":\"engineering\"}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SwarmSpec orchestration(SwarmSpecOrchestration orchestration) {
    this.orchestration = JsonNullable.of(orchestration);
    return this;
  }

  /**
   * Get orchestration
   * @return orchestration
  */
  @Valid 
  @Schema(name = "Orchestration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Orchestration")
  public JsonNullable<SwarmSpecOrchestration> getOrchestration() {
    return orchestration;
  }

  public void setOrchestration(JsonNullable<SwarmSpecOrchestration> orchestration) {
    this.orchestration = orchestration;
  }

  public SwarmSpec raft(SwarmSpecRaft raft) {
    this.raft = raft;
    return this;
  }

  /**
   * Get raft
   * @return raft
  */
  @Valid 
  @Schema(name = "Raft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Raft")
  public SwarmSpecRaft getRaft() {
    return raft;
  }

  public void setRaft(SwarmSpecRaft raft) {
    this.raft = raft;
  }

  public SwarmSpec dispatcher(SwarmSpecDispatcher dispatcher) {
    this.dispatcher = JsonNullable.of(dispatcher);
    return this;
  }

  /**
   * Get dispatcher
   * @return dispatcher
  */
  @Valid 
  @Schema(name = "Dispatcher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Dispatcher")
  public JsonNullable<SwarmSpecDispatcher> getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(JsonNullable<SwarmSpecDispatcher> dispatcher) {
    this.dispatcher = dispatcher;
  }

  public SwarmSpec caConfig(SwarmSpecCAConfig caConfig) {
    this.caConfig = JsonNullable.of(caConfig);
    return this;
  }

  /**
   * Get caConfig
   * @return caConfig
  */
  @Valid 
  @Schema(name = "CAConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CAConfig")
  public JsonNullable<SwarmSpecCAConfig> getCaConfig() {
    return caConfig;
  }

  public void setCaConfig(JsonNullable<SwarmSpecCAConfig> caConfig) {
    this.caConfig = caConfig;
  }

  public SwarmSpec encryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Get encryptionConfig
   * @return encryptionConfig
  */
  @Valid 
  @Schema(name = "EncryptionConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EncryptionConfig")
  public SwarmSpecEncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  public void setEncryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
  }

  public SwarmSpec taskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
    return this;
  }

  /**
   * Get taskDefaults
   * @return taskDefaults
  */
  @Valid 
  @Schema(name = "TaskDefaults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaskDefaults")
  public SwarmSpecTaskDefaults getTaskDefaults() {
    return taskDefaults;
  }

  public void setTaskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpec swarmSpec = (SwarmSpec) o;
    return Objects.equals(this.name, swarmSpec.name) &&
        Objects.equals(this.labels, swarmSpec.labels) &&
        equalsNullable(this.orchestration, swarmSpec.orchestration) &&
        Objects.equals(this.raft, swarmSpec.raft) &&
        equalsNullable(this.dispatcher, swarmSpec.dispatcher) &&
        equalsNullable(this.caConfig, swarmSpec.caConfig) &&
        Objects.equals(this.encryptionConfig, swarmSpec.encryptionConfig) &&
        Objects.equals(this.taskDefaults, swarmSpec.taskDefaults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, hashCodeNullable(orchestration), raft, hashCodeNullable(dispatcher), hashCodeNullable(caConfig), encryptionConfig, taskDefaults);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpec {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    orchestration: ").append(toIndentedString(orchestration)).append("\n");
    sb.append("    raft: ").append(toIndentedString(raft)).append("\n");
    sb.append("    dispatcher: ").append(toIndentedString(dispatcher)).append("\n");
    sb.append("    caConfig: ").append(toIndentedString(caConfig)).append("\n");
    sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
    sb.append("    taskDefaults: ").append(toIndentedString(taskDefaults)).append("\n");
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

