// TODO(reto): archivo stubbeado; implementa los cuerpos.
package domain.domain.service

import domain.domain.model.Task
import domain.domain.repository.TaskRepository
import domain.infrastructure.exception.TaskNotFoundException

class TaskService(private val taskRepository: TaskRepository) {
    suspend fun getAllTasks(): List<Task> {
      TODO("reto: getAllTasks")
    }

    suspend fun getTaskById(id: String): Task {
      TODO("reto: getTaskById")
    }

    suspend fun createTask(title: String, description: String): Task {
      TODO("reto: createTask")
    }

    suspend fun updateTask(id: String, title: String?, description: String?, completed: Boolean?): Task {
      TODO("reto: updateTask")
    }

    suspend fun deleteTask(id: String) {
      TODO("reto: deleteTask")
    }
}
// TODO(reto): Implementar la lógica de negocio para manejar tareas.