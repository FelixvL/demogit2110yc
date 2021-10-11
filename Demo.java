
public class Demo {
	
	public static void main (String[] args) {
		Demo d = new Demo();
		d.herewego();    // 2e manier
		Spel s= new Spel();
		s.starten();
		s.getal = 9;
		Spel s2 = new Spel();
		System.out.println(s.getal);
		System.out.println(s2.getal);
		Spel.getal = 24;
		System.out.println("Het programma is afgelopen!");
	}
	void herewego() {
		System.out.println("here we go");
	}
}
class Spel{
	static int getal = 7;
	void starten() {
		
	}
}



