import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> listaDeValores;

        listaDeValores = retornaLista();
        adicionarElementosLista(listaDeValores);

        for (int i = 0; i < listaDeValores.size(); i++) {
            System.out.println(listaDeValores.get(i));
        }
        System.out.println("Media aritmetica = "+mediaAritmetica(listaDeValores));
    }
    public static List<Integer> retornaLista(){
        List<Integer> listaDeValores =  new ArrayList<>();
        return listaDeValores;
    }
    public static boolean adicionarElementosLista(List<Integer> valores) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        boolean adicaoCorreta;

        System.out.println("Quantos elementos quer adicionar a lista? ");
        quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Valor " + (i + 1));
            adicaoCorreta = valores.add(sc.nextInt());
            if (!(adicaoCorreta)){
                return false;
            }

        }
        return true;
    }
    public static double mediaAritmetica(List<Integer> valores){
        double soma=0, media;
        for (int i = 0; i < valores.size(); i++) {
            soma+=valores.get(i);
        }
        media = soma/ valores.size();
        return media;
    }
}
