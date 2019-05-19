package com.mkdika.javalingraalvm

import io.javalin.Javalin

fun main() {
    val app = Javalin.create().start(7000)
    app.get("/health") {
        it.result("pong")
        it.json(BaseResponse(
            code = 200,
            status = true
        ))
    }
}

data class BaseResponse (
    val code: Int,
    val status: Boolean
)
