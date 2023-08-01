package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	private Date datafabricação;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preço, Date datafabricação) {
		super(nome, preço);
		this.datafabricação = datafabricação;
	}

	public Date getDatafabricação() {
		return datafabricação;
	}

	public void setDatafabricação(Date datafabricação) {
		this.datafabricação = datafabricação;
	}
	
	@Override
	public String etiquetadepreço() {
		return nome + " (Usado) R$ " + preço + " (Data de Fabricação: " + sdf.format(datafabricação) + ")";
	}
}
