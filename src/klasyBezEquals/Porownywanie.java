package klasyBezEquals;

public class Porownywanie {
	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1987-06-05");
		Osoba ref = ala; 
		Osoba ala2 = new Osoba("Ala", "Kowalska", "1987-06-05");
		Osoba ala3 = new Osoba("Ala", "Kowalska", "1987-04-05");
		Osoba ola = new Osoba("ola", "Nowak", "2000-06-05");

		
		System.out.println(ala);
		System.out.println(ref);
		System.out.println(ala2);
		System.out.println(ala3);
		System.out.println(ola);
		System.out.println();
		System.out.println("Prównaine za pomocą ==");
		System.out.println(ref == ala); // te same obiekty
        System.out.println(ala2 == ala);
        System.out.println(ala3 == ala);
        System.out.println(ola == ala);
        System.out.println("Porównywanie za pomocą equals");
        System.out.println(ref.equals(ala));
        System.out.println(ala2.equals(ala));
        System.out.println(ala3.equals(ala));
        System.out.println(ola.equals(ala));
	}
}
