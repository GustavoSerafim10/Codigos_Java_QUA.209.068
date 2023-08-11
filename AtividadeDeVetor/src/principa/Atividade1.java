package principa;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Ler o nome de 2 times e o n�mero de gols marcados na partida (para cada time). 
		//Escrever o nome
		//do vencedor. Caso n�o haja vencedor dever� ser impressa a palavra EMPATE.
		
		//Neste exemplo, os coment�rios indicam as etapas do processo:
		//Leitura do nome dos times.
		//Leitura dos gols marcados por cada time.
		//Verifica��o do vencedor ou empate.
		
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do nome dos times
	        System.out.print("Digite o nome do time 1: ");
	        String time1 = scanner.nextLine();

	        System.out.print("Digite o nome do time 2: ");
	        String time2 = scanner.nextLine();

	        // Leitura dos gols marcados por cada time
	        System.out.print("Digite o n�mero de gols marcados pelo time 1: ");
	        int golsTime1 = scanner.nextInt();

	        System.out.print("Digite o n�mero de gols marcados pelo time 2: ");
	        int golsTime2 = scanner.nextInt();

	        // Verifica��o do vencedor ou empate
	        if (golsTime1 > golsTime2) {
	            System.out.println("O vencedor � o time " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("O vencedor � o time " + time2);
	        } else {
	            System.out.println("EMPATE");
	        }

	        scanner.close();

		
	}

}
