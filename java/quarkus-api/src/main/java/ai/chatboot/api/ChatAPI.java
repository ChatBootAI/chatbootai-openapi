package ai.chatboot.api;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import ai.chatboot.model.ChatError;
import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.ChatResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition(
        info = @org.eclipse.microprofile.openapi.annotations.info.Info(title = "chat",
                version = "0.0.1", description = "Chat with the ChatBootAI",
                license = @org.eclipse.microprofile.openapi.annotations.info.License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")),
        tags = @org.eclipse.microprofile.openapi.annotations.tags.Tag(name = "chat",
                description = "Chat with the ChatBootAI"))
@Path("/chat")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2023-12-04T13:53:53.859094+01:00[Europe/Paris]")
public class ChatAPI {

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})

    @org.eclipse.microprofile.openapi.annotations.Operation(operationId = "chat",
            summary = "Engage a conversation with ChatBootAI",
            description = "Post a prompt to ChatBootAI and receive a response")
    @org.eclipse.microprofile.openapi.annotations.tags.Tag(name = "chat")
    @org.eclipse.microprofile.openapi.annotations.responses.APIResponses(value = {
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(
                    responseCode = "201", description = "Chat response",
                    content = {@org.eclipse.microprofile.openapi.annotations.media.Content(
                            mediaType = "application/json",
                            schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(
                                    implementation = ChatResponse.class))}),
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(
                    responseCode = "400", description = "HTTP Error Response",
                    content = {@org.eclipse.microprofile.openapi.annotations.media.Content(
                            mediaType = "application/json",
                            schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(
                                    implementation = ChatError.class))}),
            @org.eclipse.microprofile.openapi.annotations.responses.APIResponse(
                    responseCode = "500", description = "HTTP Error Response",
                    content = {@org.eclipse.microprofile.openapi.annotations.media.Content(
                            mediaType = "application/json",
                            schema = @org.eclipse.microprofile.openapi.annotations.media.Schema(
                                    implementation = ChatError.class))})})
    public Response chat(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
