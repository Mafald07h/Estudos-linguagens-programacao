import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> primeiroDicionario = new HashMap();
        
        primeiroDicionario.put("Heitor",18);
        primeiroDicionario.put("Helena",10);
        primeiroDicionario.put("Enzo",24);
        primeiroDicionario.put("Thiago",20);

        System.out.println(primeiroDicionario);
        System.out.println(primeiroDicionario.get("Heitor"));
        System.out.println(primeiroDicionario.get("Enzo"));

        primeiroDicionario.remove("Thiago");
        System.out.println(primeiroDicionario);
    }
}
