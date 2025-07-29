package crearArchivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {

    public static void main(String[] args) throws IOException {

        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        // Preguntar si existe este archivo
        if (archivo.exists()) {
            System.out.println("El archivo ya existe");
        }else {
            //Creamos el archivo
            PrintWriter escribirArchivo = new PrintWriter(new FileWriter(nombreArchivo));
            escribirArchivo.close();
            System.out.println("El archivo se ha creado");
        }
    }
}
