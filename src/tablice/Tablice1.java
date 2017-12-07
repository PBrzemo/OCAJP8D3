package tablice;

import java.util.Arrays;

public class Tablice1 {

    public static void main(String[] args) {
        int[] a;
        
//NK        System.out.println(a);
//NK        System.out.println(a[1]);
//NK        a[2] = 2;  // tutaj tak naprawdę odczytujemy zmienną a - nie można bo niezainicjowana
    
        a = new int[10]; // teraz tworzę tablicę rozmiaru 10
        // nowotworzone tablice są wypełniane wartościami 0 lub null
        System.out.println(a[5]);
        a[2] = 22;
        a[5] = 55;
        System.out.println(a[5]);
        
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        
        // prawidłowe indeksy to od 0 do length-1
        System.out.println(a[0]);
        System.out.println(a[9]);
        
        // Nie da się zmienić długości istniejącej już tablicy
        // Na zmienną można wpisać nową tablicę
        a = new int[5];
        System.out.println(Arrays.toString(a));
        

    }

}



