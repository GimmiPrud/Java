import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rng = new Random(); // creazione oggetto random (variabile)
		
		for (int i=0; i<20; i++) {
		Integer num = Dividi(rng.nextInt(10), rng.nextInt(10));
		System.out.println(num);
		
		}
		
	}
	
	// Try, Catch, Finally
	// creazione metodo della funzione 
	private static Integer Dividi(int i, int j) {
		try { // creazione condizione 
		Integer q = i/j; // tra i numeri interi la divisione per 0 non è contemplata
		System.out.println("OK");
		return q;	
		
		}catch (Exception ex) { // crea l'eccezione (si possono avere multiple catch)
			// ex.printStackTrace(); // stampa l'eccezione
			System.out.println("KO");
			return null;
			
		}finally { // esegue in qualsiasi caso (sempre eseguito)
			System.out.println("EH EH EH");
		}
		
	}

}
