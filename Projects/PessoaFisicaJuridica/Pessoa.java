public abstract class Pessoa{
	private String nome;
	private double rendaAnual;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public String getNome() {
		return nome;
	}
	public double getRendaAnual() {
		return rendaAnual;
	
	
	}

	public abstract double impostoPago();

}
