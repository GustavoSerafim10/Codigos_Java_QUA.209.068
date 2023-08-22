package entities;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	public String getNome() { //usei alt + shift + S.. GGA.. 
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerQuantidade(int quantidade)	{
		this.quantidade -= quantidade;
	}
	
	public void mostrarEstoque() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Quantidade em es toque: " + quantidade);
		System.out.println("Preço unitario: " + preco);
		System.out.println("Valor total em estoque: " + (quantidade * preco));
		
	}

	

}
