package lambdy;

public class Lambdy1 {

	public static void main(String[] args) {
		String s;
		FunkcjaNapisowa f1 = x -> x +".";
		
		s = f1.zmien("Ala ma ktoa");
		System.out.println(s);
		
		FunkcjaNapisowa f2 = x -> x.toUpperCase();
		s = f2.zmien("Ala ma ktoa");
		System.out.println(s);
		
		f2 = String::toUpperCase;
		s = f2.zmien("Ala ma ktoa");
		System.out.println(s);
		
		f2 = y ->y +" "+y;
		s = f2.zmien("Ala ma ktoa");
		System.out.println(s);
	}

}
