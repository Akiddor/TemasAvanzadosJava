package crearArchivo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        String fileName = "mi_archivo.txt";


        try {


            List<String> line =  Files.readAllLines(Paths.get(fileName));
            System.out.println("Contenido del archivo: ");
            for (String s : line) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
    }
}
