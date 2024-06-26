package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TaskState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public enum TaskState {
  
  NEW("new"),
  
  ALLOCATED("allocated"),
  
  PENDING("pending"),
  
  ASSIGNED("assigned"),
  
  ACCEPTED("accepted"),
  
  PREPARING("preparing"),
  
  READY("ready"),
  
  STARTING("starting"),
  
  RUNNING("running"),
  
  COMPLETE("complete"),
  
  SHUTDOWN("shutdown"),
  
  FAILED("failed"),
  
  REJECTED("rejected"),
  
  REMOVE("remove"),
  
  ORPHANED("orphaned");

  private String value;

  TaskState(String value) {
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
  public static TaskState fromValue(String value) {
    for (TaskState b : TaskState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

