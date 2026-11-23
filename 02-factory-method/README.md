# Patrón Factory Method

**Responsable:** Emmanuel Ortega

## ¿De qué trata este patrón?

El patrón **Factory Method** proporciona una interfaz para la creación de objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos concretos que se crearán. De esta manera el código principal no depende de clases específicas y es fácil agregar nuevos tipos sin modificar el código existente.

### ¿Cómo funciona en Java?

1. Todos los productos implementan una interfaz común (`Notificacion` o `Transporte`).
2. Una superclase abstracta define el método fábrica abstracto (`crear()` o `crearTransporte()`).
3. Cada subclase implementa ese método devolviendo el objeto concreto que le corresponde.

## Ejemplos incluidos

### 1. Sistema de notificaciones (`Ejemplo3FactoryNotificacion.java`)

La clase padre `CreadorNotificacion` procesa el envío de mensajes sin saber si saldrán por correo o SMS. Las subclases `CreadorEmail` y `CreadorSMS` deciden qué objeto concreto fabricar.

### 2. Logística de transporte (`Ejemplo4FactoryTransporte.java`)

Basado en la analogía clásica de logística: la clase `Logistica` despacha pedidos sin depender del vehículo. `LogisticaTerrestre` fabrica un `Camion` y `LogisticaMaritima` fabrica un `Barco`.

