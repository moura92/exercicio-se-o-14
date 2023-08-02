package entidades;

public abstract class Contribuinte {

	private String nome;
	protected Double rendaanual;

	public Contribuinte() {
		super();
	}

	public Contribuinte(String nome, Double rendaanual) {
		super();
		this.nome = nome;
		this.rendaanual = rendaanual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaanual() {
		return rendaanual;
	}

	public void setRendaanual(Double rendaanual) {
		this.rendaanual = rendaanual;
	}

	public abstract Double taxa();
}
