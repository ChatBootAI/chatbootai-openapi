package ai.chatboot.api;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import ai.chatboot.model.ChatError;
import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.ChatResponse;
import io.swagger.annotations.*;

@Path("/chat")
@Api(description = "the chat API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2023-12-04T13:53:53.395033+01:00[Europe/Paris]")
public class ChatAPI {

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @ApiOperation(value = "Engage a conversation with ChatBootAI",
            notes = "Post a prompt to ChatBootAI and receive a response",
            response = ChatResponse.class, tags = {"chat"})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Chat response", response = ChatResponse.class),
            @ApiResponse(code = 400, message = "HTTP Error Response", response = ChatError.class),
            @ApiResponse(code = 500, message = "HTTP Error Response", response = ChatError.class)})
    public Response chat(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
