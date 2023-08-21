package entities;

public class Carro {
	
	    private String modelo;
	    private int ano;
	    private String cor;
	    private String motor;
	    private String cambio;
	    private int velocidade;

	    // Construtor
	    public Carro(String modelo, int ano, String cor, String motor, String cambio) {
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	        this.motor = motor;
	        this.cambio = cambio;
	        this.velocidade = 0;
	    }

	    // Métodos getter
	    public String getModelo() {
	        return modelo;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public String getMotor() {
	        return motor;
	    }

	    public String getCambio() {
	        return cambio;
	    }

	    public int getVelocidade() {
	        return velocidade;
	    }

	    // Métodos para aumentar e diminuir a velocidade
	    public void acelerar(int incremento) {
	        velocidade += incremento;
	    }

	    public void frear(int decremento) {
	        if (velocidade >= decremento) {
	            velocidade -= decremento;
	        } else {
	            velocidade = 0;
	        }
	    }

}
