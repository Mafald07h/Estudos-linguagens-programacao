import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero1 = entrada.nextInt();
        switch (numero1) {
            case 1:
                System.out.println("Número 1");
                break;
            default:
                System.out.println("Outro número");
                break;
        }
    }
}
