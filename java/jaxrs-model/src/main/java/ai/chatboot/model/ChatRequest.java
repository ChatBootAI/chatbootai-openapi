package ai.chatboot.model;

import ai.chatboot.model.ChatRequestMessagesInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("chatRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:14:53.310777+01:00[Europe/Paris]")
public class ChatRequest   {
  private List<ChatRequestMessagesInner> messages = new ArrayList<>();
  private Boolean stream;
  private Map<String, String> context = new HashMap<>();
  private Map<String, String> sessionState = new HashMap<>();

  /**
   **/
  public ChatRequest messages(List<ChatRequestMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  
  @JsonProperty("messages")
  public List<ChatRequestMessagesInner> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<ChatRequestMessagesInner> messages) {
    this.messages = messages;
  }

  public ChatRequest addMessagesItem(ChatRequestMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }

    this.messages.add(messagesItem);
    return this;
  }

  public ChatRequest removeMessagesItem(ChatRequestMessagesInner messagesItem) {
    if (messagesItem != null && this.messages != null) {
      this.messages.remove(messagesItem);
    }

    return this;
  }
  /**
   **/
  public ChatRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  @JsonProperty("stream")
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   **/
  public ChatRequest context(Map<String, String> context) {
    this.context = context;
    return this;
  }

  
  @JsonProperty("context")
  public Map<String, String> getContext() {
    return context;
  }

  @JsonProperty("context")
  public void setContext(Map<String, String> context) {
    this.context = context;
  }

  public ChatRequest putContextItem(String key, String contextItem) {
    if (this.context == null) {
      this.context = new HashMap<>();
    }

    this.context.put(key, contextItem);
    return this;
  }

  public ChatRequest removeContextItem(String contextItem) {
    if (contextItem != null && this.context != null) {
      this.context.remove(contextItem);
    }

    return this;
  }
  /**
   **/
  public ChatRequest sessionState(Map<String, String> sessionState) {
    this.sessionState = sessionState;
    return this;
  }

  
  @JsonProperty("session_state")
  public Map<String, String> getSessionState() {
    return sessionState;
  }

  @JsonProperty("session_state")
  public void setSessionState(Map<String, String> sessionState) {
    this.sessionState = sessionState;
  }

  public ChatRequest putSessionStateItem(String key, String sessionStateItem) {
    if (this.sessionState == null) {
      this.sessionState = new HashMap<>();
    }

    this.sessionState.put(key, sessionStateItem);
    return this;
  }

  public ChatRequest removeSessionStateItem(String sessionStateItem) {
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
    ChatRequest chatRequest = (ChatRequest) o;
    return Objects.equals(this.messages, chatRequest.messages) &&
        Objects.equals(this.stream, chatRequest.stream) &&
        Objects.equals(this.context, chatRequest.context) &&
        Objects.equals(this.sessionState, chatRequest.sessionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, stream, context, sessionState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatRequest {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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

