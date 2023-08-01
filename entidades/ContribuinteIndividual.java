package entidades;

public class ContribuinteIndividual extends Contribuinte{

	private Double gastosaude;

	public ContribuinteIndividual() {
		super();
	}

	
	public ContribuinteIndividual(String nome, Double rendaanual, Double gastosaude) {
		super(nome, rendaanual);
		this.gastosaude = gastosaude;
	}


	public Double getGastosaude() {
		return gastosaude;
	}


	public void setGastosaude(Double gastosaude) {
		this.gastosaude = gastosaude;
	}


	@Override
	public Double taxa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
