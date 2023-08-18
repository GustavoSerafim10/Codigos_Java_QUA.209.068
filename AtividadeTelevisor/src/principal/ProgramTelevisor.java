package principal;

import entities.Televisor;

public class ProgramTelevisor {

	public static void main(String[] args) {
		Televisor televisor = new Televisor();

        televisor.mostrarStatus();

        televisor.ligarTelevisor();
        televisor.aumentarVolume();
        televisor.aumentarCanal();
        televisor.aumentarCanal();

        televisor.mostrarStatus();

        televisor.desligarTelevisor();
        televisor.mostrarStatus();

	}

}
