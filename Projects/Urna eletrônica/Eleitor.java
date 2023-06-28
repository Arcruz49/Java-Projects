public class Eleitor {
    private String nome;
    private String CPF;
    private String voto;

    public Eleitor(String nome, String CPF, String voto){
        this.nome = nome;
        this.CPF = CPF;
        this.voto = voto;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }
    public String getVoto() {
        return voto;
    }
    public void setVoto(String voto) {
        this.voto = voto;
    }
}
