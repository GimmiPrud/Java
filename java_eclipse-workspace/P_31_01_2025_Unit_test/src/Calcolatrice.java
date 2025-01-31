
public class Calcolatrice {

	public static void main(String[] args) {
		
		Calcolatrice c = new Calcolatrice();
		System.out.println("La somma è " + c.somma(3,2));

	}
	// metodi:

	public  static int somma(int i, int j) {
		
		return i + j;
	}
	
	public  static int sottrazione(int i, int j) {
			
			return i - j;
	}

	public  static int moltiplicazione(int i, int j) {
		
		return i * j;
	}
	
	public  static int divisione(int i, int j) {
			
			return i / j;
	}
}
