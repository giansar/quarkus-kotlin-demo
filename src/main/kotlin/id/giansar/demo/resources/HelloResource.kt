package id.giansar.demo.resources

import id.giansar.demo.models.data.HelloRequest
import id.giansar.demo.services.HelloService
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/api/demo/hello")
class HelloResource {

    @Inject
    lateinit var helloService: HelloService

    @GET()
    fun helloGet(): Response {
        return Response.ok().entity(helloService.sayHello()).build()
    }

    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun helloPost(request: HelloRequest): Response {
        return Response.ok().entity(helloService.sayHelloWithName(request)).build()
    }

}