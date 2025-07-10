package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
         var resultado = Aritmetica.division(10,0);
        System.out.println("Resultado: "+ resultado );

        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        finally {
            System.out.println("Se reviso la division aritmetica");
        }
    }
}
