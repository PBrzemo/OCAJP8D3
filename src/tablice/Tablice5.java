package tablice;

import java.util.Arrays;

public class Tablice5 {

    public static void main(String[] args) {
        // Tablica dwuwymiarowa jest tak naprawdę tablicą tablic
        // Kolejne wiersze mogą być różnej długości
        // Elementem (wierszem) może być też null
        String[][] t = {
            {"Ala", "Ola", "Ela", "Ula"},
            {"Wrocław", "Warszawa", "Kraków"},
            {},
            null,
            new String[5]
        };

        System.out.println(Arrays.deepToString(t));
        System.out.println();
        System.out.println();
        System.out.println();

        for (String[] strings : t) {
            System.out.println(Arrays.toString(strings));
        }
        
    }

}



