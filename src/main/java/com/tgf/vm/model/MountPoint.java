package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MountPoint
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class MountPoint {

  /**
   * Gets or Sets type
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

  private String name;

  private String source;

  private String destination;

  private String driver;

  private String mode;

  private Boolean RW;

  private String propagation;

  public MountPoint type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", example = "volume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MountPoint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", example = "myvolume", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MountPoint source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "Source", example = "/var/lib/docker/volumes/myvolume/_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MountPoint destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  
  @Schema(name = "Destination", example = "/usr/share/nginx/html/", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Destination")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public MountPoint driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "Driver", example = "local", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public MountPoint mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  
  @Schema(name = "Mode", example = "z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MountPoint RW(Boolean RW) {
    this.RW = RW;
    return this;
  }

  /**
   * Get RW
   * @return RW
  */
  
  @Schema(name = "RW", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RW")
  public Boolean getRW() {
    return RW;
  }

  public void setRW(Boolean RW) {
    this.RW = RW;
  }

  public MountPoint propagation(String propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * Get propagation
   * @return propagation
  */
  
  @Schema(name = "Propagation", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Propagation")
  public String getPropagation() {
    return propagation;
  }

  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountPoint mountPoint = (MountPoint) o;
    return Objects.equals(this.type, mountPoint.type) &&
        Objects.equals(this.name, mountPoint.name) &&
        Objects.equals(this.source, mountPoint.source) &&
        Objects.equals(this.destination, mountPoint.destination) &&
        Objects.equals(this.driver, mountPoint.driver) &&
        Objects.equals(this.mode, mountPoint.mode) &&
        Objects.equals(this.RW, mountPoint.RW) &&
        Objects.equals(this.propagation, mountPoint.propagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, source, destination, driver, mode, RW, propagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountPoint {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    RW: ").append(toIndentedString(RW)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
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

