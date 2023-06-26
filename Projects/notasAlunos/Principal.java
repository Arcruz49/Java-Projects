import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void leNotas(Scanner teclado, List <Aluno> lista){
        //encerra o programa digitando 0 no nome
        while(true){
            Aluno aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.setNome(teclado.nextLine());
            if(aluno.getNome().equals("0")) break;
            System.out.print("n1: ");
            aluno.setN1(teclado.nextDouble());
            System.out.print("n2: ");
            aluno.setN2(teclado.nextDouble());
            teclado.nextLine();
            lista.add(aluno);
        }
    }
    public static String aprovacao(double media){
        if (media >= 6) return "Aprovado";
        return "Reprovado";
    }

    public static void imprimeNotas( List <Aluno> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("\nAluno: "+lista.get(i).getNome()+"\n"
                              +"Media: "+lista.get(i).getMedia()+"\n"
                              +aprovacao(lista.get(i).getMedia())+"\n");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List <Aluno> lista = new ArrayList<>();
        leNotas(teclado, lista);
        imprimeNotas(lista);
        teclado.close();
    }
}
