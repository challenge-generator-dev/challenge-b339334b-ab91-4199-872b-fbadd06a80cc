package domain

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.routing.routing
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import domain.domain.service.TaskService
import domain.infrastructure.persistence.TaskRepositoryImpl
import domain.infrastructure.routing.taskRouting
import domain.infrastructure.exception.exceptionHandler

/**
 * Módulo de aplicación del dominio.
 * Este archivo contiene la configuración base de la aplicación Ktor.
 * El entry point canónico está en com.example.Application.
 */
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