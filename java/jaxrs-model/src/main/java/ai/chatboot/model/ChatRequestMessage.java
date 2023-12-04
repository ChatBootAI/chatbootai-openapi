package ai.chatboot.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonTypeName("chatRequestMessage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2023-12-04T13:53:53.550608+01:00[Europe/Paris]")
public class ChatRequestMessage {
    private String content;

    public enum RoleEnum {

        SYSTEM(String.valueOf("system")), USER(String.valueOf("user")), ASSISTANT(
                String.valueOf("assistant")), FUNCTION(String.valueOf("function"));


        private String value;

        RoleEnum(String v) {
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
         * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See
         * JAX RS 2.0 Specification, section 3.2, p. 12</a>
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

    /**
     * The contents of the system message.
     **/
    public ChatRequestMessage content(String content) {
        this.content = content;
        return this;
    }


    @ApiModelProperty(required = true, value = "The contents of the system message.")
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * The role of the messages author.
     **/
    public ChatRequestMessage role(RoleEnum role) {
        this.role = role;
        return this;
    }


    @ApiModelProperty(required = true, value = "The role of the messages author.")
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(RoleEnum role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatRequestMessage chatRequestMessage = (ChatRequestMessage) o;
        return Objects.equals(this.content, chatRequestMessage.content)
                && Objects.equals(this.role, chatRequestMessage.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatRequestMessage {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

