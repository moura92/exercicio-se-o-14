package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaalfandega;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preço, Double taxaalfandega) {
		super(nome, preço);
		this.taxaalfandega = taxaalfandega;
	}

	public Double getTaxaalfandega() {
		return taxaalfandega;
	}

	public void setTaxaalfandega(Double taxaalfandega) {
		this.taxaalfandega = taxaalfandega;
	}
	
	@Override
	public String etiquetadepreço() {
		return nome + " R$ " + preçototal() + " (Taxa: R$ " + String.format("%.2f", taxaalfandega) + ")";
	}
	
	public Double preçototal() {
		return preço + taxaalfandega;
	}
	
	
}
