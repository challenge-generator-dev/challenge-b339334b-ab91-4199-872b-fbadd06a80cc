// TODO(reto): archivo stubbeado; implementa los cuerpos.
package domain.infrastructure.routing

import domain.domain.service.TaskService
import domain.infrastructure.exception.TaskNotFoundException
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.taskRouting(taskService: TaskService) {
    route("/tasks") {
        get {
            val tasks = taskService.getAllTasks()
            call.respond(HttpStatusCode.OK, tasks)
        }

        get("/{id}") {
          TODO("reto: get")
        }

        post {
            val taskRequest = call.receive<Map<String, String>>()
            val title = taskRequest["title"] ?: throw IllegalArgumentException("Missing title")
            val description = taskRequest["description"] ?: throw IllegalArgumentException("Missing description")
            val task = taskService.createTask(title, description)
            call.respond(HttpStatusCode.Created, task)
        }

        put("/{id}") {
          TODO("reto: put")
        }

        delete("/{id}") {
          TODO("reto: delete")
        }
    }
}
// TODO(reto): Implementar las rutas HTTP para manejar las operaciones sobre tareas.