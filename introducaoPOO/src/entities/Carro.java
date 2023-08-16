package entities;

public class Carro {
	
	//vou por atributos nela tlg, do tipo public
	//Que dai os meus atributos estão publicos e podem ser acessadas 
	//por qualquer classe.. voltamos pro "Program'
	
	public String modelo;
	public String placa;
	public String cor;
	public String ano;
	public int velocidade = 0;
	
	public void velocidadeVeiculo() {
		velocidade  += 1;
		
	}
					
}
