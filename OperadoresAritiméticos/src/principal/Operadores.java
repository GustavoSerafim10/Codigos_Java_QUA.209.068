package principal;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * operador "+" para soma 
		 * operador "-" para subtração
		 * operador "+" para multiplicação
		 * operador "/" para divisão
		 * operador "%" para o resto da divisão
		 */
		
		int numero1 = 10;
		int numero2 = 10;
		int soma = numero1 + numero2;
		int divisao = numero1 / numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 + numero2;
		int restoDaDivisao = numero1 % numero2;
		int calculo = (10 + 10) * 10 / 10;
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Somando 2 numeros: " + (numero1 + numero2));
		System.out.println("Divisão de 2 numeros: " + divisao);
		System.out.println("Subtração de 2 numeros: " + subtracao);
		System.out.println("Multiplicao de 2 numeros: " + multiplicacao);
		System.out.println("Resto da divisão: " + restoDaDivisao);
		System.out.println("Restou do calculo: " + calculo);
		
		}

}
