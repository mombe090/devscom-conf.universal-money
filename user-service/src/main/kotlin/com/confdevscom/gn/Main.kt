package com.confdevscom.gn

import io.javalin.Javalin


fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)

    val res = Presentation(
        "User Service",
        "JAVA",
        "JAVALIN MICRO-FRAMEWORK",
        "3",
        "Je suis chargé de la gestion des utilisateurs de universal many, identité, authification etc..",
        "OMG we are the most one who love microservices",
        "https://javalin.io"
    )

    println("Response from user microservice")
    app.get("/presentation") { ctx -> ctx.json(res) }
}
// You can wrap the main function
// in a Kotlin object
