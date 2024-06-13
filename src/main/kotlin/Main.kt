import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {

   val server= embeddedServer(Netty, System.getenv("PORT").toInt()?:8080) {
        configureRouting()
    }
    server.start(wait = true)
  //  server.stop(1000,1000)


}