package klasy;

import java.util.HashSet;
import java.util.Set;

public class Zbior {

    public static void main(String[] args) {
        // Uwaga: zbiory (Set, HashSet) - poza zakresem OCAJP        
        Osoba ala = new Osoba("Ala", "Kowalska", "1987-06-05");
        Osoba ref = ala;
        Osoba ala2 = new Osoba("Ala", "Kowalska", "1987-06-05");
        Osoba ala3 = new Osoba("Ala", "Kowalska", "1987-04-05");
        Osoba ola = new Osoba("Ola", "Malinowska", "2003-04-05");

        Set<Osoba> zbior = new HashSet<>();
        boolean b;
        b = zbior.add(ala);
        System.out.println(b);
        b = zbior.add(ref);
        System.out.println(b);
        b = zbior.add(ala2);
        System.out.println(b);
        b = zbior.add(ala3);
        System.out.println(b);
        b = zbior.add(ola);
        System.out.println(b);
        
        System.out.println("Zbiór ma elementów: " + zbior.size());
        for (Osoba osoba : zbior) {
            System.out.println(osoba);
        }

    }

}



