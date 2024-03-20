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
 * An object describing a limit on resources which can be requested by a task. 
 */

@Schema(name = "Limit", description = "An object describing a limit on resources which can be requested by a task. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Limit {

  private Long nanoCPUs;

  private Long memoryBytes;

  private Long pids = 0l;

  public Limit nanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
    return this;
  }

  /**
   * Get nanoCPUs
   * @return nanoCPUs
  */
  
  @Schema(name = "NanoCPUs", example = "4000000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NanoCPUs")
  public Long getNanoCPUs() {
    return nanoCPUs;
  }

  public void setNanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
  }

  public Limit memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

  /**
   * Get memoryBytes
   * @return memoryBytes
  */
  
  @Schema(name = "MemoryBytes", example = "8272408576", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemoryBytes")
  public Long getMemoryBytes() {
    return memoryBytes;
  }

  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }

  public Limit pids(Long pids) {
    this.pids = pids;
    return this;
  }

  /**
   * Limits the maximum number of PIDs in the container. Set `0` for unlimited. 
   * @return pids
  */
  
  @Schema(name = "Pids", example = "100", description = "Limits the maximum number of PIDs in the container. Set `0` for unlimited. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Pids")
  public Long getPids() {
    return pids;
  }

  public void setPids(Long pids) {
    this.pids = pids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limit limit = (Limit) o;
    return Objects.equals(this.nanoCPUs, limit.nanoCPUs) &&
        Objects.equals(this.memoryBytes, limit.memoryBytes) &&
        Objects.equals(this.pids, limit.pids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanoCPUs, memoryBytes, pids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    sb.append("    nanoCPUs: ").append(toIndentedString(nanoCPUs)).append("\n");
    sb.append("    memoryBytes: ").append(toIndentedString(memoryBytes)).append("\n");
    sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
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

