package ai.chatboot.api;

import ai.chatboot.model.ChatError;
import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.ChatResponse;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/chat")
@Api(description = "the chat API")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-12-04T13:53:53.656695+01:00[Europe/Paris]")
public class ChatAPI {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Engage a conversation with ChatBootAI", notes = "Post a prompt to ChatBootAI and receive a response", response = ChatResponse.class, tags={ "chat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Chat response", response = ChatResponse.class),
        @ApiResponse(code = 400, message = "HTTP Error Response", response = ChatError.class),
        @ApiResponse(code = 500, message = "HTTP Error Response", response = ChatError.class)
    })
    public Response chat(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
