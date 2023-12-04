package ai.chatboot.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import ai.chatboot.model.ChatResponseMessage;
import io.swagger.annotations.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonTypeName("chatResponseChoice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2023-12-04T13:53:53.550608+01:00[Europe/Paris]")
public class ChatResponseChoice {
    private BigDecimal index;
    private ChatResponseMessage message;

    /**
     * The index of the choice in the list of choices.
     **/
    public ChatResponseChoice index(BigDecimal index) {
        this.index = index;
        return this;
    }


    @ApiModelProperty(required = true, value = "The index of the choice in the list of choices.")
    @JsonProperty("index")
    public BigDecimal getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(BigDecimal index) {
        this.index = index;
    }

    /**
     **/
    public ChatResponseChoice message(ChatResponseMessage message) {
        this.message = message;
        return this;
    }


    @ApiModelProperty(required = true, value = "")
    @JsonProperty("message")
    public ChatResponseMessage getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(ChatResponseMessage message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatResponseChoice chatResponseChoice = (ChatResponseChoice) o;
        return Objects.equals(this.index, chatResponseChoice.index)
                && Objects.equals(this.message, chatResponseChoice.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatResponseChoice {\n");

        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}

