package principal;

import java.util.Scanner;

public class NotaAlunoMatriz {

	public static void main(String[] args) {
		
		/*
		 * )Fazer uma matriz 4 x 4 para inserir nome e as 4 notas do aluno,
		 *  não precisa mostrar a media.
		 *  Imprima o nome e as notas
		 */
		
		Scanner scanner = new Scanner(System.in);

        String[] studentData = new String[6]; // 6 elementos (nome + 5 notas)

        // Solicitando o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        studentData[0] = scanner.nextLine();

        // Solicitando e armazenando as notas do aluno
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + " do aluno: ");
            studentData[i] = scanner.nextLine();
        }

        // Imprimindo os dados do aluno
        System.out.println("Nome: " + studentData[0]);
        System.out.println("Notas:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nota " + i + ": " + studentData[i]);
        }

        scanner.close();
	}

}
