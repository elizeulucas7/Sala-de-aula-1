public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada.");
    }

    public void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + " W");
        System.out.println("Estado: " + (ligada ? "ligada" : "desligada"));
    }
}
