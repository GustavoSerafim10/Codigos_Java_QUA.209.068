package principal;

public class Funcoes {

	public static void main(String[] args) {
		
		/*
		 * Fun��es representam um processamento
		 * ou processo;
		 * O que identifica uma fun��o s�o os parenteses ();
		 * Ex de fun��o/Procedimento: - no Caso imprimir algo na tela
		 * System.out.println()
		 */
		mostrarMensagem();
		mostrarMensagemComParametro(33); //StringFun��o recebida		
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebe: " + recebeCalcular);
		
		System.out.println("Resultado da soma: " + somar(10,20));
		
		int x = 10;
		int y = 100;
		
		System.out.print("Nova soma: " + somar(b,a));
	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o");
	}
	static void mostrarMensagemComParametro(int idade) { //void ai ele e uma fun��o vazia n�o mostra nada tlg
		System.out.println("Minh idade �: " + idade);
	}
	
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
		
	}
	
	static int somar(int,x, int y) {
		return x + y;
	}

}
