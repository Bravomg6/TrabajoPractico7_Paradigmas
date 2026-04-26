# Sistema de Gestión de Expediciones Científicas 🏔️🔬

Este proyecto corresponde al desarrollo de los **Trabajos Prácticos 7 y 8** de la cátedra de **Paradigmas de Programación**. Consiste en un sistema de software diseñado para gestionar expediciones de investigación en zonas críticas, asegurando el cumplimiento de protocolos de seguridad y logística.

## 📋 Descripción del Proyecto
El sistema permite coordinar personal especializado, controlar equipamiento crítico y registrar hallazgos en una bitácora. La arquitectura pone énfasis en la **robustez operativa**, impidiendo el inicio de misiones si no se cumplen estrictamente los requisitos mínimos de seguridad.

### Reglas de Negocio (Requisitos Mínimos)
Para que una expedición pase al estado **"En Curso"**, el sistema valida automáticamente:
* **Cupo de Investigadores:** No se permite añadir personal si se alcanza el máximo (5 integrantes).
* **Equipamiento Crítico:** Es obligatorio contar con al menos una computadora y un escáner en el inventario.
* **Seguridad Climática:** La misión no puede comenzar si el módulo de clima reporta una alerta activa.

## 🛠️ Tecnologías y Paradigmas
* **Lenguaje:** Java 11 o superior.
* **Paradigma:** Orientado a Objetos (Encapsulamiento, Abstracción, Polimorfismo).
* **Gestión de Errores:** Manejo avanzado de excepciones y registro de logs.
* **Versionado:** Git y GitHub.
* **Testing:** Pruebas unitarias automatizadas con JUnit 5.

## 📂 Estructura de Clases
* **Expedición:** Clase núcleo que gestiona el estado, cronograma, equipo de trabajo y bitácora.
* **Investigador:** Gestiona datos del personal (Nombre, Especialidad, Rango, GPS).
* **Equipamiento (Inventario):** Controla raciones de suministros y herramientas tecnológicas.
* **Módulo de Clima:** Monitorea temperaturas y emite alertas de seguridad.
* **Requisitos:** Validador centralizado que evalúa la viabilidad de la misión.
* **Bitácora de Hallazgos:** Almacena y muestra el historial de descubrimientos realizados.

## ⚠️ Validación y Manejo de Errores
El sistema implementa una arquitectura blindada mediante:
1.  **Excepciones Personalizadas:** Uso de `IllegalArgumentException` para entradas de datos inválidas y `IllegalStateException` para fallos en la lógica de negocio.
2.  **Logs de Consola:** Ante un fallo en el inicio, se genera un registro visual detallado (con asteriscos) indicando los motivos del error.
3.  **JUnit 5:** Pruebas unitarias enfocadas en `assertThrows` para garantizar que el sistema reaccione correctamente ante datos nulos o vacíos.

## 🚀 Ejecución del Sistema
El archivo `Main.java` contiene una simulación completa que demuestra:
1.  Control de errores al crear expediciones o investigadores con datos nulos.
2.  Validación de cupo máximo de personal.
3.  Fallo de inicio por condiciones climáticas adversas o falta de herramientas.
4.  Corrección de estados, inicio exitoso, carga de hitos en el cronograma y registro de hallazgos en bitácora.

## 👥 Integrantes
* **Candela Guadalupe Bravo Maggio**
* **Martin Ezequiel Suarez**

---
**Repositorio Oficial:** [https://github.com/Bravomg6/TrabajoPractico7_Paradigmas](https://github.com/Bravomg6/TrabajoPractico7_Paradigmas)
