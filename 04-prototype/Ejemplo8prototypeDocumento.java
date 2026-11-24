public class Ejemplo8PrototypeDocumento {
    public static void main(String[] args) {
        Documento plantilla = new Documento("Contrato Base", "Cláusulas estándar...");

        // Clonamos la plantilla y cambiamos solo el título
        Documento contratoCliente = plantilla.clonar();
        contratoCliente.titulo = "Contrato - Cliente Ana";

        System.out.println("Plantilla: " + plantilla);
        System.out.println("Clon: " + contratoCliente);
    }
}

class Documento implements Cloneable {
    String titulo;
    String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public Documento clonar() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return titulo + " -> " + contenido;
    }
}
