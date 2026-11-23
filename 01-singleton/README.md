# Patrón Singleton

**Responsable:** Esteban Muñoz

## ¿De qué trata este patrón?
El patrón **Singleton** garantiza que una clase tenga **una única instancia** durante toda la ejecución del programa y proporciona un punto de acceso global a esa instancia.

### ¿Cómo funciona en Java?
1. El constructor se declara `private` para impedir que otras clases creen objetos nuevos con `new`.
2. La única instancia se guarda en un atributo `private static`.
3. Se expone un método público estático (`getInstancia()`) que crea el objeto solo la primera vez y luego siempre devuelve la misma referencia en memoria.

## Ejemplos incluidos

### 1. Configuración global (`Ejemplo1SingletonConfig.java`)
Simula los ajustes generales de una aplicación (como el modo oscuro). Aunque se solicite la configuración desde dos variables distintas (`c1` y `c2`), ambas apuntan exactamente al mismo objeto; por eso, al activar el modo oscuro en `c1`, el cambio se refleja automáticamente en `c2` y `c1 == c2` devuelve `true`.

### 2. Caja registradora única (`Ejemplo2SingletonCaja.java`)
Simula una tienda con una única caja registradora compartida por dos vendedores (`vendedor1` y `vendedor2`). Cuando cada uno cobra una venta ($15.000 y $20.000), el dinero se acumula en el mismo total ($35.000) sin crear cajas duplicadas.

## Cómo ejecutar
```bash
java 01-singleton/Ejemplo1SingletonConfig.java
java 01-singleton/Ejemplo2SingletonCaja.java
```