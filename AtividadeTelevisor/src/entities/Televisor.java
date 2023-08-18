package entities;

public class Televisor {
	
	private int canal;
    private int volume;
    private boolean ligado;

    public Televisor() {
        canal = 1;
        volume = 0;
        ligado = false;
    }

    public void ligarTelevisor() {
        ligado = true;
    }

    public void desligarTelevisor() {
        ligado = false;
    }

    public void aumentarVolume() {
        if (ligado && volume <=15) {
            volume -=1;
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
        }
    }

    public void aumentarCanal() {
        if (ligado && canal < 15) {
            canal++;
        }
    }

    public void diminuirCanal() {
        if (ligado && canal > 1) {
            canal--;
        }
    }

    public void mostrarStatus() {
        if (ligado) {
            System.out.println("Televisor Ligado:");
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Televisor Desligado");
        }
    }

}
