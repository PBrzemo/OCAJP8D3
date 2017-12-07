package napisy;

import java.util.Scanner;

public class Porownanie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String wczytany = sc.nextLine();
        
        String ala = "Ala";
        final String alaf = "Ala";
        
        String a = "Ala ma kota";
        String b = "Ala" + " ma kota";
        String c = ala + " ma kota";
        String d = alaf + " ma kota";
        String e = new String(a);
        
        System.out.println(a);
        System.out.println(wczytany);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println();

        // == sprawdza czy to jest TEN SAM OBIEKT (porównuje adresy a nie zawartość obiektów)
        System.out.println("za pomocą ==");
        if(a == wczytany) {
            System.out.println("równe");
        } else {
            System.out.println("nierówne");
        }
        System.out.println(a == wczytany); // F
        System.out.println(a == b); // T
        System.out.println(a == c); // F
        System.out.println(a == d); // T
        System.out.println(a == e); // F

        System.out.println();
        System.out.println("za pomocą equals");
        if(a.equals(wczytany)) {
            System.out.println("równe");
        } else {
            System.out.println("nierówne");
        }
        System.out.println(a.equals(wczytany));
        System.out.println(a.equals(b)); // T
        System.out.println(a.equals(c)); // T
        System.out.println(a.equals(d)); // T
        System.out.println(a.equals(e)); // T
    }

}



