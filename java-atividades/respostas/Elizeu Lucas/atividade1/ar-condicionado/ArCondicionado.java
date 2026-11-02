public class ArCondicionado {
    String marca;
    int temperatura = 16;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    public void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
        }
        System.out.println("Temperatura: " + temperatura + " graus");
    }

    public void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
        }
        System.out.println("Temperatura: " + temperatura + " graus");
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " graus");
        System.out.println("Estado: " + (ligado ? "ligado" : "desligado"));
    }
}
