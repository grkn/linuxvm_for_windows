package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.ClusterVolumeSpecAccessModeAccessibilityRequirements;
import com.tgf.vm.model.ClusterVolumeSpecAccessModeCapacityRange;
import com.tgf.vm.model.ClusterVolumeSpecAccessModeSecretsInner;
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
 * Defines how the volume is used by tasks. 
 */

@Schema(name = "ClusterVolumeSpec_AccessMode", description = "Defines how the volume is used by tasks. ")
@JsonTypeName("ClusterVolumeSpec_AccessMode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeSpecAccessMode {

  /**
   * The set of nodes this volume can be used on at one time. - `single` The volume may only be scheduled to one node at a time. - `multi` the volume may be scheduled to any supported number of nodes at a time. 
   */
  public enum ScopeEnum {
    SINGLE("single"),
    
    MULTI("multi");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ScopeEnum scope = ScopeEnum.SINGLE;

  /**
   * The number and way that different tasks can use this volume at one time. - `none` The volume may only be used by one task at a time. - `readonly` The volume may be used by any number of tasks, but they all must mount the volume as readonly - `onewriter` The volume may be used by any number of tasks, but only one may mount it as read/write. - `all` The volume may have any number of readers and writers. 
   */
  public enum SharingEnum {
    NONE("none"),
    
    READONLY("readonly"),
    
    ONEWRITER("onewriter"),
    
    ALL("all");

    private String value;

    SharingEnum(String value) {
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
    public static SharingEnum fromValue(String value) {
      for (SharingEnum b : SharingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SharingEnum sharing = SharingEnum.NONE;

  private Object mountVolume;

  @Valid
  private List<@Valid ClusterVolumeSpecAccessModeSecretsInner> secrets;

  private ClusterVolumeSpecAccessModeAccessibilityRequirements accessibilityRequirements;

  private ClusterVolumeSpecAccessModeCapacityRange capacityRange;

  /**
   * The availability of the volume for use in tasks. - `active` The volume is fully available for scheduling on the cluster - `pause` No new workloads should use the volume, but existing workloads are not stopped. - `drain` All workloads using this volume should be stopped and rescheduled, and no new ones should be started. 
   */
  public enum AvailabilityEnum {
    ACTIVE("active"),
    
    PAUSE("pause"),
    
    DRAIN("drain");

    private String value;

    AvailabilityEnum(String value) {
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
    public static AvailabilityEnum fromValue(String value) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AvailabilityEnum availability = AvailabilityEnum.ACTIVE;

  public ClusterVolumeSpecAccessMode scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The set of nodes this volume can be used on at one time. - `single` The volume may only be scheduled to one node at a time. - `multi` the volume may be scheduled to any supported number of nodes at a time. 
   * @return scope
  */
  
  @Schema(name = "Scope", description = "The set of nodes this volume can be used on at one time. - `single` The volume may only be scheduled to one node at a time. - `multi` the volume may be scheduled to any supported number of nodes at a time. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public ClusterVolumeSpecAccessMode sharing(SharingEnum sharing) {
    this.sharing = sharing;
    return this;
  }

  /**
   * The number and way that different tasks can use this volume at one time. - `none` The volume may only be used by one task at a time. - `readonly` The volume may be used by any number of tasks, but they all must mount the volume as readonly - `onewriter` The volume may be used by any number of tasks, but only one may mount it as read/write. - `all` The volume may have any number of readers and writers. 
   * @return sharing
  */
  
  @Schema(name = "Sharing", description = "The number and way that different tasks can use this volume at one time. - `none` The volume may only be used by one task at a time. - `readonly` The volume may be used by any number of tasks, but they all must mount the volume as readonly - `onewriter` The volume may be used by any number of tasks, but only one may mount it as read/write. - `all` The volume may have any number of readers and writers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sharing")
  public SharingEnum getSharing() {
    return sharing;
  }

  public void setSharing(SharingEnum sharing) {
    this.sharing = sharing;
  }

  public ClusterVolumeSpecAccessMode mountVolume(Object mountVolume) {
    this.mountVolume = mountVolume;
    return this;
  }

  /**
   * Options for using this volume as a Mount-type volume.      Either MountVolume or BlockVolume, but not both, must be     present.   properties:     FsType:       type: \"string\"       description: |         Specifies the filesystem type for the mount volume.         Optional.     MountFlags:       type: \"array\"       description: |         Flags to pass when mounting the volume. Optional.       items:         type: \"string\" BlockVolume:   type: \"object\"   description: |     Options for using this volume as a Block-type volume.     Intentionally empty. 
   * @return mountVolume
  */
  
  @Schema(name = "MountVolume", description = "Options for using this volume as a Mount-type volume.      Either MountVolume or BlockVolume, but not both, must be     present.   properties:     FsType:       type: \"string\"       description: |         Specifies the filesystem type for the mount volume.         Optional.     MountFlags:       type: \"array\"       description: |         Flags to pass when mounting the volume. Optional.       items:         type: \"string\" BlockVolume:   type: \"object\"   description: |     Options for using this volume as a Block-type volume.     Intentionally empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MountVolume")
  public Object getMountVolume() {
    return mountVolume;
  }

  public void setMountVolume(Object mountVolume) {
    this.mountVolume = mountVolume;
  }

  public ClusterVolumeSpecAccessMode secrets(List<@Valid ClusterVolumeSpecAccessModeSecretsInner> secrets) {
    this.secrets = secrets;
    return this;
  }

  public ClusterVolumeSpecAccessMode addSecretsItem(ClusterVolumeSpecAccessModeSecretsInner secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Swarm Secrets that are passed to the CSI storage plugin when operating on this volume. 
   * @return secrets
  */
  @Valid 
  @Schema(name = "Secrets", description = "Swarm Secrets that are passed to the CSI storage plugin when operating on this volume. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Secrets")
  public List<@Valid ClusterVolumeSpecAccessModeSecretsInner> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<@Valid ClusterVolumeSpecAccessModeSecretsInner> secrets) {
    this.secrets = secrets;
  }

  public ClusterVolumeSpecAccessMode accessibilityRequirements(ClusterVolumeSpecAccessModeAccessibilityRequirements accessibilityRequirements) {
    this.accessibilityRequirements = accessibilityRequirements;
    return this;
  }

  /**
   * Get accessibilityRequirements
   * @return accessibilityRequirements
  */
  @Valid 
  @Schema(name = "AccessibilityRequirements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessibilityRequirements")
  public ClusterVolumeSpecAccessModeAccessibilityRequirements getAccessibilityRequirements() {
    return accessibilityRequirements;
  }

  public void setAccessibilityRequirements(ClusterVolumeSpecAccessModeAccessibilityRequirements accessibilityRequirements) {
    this.accessibilityRequirements = accessibilityRequirements;
  }

  public ClusterVolumeSpecAccessMode capacityRange(ClusterVolumeSpecAccessModeCapacityRange capacityRange) {
    this.capacityRange = capacityRange;
    return this;
  }

  /**
   * Get capacityRange
   * @return capacityRange
  */
  @Valid 
  @Schema(name = "CapacityRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CapacityRange")
  public ClusterVolumeSpecAccessModeCapacityRange getCapacityRange() {
    return capacityRange;
  }

  public void setCapacityRange(ClusterVolumeSpecAccessModeCapacityRange capacityRange) {
    this.capacityRange = capacityRange;
  }

  public ClusterVolumeSpecAccessMode availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * The availability of the volume for use in tasks. - `active` The volume is fully available for scheduling on the cluster - `pause` No new workloads should use the volume, but existing workloads are not stopped. - `drain` All workloads using this volume should be stopped and rescheduled, and no new ones should be started. 
   * @return availability
  */
  
  @Schema(name = "Availability", description = "The availability of the volume for use in tasks. - `active` The volume is fully available for scheduling on the cluster - `pause` No new workloads should use the volume, but existing workloads are not stopped. - `drain` All workloads using this volume should be stopped and rescheduled, and no new ones should be started. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Availability")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpecAccessMode clusterVolumeSpecAccessMode = (ClusterVolumeSpecAccessMode) o;
    return Objects.equals(this.scope, clusterVolumeSpecAccessMode.scope) &&
        Objects.equals(this.sharing, clusterVolumeSpecAccessMode.sharing) &&
        Objects.equals(this.mountVolume, clusterVolumeSpecAccessMode.mountVolume) &&
        Objects.equals(this.secrets, clusterVolumeSpecAccessMode.secrets) &&
        Objects.equals(this.accessibilityRequirements, clusterVolumeSpecAccessMode.accessibilityRequirements) &&
        Objects.equals(this.capacityRange, clusterVolumeSpecAccessMode.capacityRange) &&
        Objects.equals(this.availability, clusterVolumeSpecAccessMode.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, sharing, mountVolume, secrets, accessibilityRequirements, capacityRange, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpecAccessMode {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    mountVolume: ").append(toIndentedString(mountVolume)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    accessibilityRequirements: ").append(toIndentedString(accessibilityRequirements)).append("\n");
    sb.append("    capacityRange: ").append(toIndentedString(capacityRange)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

