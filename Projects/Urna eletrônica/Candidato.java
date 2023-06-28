public class Candidato {
    private String nome;
    private String partido;
    private String numero;
    private Integer votos;
    
    public Candidato(String nome, String partido, String numero){
        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.votos = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Integer getVotos() {
        return votos;
    }
    public void recebeVoto(){
        this.votos++;
    }
    public String toString(){
        return "\nNome: "+getNome()+"\nNúmero: "+getNumero()+"\nVotos: "+getVotos()+"\n";
    }
}
