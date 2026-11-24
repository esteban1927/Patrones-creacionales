# Patrones de Diseño Creacionales en Java

Repositorio correspondiente a la exposición de **Programación II** sobre **Patrones de Diseño Creacionales**.

## Integrantes
* **Esteban Muñoz** — Patrón Singleton
* **Emmanuel Ortega** — Patrón Factory Method
* **Adrian Andrade** — Patrón Builder
* **Jonathan Morales** — Patrón Prototype

## ¿Qué son los Patrones Creacionales?
Los patrones creacionales proporcionan diversos mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización del código existente.

## Contenido del repositorio
1. [01 - Singleton](./01-singleton) — Garantiza una única instancia global de una clase.
2. [02 - Factory Method](./02-factory-method) — Delega la creación de objetos a subclases mediante un método fábrica.
3. [03 - Builder](./03-builder) — Construye objetos complejos paso a paso.
4. [04 - Prototype](./04-prototype) — Crea nuevos objetos clonando una instancia existente.

## Cómo ejecutar
Requiere Java JDK 11 o superior:
```bash
java carpeta/NombreDelArchivo.java


# Patrón Prototype

**Responsable:** Jonathan Morales

## ¿De qué trata este patrón?
El patrón **Prototype** permite crear objetos nuevos **clonando (copiando) un objeto existente** en lugar de construirlo desde cero. Es muy útil cuando crear un objeto desde cero es repetitivo o cuando necesitas varias copias casi iguales con pequeños cambios.

### ¿Cómo funciona en Java?
1. La clase implementa la interfaz `Cloneable`.
2. Se crea un método `clonar()` que llama a `super.clone()` para generar una copia independiente del objeto original.
3. El nuevo clon puede modificarse libremente sin alterar al objeto base.

## Ejemplos incluidos

### 1. Clonar enemigos en un videojuego (`Ejemplo7PrototypeEnemigo.java`)
Se crea un enemigo base (`Goblin`) y se clona para obtener un `Goblin Jefe` con más vida, manteniendo intacto al enemigo original.

### 2. Plantilla de documento (`Ejemplo8PrototypeDocumento.java`)
Se parte de un contrato base con cláusulas estándar y se clona para personalizar el título de un cliente específico sin dañar la plantilla original.

## Cómo ejecutar
```bash
java 04-prototype/Ejemplo7PrototypeEnemigo.java
java 04-prototype/Ejemplo8PrototypeDocumento.java
```
