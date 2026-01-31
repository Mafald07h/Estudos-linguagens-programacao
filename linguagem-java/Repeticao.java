import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> numerosInteervalo = new ArrayList<>();

        System.out.println("Informe o início do intervalo: ");
        int inicio = entrada.nextInt();
        System.out.println("Informe o fim do intervalo: ");
        int fim = entrada.nextInt();
        for (int i = inicio+1; i<fim;i++){
            numerosInteervalo.add(i);
        }
        System.out.println("Os números presentes no intervalo é: " + numerosInteervalo);

        System.out.println("Informe um valor em inteiro: ");
        int valorInteiro = entrada.nextInt();
        while (valorInteiro <= 20){
            System.out.println(valorInteiro++);
        }
    }
}
