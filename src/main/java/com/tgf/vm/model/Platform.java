package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Platform represents the platform (Arch/OS). 
 */

@Schema(name = "Platform", description = "Platform represents the platform (Arch/OS). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Platform {

  private String architecture;

  private String OS;

  public Platform architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Architecture represents the hardware architecture (for example, `x86_64`). 
   * @return architecture
  */
  
  @Schema(name = "Architecture", example = "x86_64", description = "Architecture represents the hardware architecture (for example, `x86_64`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public Platform OS(String OS) {
    this.OS = OS;
    return this;
  }

  /**
   * OS represents the Operating System (for example, `linux` or `windows`). 
   * @return OS
  */
  
  @Schema(name = "OS", example = "linux", description = "OS represents the Operating System (for example, `linux` or `windows`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OS")
  public String getOS() {
    return OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.architecture, platform.architecture) &&
        Objects.equals(this.OS, platform.OS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, OS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
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

