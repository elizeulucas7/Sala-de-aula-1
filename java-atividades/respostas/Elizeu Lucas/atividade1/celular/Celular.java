
public class Celular {
    String marca;
    String modelo;
    int bateria;

    public void ligar() {
        if (bateria > 0) {
            System.out.println("Celular ligado!");
        } else {
            System.out.println("Bateria descarregada!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    public void carregarBateria() {
        bateria = 100;
        System.out.println("Celular carregado!");
    }
}
