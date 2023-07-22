package id.giansar.demo

import jakarta.ws.rs.core.Response

class Utility {
    companion object {
        fun sendSuccessResponse(): Response {
            return Response.ok().entity("Hello from RESTEasy Reactive").build()
        }
    }
}