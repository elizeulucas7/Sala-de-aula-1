public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "Samsung";
        tv.volume = 50;
        tv.canal = 10;

        System.out.println("Marca: " + tv.marca);
        System.out.println("Canal: " + tv.canal);
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(12);

        tv.volume = 100;
        tv.aumentarVolume();
        tv.volume = 0;
        tv.diminuirVolume();
    }
}
