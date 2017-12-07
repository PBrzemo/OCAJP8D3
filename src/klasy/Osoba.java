package klasy;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
    // To są pola / atrybuty / zmienne instancyjne
    // field / attribute / instance variable
    // Uwaga: w Javie słowo własność (property) oznacza coś innego (zwiąane z getterami i setterami)
    String imie, nazwisko;    
    LocalDate dataUrodzenia;
    
    // Konstruktory
    // Można podać wiele konstruktorów pod warunkiem,
    // że mają różną liczbę lub typ parametrów
    Osoba() {
        
    }
    
    Osoba(String imi, String naz) {
        imi = imie;
        nazwisko = naz;
    }

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public Osoba(String imie, String nazwisko, String data) {
        // wywołanie innego konstruktora (przy okazji konwersja String na LocalDate)
        this(imie, nazwisko, LocalDate.parse(data));
    }

    // Metody
    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    
    int ileMaszLiter() {
        return imie.length() + nazwisko.length();
    }
    
    public String toString() {
        return imie + " " + nazwisko + " ur." + dataUrodzenia;
    }
    
    public int getWiek() {
    	if(dataUrodzenia == null) {
    		return 0;
    		}
    	Period okres = Period.between(dataUrodzenia, LocalDate.now());
//    	System.out.println("okres: " + okres);
    	return okres.getYears();
    }
    
    String kimJestes() {
    		return "jestem osoba";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataUrodzenia == null) ? 0 : dataUrodzenia.hashCode());
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (dataUrodzenia == null) {
			if (other.dataUrodzenia != null)
				return false;
		} else if (!dataUrodzenia.equals(other.dataUrodzenia))
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		return true;
	}
    
//  @Override 
//	public Osoba clone() {
//	   return new Osoba(imie, nazwisko, dataUrodzenia);
//   }
   
}



