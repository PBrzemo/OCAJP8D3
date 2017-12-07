package napisy;

public class TworzenieNapisow {

	
	static String kolejneLiczby(int n) {
		String w = "";
		for (int i = 1; i<n; i++) {
			//w += i + " ";
			w = new StringBuilder(w).append(i).toString();
		}
		return w;
		
	
	}
	public static void main(String[] args) {
		String wynik;
		int n;
		n = 10;
		wynik = kolejneLiczby(n);
		System.out.println(wynik); //12345678910
		System.out.println("--------");
		
		n = 20;
		System.out.println(wynik);
	}

}
