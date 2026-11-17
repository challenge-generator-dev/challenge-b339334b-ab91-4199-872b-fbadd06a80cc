package com.example

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.routing.routing
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import domain.domain.service.TaskService
import domain.infrastructure.persistence.TaskRepositoryImpl
import domain.infrastructure.routing.taskRouting
import domain.infrastructure.exception.exceptionHandler

/**
 * Entry point canónico de la aplicación Ktor.
 * Configura el servidor, instala plugins y monta las rutas de la API.
 */
fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
    val taskRepository = TaskRepositoryImpl()
    val taskService = TaskService(taskRepository)

    install(ContentNegotiation) {
        json(Json {
            prettyPrint = true
            isLenient = true
            ignoreUnknownKeys = true
        })
    }

    exceptionHandler()

    routing {
        taskRouting(taskService)
    }
}