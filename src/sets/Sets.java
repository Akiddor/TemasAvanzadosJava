package sets;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        Set<String> conjunto = new TreeSet<>();


        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        conjunto.add("D");
        conjunto.add("E");

        for (String s : conjunto) {
            System.out.println("Abecedary: " + s);
        }

        // Remove element

        conjunto.remove("D");

        // Check Set
        System.out.println("\n");
        for (String s : conjunto) {
            System.out.println("Abecedary: " + s);
        }
    }
}
