package entidades;

public class ContribuinteIndividual extends Contribuinte {

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
		Double renda = 0.0;
		if (rendaanual <= 20000) {
			return renda = rendaanual * 0.15 - gastosaude * 0.50;
		} else if (rendaanual >= 20000) {
			return rendaanual * 0.25 - gastosaude * 0.50;
		}

		return renda;
	}

}
