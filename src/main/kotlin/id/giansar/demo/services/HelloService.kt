package id.giansar.demo.services

import id.giansar.demo.models.data.BaseResponse
import id.giansar.demo.models.data.HelloRequest
import id.giansar.demo.models.data.SuccessStatus
import jakarta.enterprise.context.ApplicationScoped
import org.slf4j.LoggerFactory

@ApplicationScoped
class HelloService {
    companion object {
        private val LOGGER = LoggerFactory.getLogger(HelloService::class.java)
    }

    fun sayHello(): String {
        LOGGER.info("Hello from RESTEasy Reactive")
        return "Hello from RESTEasy Reactive"
    }

    fun sayHelloWithName(request: HelloRequest): BaseResponse {
        LOGGER.info("Hello from RESTEasy Reactive, ${request.name}")
        return BaseResponse(SuccessStatus(), "Hello from RESTEasy Reactive, ${request.name}")
    }
}