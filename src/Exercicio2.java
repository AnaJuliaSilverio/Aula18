import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        adicionarElementosLista(valores);
        adicionaPosicaoEspecifica(valores);
        System.out.println("Lista atualizada");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
    }
    public static void adicionarElementosLista(List<Integer> valores) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.println("Quantos elementos quer adicionar a lista? ");
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Valor " + (i + 1));
            valores.add(sc.nextInt());
        }
    }
    public static void adicionaPosicaoEspecifica(List<Integer> valores){
        Scanner sc = new Scanner(System.in);
        int valorAdicionado,posicaoValorAdd;
        System.out.println("Qual valor deseja adicionar da lista? ");
        valorAdicionado = sc.nextInt();
        System.out.println("Qual posição deseja adicionar o valor? ");
        posicaoValorAdd = sc.nextInt();
        valores.add((posicaoValorAdd-1),valorAdicionado);
    }
}
