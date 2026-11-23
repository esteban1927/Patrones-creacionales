public class Ejemplo4FactoryTransporte {
    public static void main(String[] args) {
        Logistica ruta1 = new LogisticaTerrestre();
        ruta1.despachar();

        Logistica ruta2 = new LogisticaMaritima();
        ruta2.despachar();
    }
}

// 1. Interfaz del producto
interface Transporte {
    void entregar();
}

// 2. Productos concretos
class Camion implements Transporte {
    public void entregar() {
        System.out.println("Entrega por carretera en camión.");
    }
}

class Barco implements Transporte {
    public void entregar() {
        System.out.println("Entrega por mar en barco.");
    }
}

// 3. Superclase creadora 
abstract class Logistica {
    public abstract Transporte crearTransporte();

    public void despachar() {
        crearTransporte().entregar();
    }
}

// 4. Subclases que deciden qué transporte fabricar
class LogisticaTerrestre extends Logistica {
    public Transporte crearTransporte() {
        return new Camion();
    }
}

class LogisticaMaritima extends Logistica {
    public Transporte crearTransporte() {
        return new Barco();
    }
}