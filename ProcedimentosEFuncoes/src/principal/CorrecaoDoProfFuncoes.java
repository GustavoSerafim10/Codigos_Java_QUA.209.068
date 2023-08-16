package principal;

import java.util.Scanner;

public class CorrecaoDoProfFuncoes {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Entre com o valor da largura: ");
		 double largura = sc.nextDouble();
		 
		 System.out.println("Entre com o valor do comprimento: ");
		 double comprimento = sc.nextDouble();
		 
		 System.out.printf("O terreno tem: %.2f metros quadrados",
				 calculaAreaTerreno(largura, comprimento));
		  
		 sc.close();
		 
	}
	
	

	{
		
	}
	static double calculaAreaTerreno(double largura, double comprimento)
		return largura * comprimento;
}
}
