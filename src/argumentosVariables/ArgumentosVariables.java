package argumentosVariables;

public class ArgumentosVariables {
    public static void main(String[] args) {

        imprimirNumeros(1,4,2,4,3,6,1,4);

    }

    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
