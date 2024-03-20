package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.EventActor;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EventMessage represents the information an event contains. 
 */

@Schema(name = "EventMessage", description = "EventMessage represents the information an event contains. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class EventMessage {

  /**
   * The type of object emitting the event
   */
  public enum TypeEnum {
    BUILDER("builder"),
    
    CONFIG("config"),
    
    CONTAINER("container"),
    
    DAEMON("daemon"),
    
    IMAGE("image"),
    
    NETWORK("network"),
    
    NODE("node"),
    
    PLUGIN("plugin"),
    
    SECRET("secret"),
    
    SERVICE("service"),
    
    VOLUME("volume");

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

  private String action;

  private EventActor actor;

  /**
   * Scope of the event. Engine events are `local` scope. Cluster (Swarm) events are `swarm` scope. 
   */
  public enum ScopeEnum {
    LOCAL("local"),
    
    SWARM("swarm");

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

  private ScopeEnum scope;

  private Long time;

  private Long timeNano;

  public EventMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of object emitting the event
   * @return type
  */
  
  @Schema(name = "Type", example = "container", description = "The type of object emitting the event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EventMessage action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The type of event
   * @return action
  */
  
  @Schema(name = "Action", example = "create", description = "The type of event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public EventMessage actor(EventActor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @Valid 
  @Schema(name = "Actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Actor")
  public EventActor getActor() {
    return actor;
  }

  public void setActor(EventActor actor) {
    this.actor = actor;
  }

  public EventMessage scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Scope of the event. Engine events are `local` scope. Cluster (Swarm) events are `swarm` scope. 
   * @return scope
  */
  
  @Schema(name = "scope", description = "Scope of the event. Engine events are `local` scope. Cluster (Swarm) events are `swarm` scope. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public EventMessage time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of event
   * @return time
  */
  
  @Schema(name = "time", example = "1629574695", description = "Timestamp of event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public EventMessage timeNano(Long timeNano) {
    this.timeNano = timeNano;
    return this;
  }

  /**
   * Timestamp of event, with nanosecond accuracy
   * @return timeNano
  */
  
  @Schema(name = "timeNano", example = "1629574695515050031", description = "Timestamp of event, with nanosecond accuracy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeNano")
  public Long getTimeNano() {
    return timeNano;
  }

  public void setTimeNano(Long timeNano) {
    this.timeNano = timeNano;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMessage eventMessage = (EventMessage) o;
    return Objects.equals(this.type, eventMessage.type) &&
        Objects.equals(this.action, eventMessage.action) &&
        Objects.equals(this.actor, eventMessage.actor) &&
        Objects.equals(this.scope, eventMessage.scope) &&
        Objects.equals(this.time, eventMessage.time) &&
        Objects.equals(this.timeNano, eventMessage.timeNano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, actor, scope, time, timeNano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeNano: ").append(toIndentedString(timeNano)).append("\n");
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

