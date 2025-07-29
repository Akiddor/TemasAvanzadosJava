package Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa  {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();

        persona.put("nombre","Brian");
        persona.put("apellido", "Guerrero");
        persona.put("edad", "31");

        System.out.println("Valores del mapa o diccionario");

        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa uno por uno

        persona.forEach((key,values) -> {
            System.out.println("El valor es: " + key + " =  " + values);
        });


    }
}
