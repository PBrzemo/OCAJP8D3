package tablice;

import java.util.Arrays;

public class Tablice3 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = a;
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length; i++) {
            a[i] += 5;
        }
        System.out.println(Arrays.toString(a));
        
        a = new int[10];
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        
        //NK a = {11, 22, 33, 44, 55}; // zła składnia
        // tak można pisać gdy DEKALRUJE się nową zmienną typu tablicowego
        int[] c = {11, 22, 33, 44, 55};
        
        // przy przypisaniu i w każdej sytuacji, gdzie oczekiwana jest tablica, można napisć tak:
        // tworzymy nowy obiekt wypełniony wartościami:
        a = new int[] {11, 33, 55, 77, 99};
        System.out.println(Arrays.toString(a));

    }

}



