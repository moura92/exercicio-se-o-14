package entidades;

public class ContribuinteEmpresa extends Contribuinte{

	private Integer numeroempregados;

	
	public ContribuinteEmpresa() {
		super();
	}

	public ContribuinteEmpresa(String nome, Double rendaanual, Integer numeroempregados) {
		super(nome, rendaanual);
		this.numeroempregados = numeroempregados;
	}

	public Integer getNumeroempregados() {
		return numeroempregados;
	}

	public void setNumeroempregados(Integer numeroempregados) {
		this.numeroempregados = numeroempregados;
	}

	@Override
	public Double taxa() {
		// TODO Auto-generated method stub
		return null;
	}
}
