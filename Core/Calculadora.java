package Core;

public class Calculadora {
    public static String metodo1(int n) {
        String resultado = "";
        if (n%15 == 0){
            resultado = "facebook";
            return resultado;
        } else if (n%5 == 0){
            resultado = "book";
            return resultado;
        } else if (n%3 == 0){
            resultado = "Face";
            return resultado;
        } else {
            resultado = n + "";
        }
        return resultado;
    }

    public static String metodo2(int [] valores) {

    }
}
