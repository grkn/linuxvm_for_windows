package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.PluginPrivilege;
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
 * Plugin spec for the service.  *(Experimental release only.)*  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 */

@Schema(name = "TaskSpec_PluginSpec", description = "Plugin spec for the service.  *(Experimental release only.)*  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`. ")
@JsonTypeName("TaskSpec_PluginSpec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecPluginSpec {

  private String name;

  private String remote;

  private Boolean disabled;

  @Valid
  private List<@Valid PluginPrivilege> pluginPrivilege;

  public TaskSpecPluginSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name or 'alias' to use for the plugin.
   * @return name
  */
  
  @Schema(name = "Name", description = "The name or 'alias' to use for the plugin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecPluginSpec remote(String remote) {
    this.remote = remote;
    return this;
  }

  /**
   * The plugin image reference to use.
   * @return remote
  */
  
  @Schema(name = "Remote", description = "The plugin image reference to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Remote")
  public String getRemote() {
    return remote;
  }

  public void setRemote(String remote) {
    this.remote = remote;
  }

  public TaskSpecPluginSpec disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Disable the plugin once scheduled.
   * @return disabled
  */
  
  @Schema(name = "Disabled", description = "Disable the plugin once scheduled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public TaskSpecPluginSpec pluginPrivilege(List<@Valid PluginPrivilege> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
    return this;
  }

  public TaskSpecPluginSpec addPluginPrivilegeItem(PluginPrivilege pluginPrivilegeItem) {
    if (this.pluginPrivilege == null) {
      this.pluginPrivilege = new ArrayList<>();
    }
    this.pluginPrivilege.add(pluginPrivilegeItem);
    return this;
  }

  /**
   * Get pluginPrivilege
   * @return pluginPrivilege
  */
  @Valid 
  @Schema(name = "PluginPrivilege", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PluginPrivilege")
  public List<@Valid PluginPrivilege> getPluginPrivilege() {
    return pluginPrivilege;
  }

  public void setPluginPrivilege(List<@Valid PluginPrivilege> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPluginSpec taskSpecPluginSpec = (TaskSpecPluginSpec) o;
    return Objects.equals(this.name, taskSpecPluginSpec.name) &&
        Objects.equals(this.remote, taskSpecPluginSpec.remote) &&
        Objects.equals(this.disabled, taskSpecPluginSpec.disabled) &&
        Objects.equals(this.pluginPrivilege, taskSpecPluginSpec.pluginPrivilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, remote, disabled, pluginPrivilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPluginSpec {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    pluginPrivilege: ").append(toIndentedString(pluginPrivilege)).append("\n");
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

