package klasy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
    int rok;
    String kierunek;
    List<Double> oceny = new ArrayList<>();
    
    public Student() {
        super();
    }
    
    public Student(String imie, String nazwisko, LocalDate dataUrodzenia, int rok, String kierunek) {
        super(imie, nazwisko, dataUrodzenia);        
        this.rok = rok;
        this.kierunek = kierunek;
    }

    public Student(String imie, String nazwisko, String data, int rok, String kierunek) {
        super(imie, nazwisko, data);
        this.rok = rok;
        this.kierunek = kierunek;
    }
    
    @Override
    public String toString() {
        return super.toString() + " student " + rok + " roku kierunku " + kierunek;
    }
    
    void dodajOcene(Double ocena) {
    	oceny.add(ocena);
    }
    
    double getSredniaOcen() {
    	double sumaOcen = 0;
    	for (Double ocena : oceny) {
			sumaOcen += ocena;
    		  
		}
    	return sumaOcen/oceny.size(); 
    }
    String kimJestes() {
		return "jestem studentem "+ kierunek;
}
}



