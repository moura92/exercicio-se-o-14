package entidades;

public class Produto {

	private String nome;
	private Double preço;
	
	public Produto() {
	}

	public Produto(String nome, Double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public String etiquetadepreço() {
		return 	nome
				+ " R$ " + String.format("%.2f", preço);
	}
}
