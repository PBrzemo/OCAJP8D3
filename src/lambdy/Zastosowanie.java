package lambdy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zastosowanie {
	
	// Zastosuje podaną funcję napisową do każdej linii ppdanego pliku i zapisze zmienione linie w nowym pliku
	static void zastosuj(FunkcjaNapisowa f, File wej, File wyj) {
		try(Scanner sc = new Scanner(wej);
			PrintWriter out = new PrintWriter(wyj)) {
			
			while(sc.hasNextLine()) {
				String linia = sc.nextLine();
				linia = f.zmien(linia);
				out.println(linia);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File wejscie = new File("pan-tadeusz.txt");
		
		zastosuj(String::toUpperCase, wejscie, new File("duze.txt"));
		zastosuj(s -> "! " + s + " #", wejscie, new File("hasze.txt"));
		System.out.println("Gotowe");
	}

}
