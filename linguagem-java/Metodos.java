public class Metodos {
    public static void main(String[] args) {
        System.out.println(somarNumeros(10, 5));
        mostrarListaItens(new int[]{1,2,3,4,5});
    }


    static public int somarNumeros(int a, int b){
        return a+b;
    }

    static public void multiplicarNumeros(int a, int b){
        System.out.println(a*b);
    }

    static public void mostrarListaItens(int[] lista){
        for (int valor : lista){
            System.out.println(valor);
        }
    }

}
