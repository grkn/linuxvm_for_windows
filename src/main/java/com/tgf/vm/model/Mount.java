package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.MountBindOptions;
import com.tgf.vm.model.MountTmpfsOptions;
import com.tgf.vm.model.MountVolumeOptions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Mount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Mount {

  private String target;

  private String source;

  /**
   * The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. - `cluster` a Swarm cluster volume 
   */
  public enum TypeEnum {
    BIND("bind"),
    
    VOLUME("volume"),
    
    TMPFS("tmpfs"),
    
    NPIPE("npipe"),
    
    CLUSTER("cluster");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private Boolean readOnly;

  private String consistency;

  private MountBindOptions bindOptions;

  private MountVolumeOptions volumeOptions;

  private MountTmpfsOptions tmpfsOptions;

  public Mount target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Container path.
   * @return target
  */
  
  @Schema(name = "Target", description = "Container path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Mount source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Mount source (e.g. a volume name, a host path).
   * @return source
  */
  
  @Schema(name = "Source", description = "Mount source (e.g. a volume name, a host path).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Mount type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. - `cluster` a Swarm cluster volume 
   * @return type
  */
  
  @Schema(name = "Type", description = "The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. - `cluster` a Swarm cluster volume ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Mount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Whether the mount should be read-only.
   * @return readOnly
  */
  
  @Schema(name = "ReadOnly", description = "Whether the mount should be read-only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReadOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public Mount consistency(String consistency) {
    this.consistency = consistency;
    return this;
  }

  /**
   * The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`.
   * @return consistency
  */
  
  @Schema(name = "Consistency", description = "The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Consistency")
  public String getConsistency() {
    return consistency;
  }

  public void setConsistency(String consistency) {
    this.consistency = consistency;
  }

  public Mount bindOptions(MountBindOptions bindOptions) {
    this.bindOptions = bindOptions;
    return this;
  }

  /**
   * Get bindOptions
   * @return bindOptions
  */
  @Valid 
  @Schema(name = "BindOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BindOptions")
  public MountBindOptions getBindOptions() {
    return bindOptions;
  }

  public void setBindOptions(MountBindOptions bindOptions) {
    this.bindOptions = bindOptions;
  }

  public Mount volumeOptions(MountVolumeOptions volumeOptions) {
    this.volumeOptions = volumeOptions;
    return this;
  }

  /**
   * Get volumeOptions
   * @return volumeOptions
  */
  @Valid 
  @Schema(name = "VolumeOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumeOptions")
  public MountVolumeOptions getVolumeOptions() {
    return volumeOptions;
  }

  public void setVolumeOptions(MountVolumeOptions volumeOptions) {
    this.volumeOptions = volumeOptions;
  }

  public Mount tmpfsOptions(MountTmpfsOptions tmpfsOptions) {
    this.tmpfsOptions = tmpfsOptions;
    return this;
  }

  /**
   * Get tmpfsOptions
   * @return tmpfsOptions
  */
  @Valid 
  @Schema(name = "TmpfsOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TmpfsOptions")
  public MountTmpfsOptions getTmpfsOptions() {
    return tmpfsOptions;
  }

  public void setTmpfsOptions(MountTmpfsOptions tmpfsOptions) {
    this.tmpfsOptions = tmpfsOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mount mount = (Mount) o;
    return Objects.equals(this.target, mount.target) &&
        Objects.equals(this.source, mount.source) &&
        Objects.equals(this.type, mount.type) &&
        Objects.equals(this.readOnly, mount.readOnly) &&
        Objects.equals(this.consistency, mount.consistency) &&
        Objects.equals(this.bindOptions, mount.bindOptions) &&
        Objects.equals(this.volumeOptions, mount.volumeOptions) &&
        Objects.equals(this.tmpfsOptions, mount.tmpfsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, source, type, readOnly, consistency, bindOptions, volumeOptions, tmpfsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mount {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
    sb.append("    bindOptions: ").append(toIndentedString(bindOptions)).append("\n");
    sb.append("    volumeOptions: ").append(toIndentedString(volumeOptions)).append("\n");
    sb.append("    tmpfsOptions: ").append(toIndentedString(tmpfsOptions)).append("\n");
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

