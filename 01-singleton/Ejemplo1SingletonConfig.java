public class Ejemplo1SingletonConfig {
    public static void main(String[] args) {
        Configuracion c1 = Configuracion.getInstancia();
        Configuracion c2 = Configuracion.getInstancia();

        c1.modoOscuro = true;

        System.out.println("¿Son el mismo objeto? " + (c1 == c2));
        System.out.println("Modo oscuro en c2: " + c2.modoOscuro);
    }
}

class Configuracion {
    private static Configuracion instancia;
    public boolean modoOscuro = false;

    private Configuracion() {}

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }
}