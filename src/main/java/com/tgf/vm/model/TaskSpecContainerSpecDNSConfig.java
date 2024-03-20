package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Specification for DNS related configurations in resolver configuration file (&#x60;resolv.conf&#x60;). 
 */

@Schema(name = "TaskSpec_ContainerSpec_DNSConfig", description = "Specification for DNS related configurations in resolver configuration file (`resolv.conf`). ")
@JsonTypeName("TaskSpec_ContainerSpec_DNSConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecContainerSpecDNSConfig {

  @Valid
  private List<String> nameservers;

  @Valid
  private List<String> search;

  @Valid
  private List<String> options;

  public TaskSpecContainerSpecDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

  /**
   * The IP addresses of the name servers.
   * @return nameservers
  */
  
  @Schema(name = "Nameservers", description = "The IP addresses of the name servers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nameservers")
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  public TaskSpecContainerSpecDNSConfig search(List<String> search) {
    this.search = search;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addSearchItem(String searchItem) {
    if (this.search == null) {
      this.search = new ArrayList<>();
    }
    this.search.add(searchItem);
    return this;
  }

  /**
   * A search list for host-name lookup.
   * @return search
  */
  
  @Schema(name = "Search", description = "A search list for host-name lookup.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Search")
  public List<String> getSearch() {
    return search;
  }

  public void setSearch(List<String> search) {
    this.search = search;
  }

  public TaskSpecContainerSpecDNSConfig options(List<String> options) {
    this.options = options;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.). 
   * @return options
  */
  
  @Schema(name = "Options", description = "A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Options")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecDNSConfig taskSpecContainerSpecDNSConfig = (TaskSpecContainerSpecDNSConfig) o;
    return Objects.equals(this.nameservers, taskSpecContainerSpecDNSConfig.nameservers) &&
        Objects.equals(this.search, taskSpecContainerSpecDNSConfig.search) &&
        Objects.equals(this.options, taskSpecContainerSpecDNSConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, search, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecDNSConfig {\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

