// TODO(reto): archivo stubbeado; implementa los cuerpos.
package domain.infrastructure.persistence

import domain.domain.model.Task
import domain.domain.repository.TaskRepository

class TaskRepositoryImpl : TaskRepository {
    private val tasks = mutableListOf<Task>()

    override suspend fun findAll(): List<Task> {
      TODO("reto: mutableListOf")
    }

    override suspend fun findById(id: String): Task? {
        return tasks.find { it.id == id }
    }

    override suspend fun save(task: Task): Task {
      TODO("reto: save")
    }

    override suspend fun update(task: Task): Task {
      TODO("reto: update")
    }

    override suspend fun delete(id: String) {
      TODO("reto: delete")
    }
}