package principal;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NotaMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String[][] alunos = new String [4][5];
		
		for(int i = 0; i <alunos.length; i++){
			for(int j = 0; j <alunos[i].length; j++) {
				if(j == 0) {
					System.out.print("Entre com o nome do aluno: ");
					alunos[i][j] = sc.nextLine();
					}else {
						System.out.printf("Entre com a %d nota: ", (j));
						alunos[i][j] = sc.nextLine();
						}
			}
			System.out.println();
		}
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j <alunos[1].length; j++) {
				System.out.print(alunos[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
