package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int ano;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getIdade() {
		return idade;
	}
	
	//dentro os () signfica parâmetro viu 
	public void calcularIdade(int anoNascimento) {
		idade = 2023 - anoNascimento;
	}
	
	public void impremeDados() {
		System.out.println("%s tem %d anos, nome, idade");
	}
}
