public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 10;

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 15;

        lampada1.mostrarEstado();
        lampada1.ligar();
        lampada1.mostrarEstado();
        System.out.println();
        lampada2.ligar();
        lampada2.mostrarEstado();
        lampada2.desligar();
        lampada2.mostrarEstado();
    }
}
