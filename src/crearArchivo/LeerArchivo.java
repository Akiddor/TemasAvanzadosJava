package crearArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer el archivo

        String fileName = "mi_archivo.txt";

        File archivo = new File(fileName);

        try {

            System.out.println("Contenido del archivo: ");

            var entrada = new BufferedReader(new FileReader(archivo));

            while (entrada.ready()) {
                System.out.println(entrada.readLine());
            }

            // Cereramos el archivo

            entrada.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }


    }
}


