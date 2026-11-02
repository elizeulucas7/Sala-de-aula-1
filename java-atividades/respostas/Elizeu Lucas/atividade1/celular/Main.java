
public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S24";
        celular1.bateria = 30;

        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.bateria = 50;

        celular1.exibirInformacoes();
        celular1.ligar();
        celular1.carregarBateria();

        System.out.println();

        celular2.exibirInformacoes();
        celular2.ligar();
        celular2.carregarBateria();

        System.out.println();

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
    }
}
