package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// Conceito de carros - Aqui vamos abordar sobre a Introdu��o POO
		
		//caracteristicas(Atributos)
		//Exemplo de compotamentos acelerar, freair, acender farois..
		//comportamentos(metodos/fun��o)
		//Classes tem muitos recursos como:
		//Sobrecarga de metodos e construtores
		//4pilares podem ser aplicados
		//entities(entidades do sistema) de acordo com a modelagem
		//de negocios: Carro, pessoa, endere�o...
		//Services: ClienteServices, E-mail servi�os...
		//Controllers
		//Clases Utilit�rias: Math(E a biblioteca que estamos at� utilizando)
		//Conceito importante, Classe � um molde para o Objeto
		
		Scanner sc = new Scanner(System.in);
		
		//Eu crio um novo objeto para o "New Carro"
		Carro carro = new Carro(); //Como a Scanner tenho que importar ela ctrl + Shift + o
		Carro carroPopular = new Carro();
		//Para acessarmos o objeto l� da class carro.. fazermos um objeto segue abaixo:
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "vermelho";
		
		/*carroPopular. ano = sc.nextLine();
		
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.velocidade);
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		carro.velocidadeVeiculo();
		
		System.out.println(carro.velocidade);
		
		
		
		
		

	}

}
