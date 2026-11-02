
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2024;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();

        System.out.println();

        carro2.exibirInformacoes();
        carro2.ligar();
    }
}
