// TODO(reto): archivo stubbeado; implementa los cuerpos.
package domain.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Task(
    val id: String,
    val title: String,
    val description: String,
    val completed: Boolean = false
) {
    init {
        require(title.isNotBlank()) {
          TODO("reto: require")
        }
        require(description.isNotBlank()) {
          TODO("reto: require")
        }
    }

    fun update(title: String? = null, description: String? = null, completed: Boolean? = null): Task {
      TODO("reto: update")
    }
}