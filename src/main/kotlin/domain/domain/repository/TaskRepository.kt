package domain.domain.repository

import domain.domain.model.Task

interface TaskRepository {
    suspend fun findAll(): List<Task>
    suspend fun findById(id: String): Task?
    suspend fun save(task: Task): Task
    suspend fun update(task: Task): Task
    suspend fun delete(id: String)
}
// TODO(reto): Implementar los métodos de esta interfaz según las necesidades del dominio.