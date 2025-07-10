package excepciones;

public class Excepciones {
  public static void main(String[] args) {
        int v1 = 10, v2 = 0;

        try {
        int resultado = v1 / v2;
        System.out.println(resultado);

        }catch (Exception e) {
            System.out.println("Ocurrio un error: "+ e);
        }

    }

}
