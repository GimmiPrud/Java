
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ciclo in python
		 * for i in range(0,10):
		 *		print(i)
		 
		 * ciclo in java
		 * for(int i=0; i<10; i++){
		 *		System.out.println(i);
		 *}
		 * int i=0 -> variabile inizializzata
		 * i<10 -> condizione del ciclo
		 * i++ -> contatore  
		 */
		
//		for (;;) {
//			System.out.println("Ciao");
//		}
		// questo è un ciclo infinito 
		
//--------------------------------------------------//
		
		// Esericzio:
		
		/* Considerato che Math.random() genera un numero
		double casuale compreso tra 0 e 1, 1 escluso,
		stampare 10 numeri casuali, uno per riga.*/
		
		
		for(int i = 0; i<10; i++) {
			Double d;
			d = Math.random();
			System.out.print(d); 
 			System.out.print(" "); 
		}
		System.out.println();
		
		
		for(int i = 0; i<10; i++) {
			Double d = Math.random();
			System.out.println(((i<9)?" ":"") + (i+1) + ") " + d);
			// questa espressione si chiama operatore ternario:
			// sintassi = <espressione logica> ? <valore se True> : <valore se False>
		}
//-------------------------------------------------//
		
// println() stampa il risultato e va a capo, mentre print() stampa i risultati sulla stessa riga 
		// esiste anche printf() che si utilizza per la formattazione:
		/*
		 * System.out.printf è un metodo che vuolevcome parametri
		 * 1) una stringa di formato
		 * 2) un elenco di variabili i cui valori
		 *    saranno inseriti nella stringa risultante
		 *    in corrispondenza dei caratteri %<dgcs..> dove
		 *    d: intero
		 *    c: char
		 *    g: float
		 *    s: string
		 *    ...
		 *    Inoltre nella stringa di formato
		 *    \n => vai a capo a nuova riga
		 *    \r => vai a capo sulla riga corrente
		 *    \t => inserisci un tab
		 *    Tutto quello che non è %<...> oppure \.
		 *    viene riportato in stampa così com'è 
		 */
		int ni = 10;
		System.out.printf("Il numero è: %d\n", ni);
		
		int n2=44;
		System.out.printf("I numeri sono: %d, %d\n", ni, n2);
		
		System.out.printf("I numeri sono: (%d, %d)\n", ni, n2);
		
		/*
		 * Subito dopo il % e prima dei modificatori (d, f, g, s, b, ...)
		 * è possibile mettere un valore intero che indica la dimensione
		 * del campo
		 * se il valore è decimale allora posso scrivere
		 * <dimensioni totali>.<dimensioni dopo la virgola>
		 * esempio %7.3g => in totale 7 digit di cui 3 dopo la virgola
		 */
		
		System.out.printf("Numero libero: %07d\n", 987);
		System.out.printf("Numero libero: %07d\n", 1123987);
		
	}
	
}