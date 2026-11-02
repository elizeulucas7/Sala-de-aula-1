public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "LG";
        ar.mostrarEstado();
        ar.ligar();
        ar.aumentarTemperatura();
        ar.diminuirTemperatura();
        ar.mostrarEstado();
        ar.desligar();

        ar.temperatura = 30;
        ar.aumentarTemperatura();
        ar.temperatura = 16;
        ar.diminuirTemperatura();
    }
}
