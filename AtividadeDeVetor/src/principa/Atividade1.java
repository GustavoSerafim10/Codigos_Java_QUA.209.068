package principa;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
		//Escrever o nome
		//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		//Neste exemplo, os comentários indicam as etapas do processo:
		//Leitura do nome dos times.
		//Leitura dos gols marcados por cada time.
		//Verificação do vencedor ou empate.
		
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do nome dos times
	        System.out.print("Digite o nome do time 1: ");
	        String time1 = scanner.nextLine();

	        System.out.print("Digite o nome do time 2: ");
	        String time2 = scanner.nextLine();

	        // Leitura dos gols marcados por cada time
	        System.out.print("Digite o número de gols marcados pelo time 1: ");
	        int golsTime1 = scanner.nextInt();

	        System.out.print("Digite o número de gols marcados pelo time 2: ");
	        int golsTime2 = scanner.nextInt();

	        // Verificação do vencedor ou empate
	        if (golsTime1 > golsTime2) {
	            System.out.println("O vencedor é o time " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("O vencedor é o time " + time2);
	        } else {
	            System.out.println("EMPATE");
	        }

	        scanner.close();

		
	}

}
