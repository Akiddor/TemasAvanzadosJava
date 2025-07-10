package excepciones;

public class Aritmetica {

    public static int division(int numerdor, int denominador) {

        if (denominador == 0) {
            throw new RuntimeException("Division entre cero");
        }
            return numerdor / denominador;
    }
}
