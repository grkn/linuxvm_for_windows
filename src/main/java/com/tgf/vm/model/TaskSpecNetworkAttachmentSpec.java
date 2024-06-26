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
 * Read-only spec type for non-swarm containers attached to swarm overlay networks.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 */

@Schema(name = "TaskSpec_NetworkAttachmentSpec", description = "Read-only spec type for non-swarm containers attached to swarm overlay networks.  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`. ")
@JsonTypeName("TaskSpec_NetworkAttachmentSpec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecNetworkAttachmentSpec {

  private String containerID;

  public TaskSpecNetworkAttachmentSpec containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * ID of the container represented by this task
   * @return containerID
  */
  
  @Schema(name = "ContainerID", description = "ID of the container represented by this task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecNetworkAttachmentSpec taskSpecNetworkAttachmentSpec = (TaskSpecNetworkAttachmentSpec) o;
    return Objects.equals(this.containerID, taskSpecNetworkAttachmentSpec.containerID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecNetworkAttachmentSpec {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
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

