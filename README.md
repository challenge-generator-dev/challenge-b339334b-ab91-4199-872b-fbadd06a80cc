# Implementación de una API REST para gestión de tareas

El sistema debe implementar una API REST en Kotlin con Ktor para gestionar tareas. Las tareas tienen un identificador único, un título y una descripción. El sistema debe permitir crear, listar y actualizar tareas. Las rutas deben responder con un código 404 cuando la tarea no existe. El repositorio de tareas es en memoria y no se debe usar ningún ORM.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | API REST de tareas con Kotlin y Ktor |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Tener el proyecto base del reto funcionando en tu máquina: clonar el repositorio, instalar las herramientas y verificar que compila y arranca antes de empezar a practicar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Instala las herramientas para ejecutar el proyecto: JDK 17+ y Maven 3.9+.
- Clona el repositorio del reto (el enlace viene en la entrega del reto y en la sección "Repositorio del Proyecto" del PDF) y ábrelo en tu IDE.
- Instala las dependencias y compila ejecutando `mvn clean compile` en la raíz del repositorio.
- Confirma que el comando termina sin errores: el proyecto arranca y sus pruebas corren.
- Ubica los archivos de práctica: son los que contienen `TODO(reto)` (búscalos en el repositorio). Lee el README.md y el AGENTS.md antes de empezar.

**Entregable:** El proyecto compila/arranca sin errores con `mvn clean compile`.

<details>
<summary>Pistas de conocimiento</summary>

- Los archivos con `TODO(reto)` son el ejercicio: el resto del repositorio ya está resuelto y no hace falta tocarlo.
- Si el comando de verificación falla, revisa la versión de las herramientas instaladas antes de modificar código.
- AGENTS.md describe el reto, el comando de verificación y las reglas del repositorio.

</details>

### Fase 1: Definición y creación de tareas

**Objetivo:** Implementar la funcionalidad para crear y listar tareas.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Define el modelo de datos para las tareas.
- Implementa el endpoint para crear una nueva tarea.
- Implementa el endpoint para listar todas las tareas existentes.

**Entregable:** API REST con endpoints para crear y listar tareas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar las tareas en memoria.
- Piensa en cómo manejar la serialización y deserialización de JSON.

</details>

### Fase 2: Actualización y manejo de errores

**Objetivo:** Implementar la funcionalidad para actualizar tareas y manejar errores.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa el endpoint para actualizar una tarea existente.
- Asegura que las rutas respondan con un código 404 cuando la tarea no existe.

**Entregable:** API REST con endpoint para actualizar tareas y manejo de errores 404.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo validar la existencia de una tarea antes de actualizarla.
- Piensa en cómo manejar los errores y devolver el código de estado correcto.

</details>

### Fase 3: Refactorización y optimización

**Objetivo:** Refactorizar el código y optimizar la API REST.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Revisa el código implementado y realiza las refactorizaciones necesarias para mejorar la legibilidad y mantenibilidad.
- Identifica y aplica optimizaciones para mejorar el rendimiento de la API REST.

**Entregable:** API REST refactorizada y optimizada.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo aplicar principios de diseño y patrones de código limpio.
- Piensa en cómo optimizar el rendimiento de la API REST.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una tarea en el contexto de este reto?
- **paraQueSirve**: ¿Para qué sirve la API REST implementada en este reto?
- **comoSeUsa**: ¿Cómo se usa la API REST para crear, listar y actualizar tareas?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir al interactuar con la API REST y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones de diseño y optimización se deben tomar al implementar y mejorar la API REST?

## Criterios de Evaluacion

- Implementación de endpoints para crear, listar y actualizar tareas.
- Uso de kotlinx.serialization para el JSON.
- Respuesta con código 404 cuando la tarea no existe.
- Refactorización y optimización del código de la API REST.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
