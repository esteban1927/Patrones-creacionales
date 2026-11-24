public class Ejemplo7PrototypeEnemigo {
    public static void main(String[] args) {
        Enemigo base = new Enemigo("Goblin", 100);

        // Clonamos el molde en vez de construir todo desde cero
        Enemigo jefe = base.clonar();
        jefe.nombre = "Goblin Jefe";
        jefe.vida = 250;

        System.out.println("Original: " + base);
        System.out.println("Clon: " + jefe);
    }
}

class Enemigo implements Cloneable {
    String nombre;
    int vida;

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public Enemigo clonar() {
        try {
            return (Enemigo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return nombre + " (Vida: " + vida + ")";
    }
}
