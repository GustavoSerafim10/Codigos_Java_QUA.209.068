package entities;

public class Produto implements Comparable<Produto> {

	private String nome;
	private int quantidade;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produto(String nome, int quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}
	public Produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	 @Override
	public String toString() {
		return "Nome: " + nome
				+", Quantidade: " + quantidade
				+", Preço unitário: " + preco;
		
	}
	@Override
	public int compareTo(Produto outroProduto) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outroProduto.nome);
		
	}
}
