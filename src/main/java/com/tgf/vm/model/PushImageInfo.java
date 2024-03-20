package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ProgressDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PushImageInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PushImageInfo {

  private String error;

  private String status;

  private String progress;

  private ProgressDetail progressDetail;

  public PushImageInfo error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public PushImageInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PushImageInfo progress(String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
  */
  
  @Schema(name = "progress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public PushImageInfo progressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
    return this;
  }

  /**
   * Get progressDetail
   * @return progressDetail
  */
  @Valid 
  @Schema(name = "progressDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressDetail")
  public ProgressDetail getProgressDetail() {
    return progressDetail;
  }

  public void setProgressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushImageInfo pushImageInfo = (PushImageInfo) o;
    return Objects.equals(this.error, pushImageInfo.error) &&
        Objects.equals(this.status, pushImageInfo.status) &&
        Objects.equals(this.progress, pushImageInfo.progress) &&
        Objects.equals(this.progressDetail, pushImageInfo.progressDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, status, progress, progressDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushImageInfo {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    progressDetail: ").append(toIndentedString(progressDetail)).append("\n");
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

