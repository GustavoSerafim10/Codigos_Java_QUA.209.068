package entities;

public class CorrecaoProfessorTelevisor {
	
	public int canal;
	public int volume;
	public boolean ligado;
	
	public void aumentarVolume() {
		if(volume >=0 && volume <=16) {
			volume += 1;
		}
	}
	public void diminuirVolume() {
		if(volume >=0 && volume <=16) {
			volume -= 1;
		}
	}
	
	public void aumentarCanal() {
		if(canal == 0) canal = 1;
		if(volume >= 1 && volume <=14) {
			volume += 1;
		}
	}
	
	public void diminuirCanal() {
		if(canal == 0) canal = 1;
		if(volume >= 1 && volume <= 15) {
			volume -= 1;
		}
	}
	
	public void ligarTelevisor() {
		canal = 1;
		ligado = true;
	}
	
	public void desligarTelevisor() {
		ligado = false;
	}
	
	public void mostrarStatus() {
	if(ligado == true) {
		System.out.println("Tv ligada");
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
		}else {
			System.out.println("Desligada");
		}
	
	}
	

}
