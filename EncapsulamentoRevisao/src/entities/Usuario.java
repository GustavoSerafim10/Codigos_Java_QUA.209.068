package entities;

public class Usuario {
//corrigindo o exercício 3 de ontem
	
	private String nome;
	private String e_mail;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void obterDadosUsuario() {
		System.out.println("Nome do usuário: " + nome);
		System.out.println("e_mail : " + e_mail);
		System.out.println("senha: " + senha);
		
	}
	
	
}
