package ai.chatboot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:14:53.310777+01:00[Europe/Paris]")
public class Message   {
  private String content;
  public enum RoleEnum {

    SYSTEM(String.valueOf("system")), USER(String.valueOf("user")), ASSISTANT(String.valueOf("assistant")), FUNCTION(String.valueOf("function"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private RoleEnum role;
  private Map<String, Object> context = new HashMap<>();
  private Map<String, Object> sessionState = new HashMap<>();

  /**
   **/
  public Message content(String content) {
    this.content = content;
    return this;
  }

  
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  public Message role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  @JsonProperty("role")
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   **/
  public Message context(Map<String, Object> context) {
    this.context = context;
    return this;
  }

  
  @JsonProperty("context")
  public Map<String, Object> getContext() {
    return context;
  }

  @JsonProperty("context")
  public void setContext(Map<String, Object> context) {
    this.context = context;
  }

  public Message putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<>();
    }

    this.context.put(key, contextItem);
    return this;
  }

  public Message removeContextItem(Object contextItem) {
    if (contextItem != null && this.context != null) {
      this.context.remove(contextItem);
    }

    return this;
  }
  /**
   **/
  public Message sessionState(Map<String, Object> sessionState) {
    this.sessionState = sessionState;
    return this;
  }

  
  @JsonProperty("session_state")
  public Map<String, Object> getSessionState() {
    return sessionState;
  }

  @JsonProperty("session_state")
  public void setSessionState(Map<String, Object> sessionState) {
    this.sessionState = sessionState;
  }

  public Message putSessionStateItem(String key, Object sessionStateItem) {
    if (this.sessionState == null) {
      this.sessionState = new HashMap<>();
    }

    this.sessionState.put(key, sessionStateItem);
    return this;
  }

  public Message removeSessionStateItem(Object sessionStateItem) {
    if (sessionStateItem != null && this.sessionState != null) {
      this.sessionState.remove(sessionStateItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.content, message.content) &&
        Objects.equals(this.role, message.role) &&
        Objects.equals(this.context, message.context) &&
        Objects.equals(this.sessionState, message.sessionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role, context, sessionState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    sessionState: ").append(toIndentedString(sessionState)).append("\n");
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

