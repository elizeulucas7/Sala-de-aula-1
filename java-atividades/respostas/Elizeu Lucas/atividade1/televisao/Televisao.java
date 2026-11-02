public class Televisao {
    String marca;
    int volume;
    int canal;

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}
