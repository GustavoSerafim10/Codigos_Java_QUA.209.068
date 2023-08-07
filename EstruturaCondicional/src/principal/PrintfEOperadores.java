package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		
		String nome = "Gustavo Vinicius";
		int idade = 33;
		double altura = 1.83;
		boolean verdadeiro = true;
		boolean falso = false;
		
		//para o tipo char usa %c
		System.out.printf("%s, tem %d, e sua altura �: %.2f\n", nome, idade, altura);	
		
		/*Operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente
		 * == igual 
		 */
		
		/*Operadores l�gicos
		 * && significa E
		 * || Significa OU
		 * ! Significa Nega��o
		 */
				
		//Para verificar se o nosso conjunto e verdadeiro ou falso
		//se = if
		//else - senao
		if(verdadeiro ) {
			System.out.println(10);
		}else {
			System.out.println(20);
		}

		char opcao = 's';
		int idade2 = 18;
		String diaSemana = "Sexta";
		
		//um unico if � uma estrutura simples 
		//Quando eu tenho if e else tenho uma estrutura composta
		//Quando eu tenho mais de um if... e o if else � uma estrutura encadeada
		//podemos ter estruturas dentro de cada if / if else
		if(opcao == 's' && idade2 >= 18) {
			System.out.println("Pode entrar na festa");
		}else {
			System.out.println("Volta pra casa!");
		}
		//Para strings n�o utilizamos o ==, para string utilizamos o .equals
		if(diaSemana.equals ("Segunda")) {
			System.out.println("Segunda-Feira");
			}
		else if(diaSemana.equals ("Ter�a")) {
			System.out.println("ter�a-feira");
		}else if(diaSemana.equals ("sexta")) {
			System.out.println("sexta-feira");
		}else {
			System.out.println("N�o corresponde a um dia da semana");
		}
		
		int diasSemana = 7;
		
		switch (diasSemana) {
		case 1:
			System.out.println("Domingo");
		case 2:
			System.out.println("Segunda");
		case 3:
			System.out.println("Ter�a");
		case 4:	
			System.out.println("Quarta");
		case 5:
			System.out.println("Quinta");
		case 6:	
			System.out.println("Sexta");
		case 7:
			System.out.println("Sabado");
					
			break;

		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		}
		
		
	}

}



