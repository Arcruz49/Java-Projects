public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public String getNome() {
        return nome;
    }
    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }
    public double getMedia(){
        this.media = (this.getN1() +this.getN2())/2;
        return media;
    }
}
