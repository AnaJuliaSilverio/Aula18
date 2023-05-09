import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        System.out.println("Digite o primeiro valor");
        valores.add(sc.nextInt());
        System.out.println("Digite o segundo valor");
        valores.add(sc.nextInt());
        System.out.println("A ordem decrescente dos valores é: ");
        ordemDecrescente(valores);
        for (int i = 0; i < 2; i++) {
            System.out.println(valores.get(i));
        }
    }

    public static void ordemDecrescente(List<Integer> valores) {
        int trocaPosicao;
        if (valores.get(0)<valores.get(1)){
            trocaPosicao = valores.get(1);
            valores.remove(1);
            valores.add(0,trocaPosicao);
        }
    }
}
