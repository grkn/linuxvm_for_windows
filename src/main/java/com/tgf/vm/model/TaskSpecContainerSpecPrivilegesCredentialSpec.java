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
 * CredentialSpec for managed service account (Windows only)
 */

@Schema(name = "TaskSpec_ContainerSpec_Privileges_CredentialSpec", description = "CredentialSpec for managed service account (Windows only)")
@JsonTypeName("TaskSpec_ContainerSpec_Privileges_CredentialSpec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecPrivilegesCredentialSpec {

  private String config;

  private String file;

  private String registry;

  public TaskSpecContainerSpecPrivilegesCredentialSpec config(String config) {
    this.config = config;
    return this;
  }

  /**
   * Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return config
  */
  
  @Schema(name = "Config", example = "0bt9dmxjvjiqermk6xrop3ekq", description = "Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Config")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Load credential spec from this file. The file is read by the daemon, and must be present in the `CredentialSpecs` subdirectory in the docker data directory, which defaults to `C:\\ProgramData\\Docker\\` on Windows.  For example, specifying `spec.json` loads `C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json`.  <p><br /></p>  > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return file
  */
  
  @Schema(name = "File", example = "spec.json", description = "Load credential spec from this file. The file is read by the daemon, and must be present in the `CredentialSpecs` subdirectory in the docker data directory, which defaults to `C:\\ProgramData\\Docker\\` on Windows.  For example, specifying `spec.json` loads `C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json`.  <p><br /></p>  > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("File")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec registry(String registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Load credential spec from this value in the Windows registry. The specified registry value must be located in:  `HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs`  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return registry
  */
  
  @Schema(name = "Registry", description = "Load credential spec from this value in the Windows registry. The specified registry value must be located in:  `HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs`  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Registry")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesCredentialSpec taskSpecContainerSpecPrivilegesCredentialSpec = (TaskSpecContainerSpecPrivilegesCredentialSpec) o;
    return Objects.equals(this.config, taskSpecContainerSpecPrivilegesCredentialSpec.config) &&
        Objects.equals(this.file, taskSpecContainerSpecPrivilegesCredentialSpec.file) &&
        Objects.equals(this.registry, taskSpecContainerSpecPrivilegesCredentialSpec.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, file, registry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesCredentialSpec {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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

