public class PessoaFisica extends Pessoa{
	private double gastoSaude;
	
	public PessoaFisica () {
		
	}
	
	public PessoaFisica (String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	public double getGastoSaude() {
		return gastoSaude;
	}

	
	@Override
	public double impostoPago() {
		double valor = 0;
		if(getRendaAnual() < 20000) {
			valor = getRendaAnual() * 0.15;
		}
		else {
			valor = getRendaAnual() * 0.25;
		}
		valor = valor - getGastoSaude()/2;
		return valor;
	}
	
	
}
