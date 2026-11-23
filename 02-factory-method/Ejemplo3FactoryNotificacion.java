public class Ejemplo3FactoryNotificacion {
    public static void main(String[] args) {
        CreadorNotificacion c1 = new CreadorEmail();
        c1.procesar("Pedido confirmado.");

        CreadorNotificacion c2 = new CreadorSMS();
        c2.procesar("Tu código es 4829.");
    }
}

// 1. Interfaz del producto
interface Notificacion {
    void enviar(String mensaje);
}

// 2. Productos concretos
class Email implements Notificacion {
    public void enviar(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SMS implements Notificacion {
    public void enviar(String msg) {
        System.out.println("SMS: " + msg);
    }
}

// 3. Superclase creadora 
abstract class CreadorNotificacion {
    public abstract Notificacion crear();

    public void procesar(String msg) {
        crear().enviar(msg);
    }
}

// 4. Subclases que deciden qué objeto concreto fabricar
class CreadorEmail extends CreadorNotificacion {
    public Notificacion crear() {
        return new Email();
    }
}

class CreadorSMS extends CreadorNotificacion {
    public Notificacion crear() {
        return new SMS();
    }
}