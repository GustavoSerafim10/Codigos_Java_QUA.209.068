package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("Entre com o nome do usuário: ");
		usuario.setNome(sc.nextLine());
		System.out.println("Entre com o e_email: ");
		usuario.setE_mail(sc.nextLine());
		System.out.println("Cadastre uma senha:");
		usuario.setSenha(sc.nextLine());
		
		usuario.obterDadosUsuario();
		  
		

	}

}
