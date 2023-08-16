package entities;

public class Terreno {
	
	 private double comprimento;
	    private double largura;

	    public Terreno(double comprimento, double largura) {
	        this.comprimento = comprimento;
	        this.largura = largura;
	    }

	    public double calcularArea() {
	        return comprimento * largura;
	    }
	}

