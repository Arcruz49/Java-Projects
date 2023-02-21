public class PessoaJuridica extends Pessoa{
	private Integer nFuncionarios;
	
	public PessoaJuridica() {
	}
	public PessoaJuridica(String nome, double rendaAnual, Integer nFuncionarios) {
		super(nome,rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}
	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	public Integer getnFuncionarios() {
		return nFuncionarios;
	}
	
	@Override
	public double impostoPago() {
		double valor = 0;
		if(getnFuncionarios() > 10) {
			valor = getRendaAnual() * 0.14;
		}
		else {
			valor = getRendaAnual() * 0.16;
		}
		return valor;
	}
	
}
