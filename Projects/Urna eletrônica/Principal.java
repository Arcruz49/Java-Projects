import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void leCandidatos(Scanner teclado, List<Candidato> candidatos, HashMap<String,Candidato> map){
        for(int i = 0; i < 2; i++){
            System.out.print("Nome candidato: ");
            String nome = teclado.nextLine();
            System.out.print("Partido: ");
            String partido = teclado.nextLine();
            System.out.print("Número: ");
            String numero = teclado.nextLine();
            Candidato candidato = new Candidato(nome,partido,numero);
            candidatos.add(candidato);
            map.put(numero,candidato);
        }
    }
    public static void leEleitores(Scanner teclado, List<Eleitor> eleitores, HashMap<String,Candidato> map){
            for(int i = 0; i < 3; i++){
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine();
            System.out.print("CPF: ");
            String CPF = teclado.nextLine();
            System.out.print("Voto: ");
            String voto = teclado.nextLine();
            Eleitor eleitor = new Eleitor(nome, CPF, voto);
            map.get(voto).recebeVoto();
            eleitores.add(eleitor);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <Candidato> candidatos = new ArrayList<>();
        List <Eleitor> eleitores = new ArrayList<>();
        HashMap<String,Candidato> map = new HashMap<String, Candidato>();

        leCandidatos(teclado, candidatos, map);
        leEleitores(teclado, eleitores, map);

        for(int i = 0; i < candidatos.size(); i++){
            System.out.println(candidatos.get(i).toString());
        }
        teclado.close();
    }
}
