import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        adicionarElementosLista(valores);
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }
        removeElementoLista(valores);
        System.out.println("Lista atualizada");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }

    }
    public static void adicionarElementosLista(List<Integer> valores){
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.println("Quantos elementos quer adicionar a lista? ");
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Valor "+(i+1));
            valores.add(sc.nextInt());
        }

    }
    public static void removeElementoLista(List<Integer> valores){
        Scanner sc = new Scanner(System.in);
        Integer valorRemovido;
        System.out.println("Qual valor deseja remover da lista? ");
        valorRemovido = sc.nextInt();
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i).equals(valorRemovido)){
                System.out.println(valores.get(i)+" "+valorRemovido);
                valores.remove(valorRemovido);
            }
        }



    }
}