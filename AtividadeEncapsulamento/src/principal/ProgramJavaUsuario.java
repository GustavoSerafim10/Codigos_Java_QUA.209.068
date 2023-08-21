package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramJavaUsuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, senha);

        System.out.println("\nBem-vindo, " + usuario.getNome() + "!");
        System.out.println("E-mail: " + usuario.getEmail());

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n===== Menu de Opções =====");
            System.out.println("1. Alterar Senha");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite a nova senha: ");
                    String novaSenha = scanner.nextLine();
                    usuario.alterarSenha(novaSenha);
                    break;
                case 2:
                    System.out.println("Saindo do programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        scanner.close();

	}

}
