package klasy;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        // Uwaga: zbiory (Set, HashSet) - poza zakresem OCAJP        
        Osoba ala = new Osoba("Ala", "Kowalska", "1987-06-05");
        Osoba ref = ala;
        Osoba ala2 = new Osoba("Ala", "Kowalska", "1987-06-05");
        Osoba ala3 = new Osoba("Ala", "Kowalska", "1987-04-05");
        Osoba ola = new Osoba("Ola", "Malinowska", "2003-04-05");

        List<Osoba> lista = new ArrayList<>();
        boolean b;
        b = lista.add(ala);
        System.out.println(b);
        b = lista.add(ref);
        System.out.println(b);
        b = lista.add(ala2);
        System.out.println(b);
        b = lista.add(ala3);
        System.out.println(b);
        b = lista.add(ola);
        System.out.println(b);
        
        System.out.println("Lista ma elementów: " + lista.size());
        for (Osoba osoba : lista) {
            System.out.println(osoba);
        }
        
        System.out.println("index: " + lista.indexOf(ala2));
    }
}



