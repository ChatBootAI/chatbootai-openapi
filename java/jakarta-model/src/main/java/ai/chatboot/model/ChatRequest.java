package ai.chatboot.model;

import ai.chatboot.model.ChatRequestMessage;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the chat request sent to the model.
 **/
@ApiModel(description = "Represents the chat request sent to the model.")
@JsonTypeName("chatRequest")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-12-04T13:52:44.900078+01:00[Europe/Paris]")
public class ChatRequest   {
  private List<ChatRequestMessage> messages = new ArrayList<>();
  private String model;
  private Boolean stream;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private String user;

  /**
   * A list of messages comprising the conversation so far.
   **/
  public ChatRequest messages(List<ChatRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far.")
  @JsonProperty("messages")
  public List<ChatRequestMessage> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<ChatRequestMessage> messages) {
    this.messages = messages;
  }

  public ChatRequest addMessagesItem(ChatRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }

    this.messages.add(messagesItem);
    return this;
  }

  public ChatRequest removeMessagesItem(ChatRequestMessage messagesItem) {
    if (messagesItem != null && this.messages != null) {
      this.messages.remove(messagesItem);
    }

    return this;
  }
  /**
   * ID of the model to use.
   **/
  public ChatRequest model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the model to use.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only server-sent events as they become available, with the stream terminated by a data DONE
   **/
  public ChatRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only server-sent events as they become available, with the stream terminated by a data DONE")
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  @JsonProperty("stream")
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or top_p but not both.
   **/
  public ChatRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or top_p but not both.")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  @JsonProperty("temperature")
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.
   **/
  public ChatRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.")
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }

  @JsonProperty("top_p")
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
   **/
  public ChatRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(String user) {
    this.user = user;
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
        Objects.equals(this.model, chatRequest.model) &&
        Objects.equals(this.stream, chatRequest.stream) &&
        Objects.equals(this.temperature, chatRequest.temperature) &&
        Objects.equals(this.topP, chatRequest.topP) &&
        Objects.equals(this.user, chatRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, stream, temperature, topP, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatRequest {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

