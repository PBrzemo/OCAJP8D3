package napisy;

import java.util.function.Function;

public class TworzenieNapisow2 {
    
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
    static String kolejneLiczbyBuilder2(int n) {
        // próbuję z góry oszacować ile znaków będzie potrzebnych
        int ileCyfr = (int) (Math.log10(n) + 2);
        
        StringBuilder napis = new StringBuilder(n * ileCyfr);
        for(int i = 1; i <= n; i++) {
            napis.append(i).append(' ');
        }
        return napis.toString();
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
    	zmierzCzas(10000, TworzenieNapisow2::kolejneLiczbyPlus);
        zmierzCzas(20000, TworzenieNapisow2::kolejneLiczbyPlus);
        zmierzCzas(40000, TworzenieNapisow2::kolejneLiczbyPlus);
        zmierzCzas(100_000, TworzenieNapisow2::kolejneLiczbyPlus);
//        zmierzCzas(1000_000, TworzenieNapisow2::kolejneLiczbyPlus);
//        zmierzCzas(10_000_000, TworzenieNapisow2::kolejneLiczbyPlus);
    	System.out.println("----------------------------------");
    	System.out.println("Concat");
        zmierzCzas(10000, TworzenieNapisow2::kolejneLiczbyConcat);
        zmierzCzas(20000, TworzenieNapisow2::kolejneLiczbyConcat);
        zmierzCzas(40000, TworzenieNapisow2::kolejneLiczbyConcat);
        zmierzCzas(100_000, TworzenieNapisow2::kolejneLiczbyConcat);
//        zmierzCzas(1000_000, TworzenieNapisow2::kolejneLiczbyConcat);
//        zmierzCzas(10_000_000, TworzenieNapisow2::kolejneLiczbyConcat);
    	System.out.println("----------------------------------");
    	System.out.println("Builder");
        zmierzCzas(10000, TworzenieNapisow2::kolejneLiczbyBuilder);
        zmierzCzas(20000, TworzenieNapisow2::kolejneLiczbyBuilder);
        zmierzCzas(40000, TworzenieNapisow2::kolejneLiczbyBuilder);
        zmierzCzas(100_000, TworzenieNapisow2::kolejneLiczbyBuilder);
        zmierzCzas(1000_000, TworzenieNapisow2::kolejneLiczbyBuilder);
        zmierzCzas(10_000_000, TworzenieNapisow2::kolejneLiczbyBuilder);
    	System.out.println("----------------------------------");
        System.out.println("StringBuilder 2");
        zmierzCzas(10000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        zmierzCzas(20000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        zmierzCzas(40000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        zmierzCzas(100_000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        zmierzCzas(1000_000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        zmierzCzas(10_000_000, TworzenieNapisow2::kolejneLiczbyBuilder2);
        // przekroczenie pamieci
        //zmierzCzas(100_000_000, TworzenieNapisow2::kolejneLiczbyBuilder2);
    }

}



