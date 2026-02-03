import java.security.SecureRandom;

public class LancarDados {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] frequencia = new int[7];

        for(int lancamento = 0; lancamento <= 50; lancamento++) {
            ++frequencia[1+randomNumber.nextInt(6)];

        }

        System.out.printf("%s%10s%n","Face","Frequência");

        for (int face = 1; face < frequencia.length; face++)
        System.out.printf("%4d%10d%n", face, frequencia[face]); 
    }
}