package insertarContenidoArchivo;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarTexto {
    public static void main(String[] args) {
        boolean anexar = false;

        String nombreArchivo = "mi_archivo.txt";

        File archivo = new File(nombreArchivo);

        try{

        // Revisar si existe el archivo

            anexar = archivo.exists();

            PrintWriter escribir = new PrintWriter(new FileWriter(archivo,anexar));
            String nuevoContenido = "\nNuevo\ncontenido";
            escribir.println(nuevoContenido);
            // Cerramos el flujo abierto

            escribir.close();


        }catch (Exception e){
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        }


    }

}
