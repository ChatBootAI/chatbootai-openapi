package ai.chatboot.api;

import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.HttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/chat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:14:53.089146+01:00[Europe/Paris]")
public class ChatApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response chatPost(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
