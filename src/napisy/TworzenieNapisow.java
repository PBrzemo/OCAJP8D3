package napisy;

import java.util.function.Function;

public class TworzenieNapisow {
    
    static String kolejneLiczbyPlus(int n) {
        String w = "";
        for(int i = 1; i <= n; i++) {
            w += i + " ";
        }
        return w;
    }
    static String kolejneLiczbyConcat(int n) {
        String w = "";
        for(int i = 1; i <= n; i++) {
            w = w.concat(i + " ");
        }
        return w;
    }
    static String kolejneLiczbyBuilder(int n) {
    	StringBuilder w = new StringBuilder();
        for(int i = 1; i <= n; i++) {
        	//w = new StringBuilder(w).append(i + " ").toString();
        	w.append(i).append(' ');
        }
        //return w;
        return w.toString();
    }

    
    static void zmierzCzas(int n, Function<Integer, String> metoda) {
        System.out.println();
        System.out.printf("Startujemy dla n = %d\n", n);
        long start = System.currentTimeMillis(); // albo System.nanoTime()
        String wynik = metoda.apply(n);
        long koniec = System.currentTimeMillis();
        System.out.printf("Dla n = %d czas: %dms, len: %d\n",
                n, koniec - start, wynik.length());
    }

    public static void main(String[] args) {
    	System.out.println("----------------------------------");
    	System.out.println("i++");
    	zmierzCzas(10000, TworzenieNapisow::kolejneLiczbyPlus);
        zmierzCzas(20000, TworzenieNapisow::kolejneLiczbyPlus);
        zmierzCzas(40000, TworzenieNapisow::kolejneLiczbyPlus);
    	System.out.println("----------------------------------");
    	System.out.println("Concat");
        zmierzCzas(10000, TworzenieNapisow::kolejneLiczbyConcat);
        zmierzCzas(20000, TworzenieNapisow::kolejneLiczbyConcat);
        zmierzCzas(40000, TworzenieNapisow::kolejneLiczbyConcat);
    	System.out.println("----------------------------------");
    	System.out.println("Builder");
        zmierzCzas(10000, TworzenieNapisow::kolejneLiczbyBuilder);
        zmierzCzas(20000, TworzenieNapisow::kolejneLiczbyBuilder);
        zmierzCzas(40000, TworzenieNapisow::kolejneLiczbyBuilder);
    }

}



