package com.confdevscom.gn

import io.javalin.Javalin
import org.slf4j.LoggerFactory

class Main

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)

    val log = LoggerFactory.getLogger(Main::class.java)
    val res = Presentation(
        "User Service",
        "KOTLIN",
        "JAVALIN MICRO-FRAMEWORK",
        "3",
        "Je suis chargé de la gestion des utilisateurs de universal many, identité, authification etc..",
        "OMG we are the most one who love microservices",
        "https://javalin.io"
    )


    app.get("/presentation") { ctx ->
        run {
            log.info("Response from user microservice")
            ctx.json(res)
        }
    }
}
// You can wrap the main function
// in a Kotlin object
