package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * OK response to ContainerTop operation
 */

@Schema(name = "ContainerTopResponse", description = "OK response to ContainerTop operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerTopResponse {

  @Valid
  private List<String> titles;

  @Valid
  private List<List<String>> processes;

  public ContainerTopResponse titles(List<String> titles) {
    this.titles = titles;
    return this;
  }

  public ContainerTopResponse addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * The ps column titles
   * @return titles
  */
  
  @Schema(name = "Titles", description = "The ps column titles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Titles")
  public List<String> getTitles() {
    return titles;
  }

  public void setTitles(List<String> titles) {
    this.titles = titles;
  }

  public ContainerTopResponse processes(List<List<String>> processes) {
    this.processes = processes;
    return this;
  }

  public ContainerTopResponse addProcessesItem(List<String> processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Each process running in the container, where each is process is an array of values corresponding to the titles. 
   * @return processes
  */
  @Valid 
  @Schema(name = "Processes", description = "Each process running in the container, where each is process is an array of values corresponding to the titles. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Processes")
  public List<List<String>> getProcesses() {
    return processes;
  }

  public void setProcesses(List<List<String>> processes) {
    this.processes = processes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTopResponse containerTopResponse = (ContainerTopResponse) o;
    return Objects.equals(this.titles, containerTopResponse.titles) &&
        Objects.equals(this.processes, containerTopResponse.processes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titles, processes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTopResponse {\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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

