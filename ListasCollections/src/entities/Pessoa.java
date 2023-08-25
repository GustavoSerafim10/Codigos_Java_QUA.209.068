package entities;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	
	//Alt + shift + S = Generic construtuors using fields
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Vou sobre Escrever pois no programPessoa deu erro ai teria que fazer isso
	//dar um ToString+ espaço tlg.
	
	@Override
	public String toString() {
		//Vou escrever o que vai ser impresso lá tlg
		return "Nome: " + nome + "\nIdade: " + idade + "\n";
	}

	@Override
	public int compareTo(Pessoa umaOutraPessoa) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(umaOutraPessoa.nome);
		
	}

}
