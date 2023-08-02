package entidades;

public class ContribuinteEmpresa extends Contribuinte {

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
		double renda = 0;
		if (numeroempregados >= 10) {
			return renda = rendaanual * 0.14;
		} else if (numeroempregados <= 10) {
			return renda = rendaanual * 0.16;
		}
		return renda;

	}
}
