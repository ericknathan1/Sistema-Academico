package prova1;

public class Boleto {
	private String nome;
	private double valor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Boleto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public void exibir() {
		System.out.println("Nome: "+nome);
		System.out.println("Valor: R$"+valor);
	}
	
}
