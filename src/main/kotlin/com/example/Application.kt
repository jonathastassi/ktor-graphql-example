package com.example

import com.example.plugins.configureCors
import com.example.plugins.configureKoin
import com.example.plugins.configureGraphQL
import com.example.plugins.configureMonitoring
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureCors()
    configureMonitoring()
    configureKoin()
    configureGraphQL()
}
