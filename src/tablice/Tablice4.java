package tablice;

import java.util.Arrays;

public class Tablice4 {

    public static void main(String[] args) {
        int[][] macierz = new int[3][5];
        
        System.out.println(Arrays.deepToString(macierz));
        System.out.println();
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i = 0; i < macierz.length; i++) {
            for(int j = 0; j < macierz[i].length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int[] wiersz : macierz) {
            for(int element : wiersz) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

}



