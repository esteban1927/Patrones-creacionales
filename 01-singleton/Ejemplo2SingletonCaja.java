public class Ejemplo2SingletonCaja {
    public static void main(String[] args) {
        CajaRegistradora vendedor1 = CajaRegistradora.getInstancia();
        CajaRegistradora vendedor2 = CajaRegistradora.getInstancia();

        vendedor1.cobrar(15000);
        vendedor2.cobrar(20000);

        System.out.println("Total en caja: $" + vendedor1.total);
    }
}

class CajaRegistradora {
    private static CajaRegistradora instancia;
    public double total = 0;

    private CajaRegistradora() {}

    public static CajaRegistradora getInstancia() {
        if (instancia == null) {
            instancia = new CajaRegistradora();
        }
        return instancia;
    }

    public void cobrar(double monto) {
        total += monto;
    }
}