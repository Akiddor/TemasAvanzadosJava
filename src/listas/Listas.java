package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> milist = new ArrayList<>();

        milist.add("A");
        milist.add("B");
        milist.add("C");
        milist.add("D");
        milist.add("E");
        milist.add("F");

        for (String mil : milist) {
            System.out.println("Abecedar: " + mil);
        }
    }
}
