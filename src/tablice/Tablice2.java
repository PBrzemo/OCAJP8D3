package tablice;

import java.util.Arrays;

public class Tablice2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = a;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println();
        
        Arrays.fill(a, 100);
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println();
        
        // Klasyczna pętla for (z licznikiem)
        // Może służyć do odczytywania i modyfikowania elementów w tablicy
        for (int i = 0; i < a.length; i++) {
            a[i] += i*i; // modyfikacja elementu w tablicy
            System.out.print(a[i] + "; ");
        }
        System.out.println();
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println();
        
        // Pętla "for-each", najprostszy sposób odczytywania elementów z tablicy (bądź kolekcji)
        // Służy tylko do odczytu - zmienna element jest kopią wartości
        for(int element : a) {
            element++;
            System.out.print(element + ": ");
        }
        System.out.println();
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        
    }

}



