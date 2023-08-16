package entities;

public class Triangulo {
	private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public String verificarTipo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equil�tero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Is�sceles";
        } else {
            return "Escaleno";
        }
    }
}

