package com.mycompany.ejemplohashtable;
import java.util.Hashtable;

public class VerificarClaveHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Uno");
        hashtable.put(2, "Dos");
        hashtable.put(3, "Tres");

        int claveABuscar = 2;
        if (hashtable.containsKey(claveABuscar)) {
            System.out.println("La clave " + claveABuscar + " existe en la Hashtable.");
        } else {
            System.out.println("La clave " + claveABuscar + " no existe en la Hashtable.");
        }
    }
}


