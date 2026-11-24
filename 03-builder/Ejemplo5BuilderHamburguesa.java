public class Ejemplo5BuilderHamburguesa {
    public static void main(String[] args) {
        Hamburguesa combo = new Hamburguesa.Builder("Brioche", "Res")
                .conQueso()
                .conTocineta()
                .build();

        System.out.println(combo);
    }
}

class Hamburguesa {
    private String pan, carne;
    private boolean queso, tocineta;

    private Hamburguesa(Builder b) {
        this.pan = b.pan;
        this.carne = b.carne;
        this.queso = b.queso;
        this.tocineta = b.tocineta;
    }

    public String toString() {
        return "Hamburguesa [pan=" + pan + ", carne=" + carne +
               ", queso=" + queso + ", tocineta=" + tocineta + "]";
    }

    public static class Builder {
        private String pan, carne;
        private boolean queso, tocineta;

        // Lo obligatorio va en el constructor del Builder
        public Builder(String pan, String carne) {
            this.pan = pan;
            this.carne = carne;
        }

        // Lo opcional devuelve "this" para encadenar pasos
        public Builder conQueso() { this.queso = true; return this; }
        public Builder conTocineta() { this.tocineta = true; return this; }
        public Hamburguesa build() { return new Hamburguesa(this); }
    }
}
