public class Ejemplo6BuilderPC {
    public static void main(String[] args) {
        Computador miPC = new Computador.Builder("Intel i5")
                .conRam(16)
                .conGrafica("RTX 4060")
                .build();

        System.out.println(miPC);
    }
}

class Computador {
    private String cpu, grafica;
    private int ram;

    private Computador(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.grafica = b.grafica;
    }

    public String toString() {
        return "PC [CPU=" + cpu + ", RAM=" + ram + "GB, GPU=" + grafica + "]";
    }

    public static class Builder {
        private String cpu;
        private int ram = 8;
        private String grafica = "Integrada";

        public Builder(String cpu) { this.cpu = cpu; }
        public Builder conRam(int ram) { this.ram = ram; return this; }
        public Builder conGrafica(String gpu) { this.grafica = gpu; return this; }
        public Computador build() { return new Computador(this); }
    }
}
