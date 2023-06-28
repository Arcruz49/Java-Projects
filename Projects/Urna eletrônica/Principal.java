import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static List<Candidato> leCandidatos(Scanner teclado,HashMap<String,Candidato> map){
        List <Candidato> lista = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            System.out.print("Nome candidato: ");
            String nome = teclado.nextLine();
            System.out.print("Partido: ");
            String partido = teclado.nextLine();
            System.out.print("Número: ");
            String numero = teclado.nextLine();
            Candidato candidato = new Candidato(nome,partido,numero);
            lista.add(candidato);
            map.put(numero,candidato);
        }
        return lista;
    }
    public static List<Eleitor> leEleitores(Scanner teclado, HashMap<String,Candidato> map){
            List <Eleitor> lista = new ArrayList<>();
            for(int i = 0; i < 3; i++){
                System.out.print("Digite seu nome: ");
                String nome = teclado.nextLine();
                System.out.print("CPF: ");
                String CPF = teclado.nextLine();
                System.out.print("Voto: ");
                String voto = teclado.nextLine();
                Eleitor eleitor = new Eleitor(nome, CPF, voto);
                map.get(voto).recebeVoto();
                lista.add(eleitor);
            }
            return lista;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String,Candidato> map = new HashMap<String, Candidato>();

        List <Candidato> candidatos = leCandidatos(teclado,map);
        List <Eleitor> eleitores = leEleitores(teclado,map);

        for(int i = 0; i < candidatos.size(); i++){
            System.out.println(candidatos.get(i).toString());
        }
        teclado.close();
    }
}
