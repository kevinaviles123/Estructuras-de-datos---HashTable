package com.mycompany.ejemplohashtable;
import java.util.Hashtable;

public class EliminarElementoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Uno");
        hashtable.put(2, "Dos");
        hashtable.put(3, "Tres");

        System.out.println("Elementos de la Hashtable antes de eliminar:");
        for (Integer key : hashtable.keySet()) {
            System.out.println(key + " => " + hashtable.get(key));
        }

        hashtable.remove(2);

        System.out.println("Elementos de la Hashtable después de eliminar:");
        for (Integer key : hashtable.keySet()) {
            System.out.println(key + " => " + hashtable.get(key));
        }
    }
}
