package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.SystemVersionComponentsInner;
import com.tgf.vm.model.SystemVersionPlatform;
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
 * Response of Engine API: GET \&quot;/version\&quot; 
 */

@Schema(name = "SystemVersion", description = "Response of Engine API: GET \"/version\" ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemVersion {

  private SystemVersionPlatform platform;

  @Valid
  private List<@Valid SystemVersionComponentsInner> components;

  private String version;

  private String apiVersion;

  private String minAPIVersion;

  private String gitCommit;

  private String goVersion;

  private String os;

  private String arch;

  private String kernelVersion;

  private Boolean experimental;

  private String buildTime;

  public SystemVersion platform(SystemVersionPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "Platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Platform")
  public SystemVersionPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(SystemVersionPlatform platform) {
    this.platform = platform;
  }

  public SystemVersion components(List<@Valid SystemVersionComponentsInner> components) {
    this.components = components;
    return this;
  }

  public SystemVersion addComponentsItem(SystemVersionComponentsInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Information about system components 
   * @return components
  */
  @Valid 
  @Schema(name = "Components", description = "Information about system components ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Components")
  public List<@Valid SystemVersionComponentsInner> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid SystemVersionComponentsInner> components) {
    this.components = components;
  }

  public SystemVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the daemon
   * @return version
  */
  
  @Schema(name = "Version", example = "19.03.12", description = "The version of the daemon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemVersion apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The default (and highest) API version that is supported by the daemon 
   * @return apiVersion
  */
  
  @Schema(name = "ApiVersion", example = "1.40", description = "The default (and highest) API version that is supported by the daemon ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public SystemVersion minAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
    return this;
  }

  /**
   * The minimum API version that is supported by the daemon 
   * @return minAPIVersion
  */
  
  @Schema(name = "MinAPIVersion", example = "1.12", description = "The minimum API version that is supported by the daemon ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinAPIVersion")
  public String getMinAPIVersion() {
    return minAPIVersion;
  }

  public void setMinAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
  }

  public SystemVersion gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * The Git commit of the source code that was used to build the daemon 
   * @return gitCommit
  */
  
  @Schema(name = "GitCommit", example = "48a66213fe", description = "The Git commit of the source code that was used to build the daemon ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GitCommit")
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public SystemVersion goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * The version Go used to compile the daemon, and the version of the Go runtime in use. 
   * @return goVersion
  */
  
  @Schema(name = "GoVersion", example = "go1.13.14", description = "The version Go used to compile the daemon, and the version of the Go runtime in use. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GoVersion")
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }

  public SystemVersion os(String os) {
    this.os = os;
    return this;
  }

  /**
   * The operating system that the daemon is running on (\"linux\" or \"windows\") 
   * @return os
  */
  
  @Schema(name = "Os", example = "linux", description = "The operating system that the daemon is running on (\"linux\" or \"windows\") ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public SystemVersion arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * The architecture that the daemon is running on 
   * @return arch
  */
  
  @Schema(name = "Arch", example = "amd64", description = "The architecture that the daemon is running on ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Arch")
  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }

  public SystemVersion kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty. 
   * @return kernelVersion
  */
  
  @Schema(name = "KernelVersion", example = "4.19.76-linuxkit", description = "The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KernelVersion")
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public SystemVersion experimental(Boolean experimental) {
    this.experimental = experimental;
    return this;
  }

  /**
   * Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false. 
   * @return experimental
  */
  
  @Schema(name = "Experimental", example = "true", description = "Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Experimental")
  public Boolean getExperimental() {
    return experimental;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  public SystemVersion buildTime(String buildTime) {
    this.buildTime = buildTime;
    return this;
  }

  /**
   * The date and time that the daemon was compiled. 
   * @return buildTime
  */
  
  @Schema(name = "BuildTime", example = "2020-06-22T15:49:27.000000000+00:00", description = "The date and time that the daemon was compiled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildTime")
  public String getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemVersion systemVersion = (SystemVersion) o;
    return Objects.equals(this.platform, systemVersion.platform) &&
        Objects.equals(this.components, systemVersion.components) &&
        Objects.equals(this.version, systemVersion.version) &&
        Objects.equals(this.apiVersion, systemVersion.apiVersion) &&
        Objects.equals(this.minAPIVersion, systemVersion.minAPIVersion) &&
        Objects.equals(this.gitCommit, systemVersion.gitCommit) &&
        Objects.equals(this.goVersion, systemVersion.goVersion) &&
        Objects.equals(this.os, systemVersion.os) &&
        Objects.equals(this.arch, systemVersion.arch) &&
        Objects.equals(this.kernelVersion, systemVersion.kernelVersion) &&
        Objects.equals(this.experimental, systemVersion.experimental) &&
        Objects.equals(this.buildTime, systemVersion.buildTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, components, version, apiVersion, minAPIVersion, gitCommit, goVersion, os, arch, kernelVersion, experimental, buildTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemVersion {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    minAPIVersion: ").append(toIndentedString(minAPIVersion)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    experimental: ").append(toIndentedString(experimental)).append("\n");
    sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
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

