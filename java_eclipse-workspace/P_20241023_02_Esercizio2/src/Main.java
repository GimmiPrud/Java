
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array(vettore)(le dimensioni non possono essere modificate), si può accedere ad essi tramite posizione[]
		int [] vint;
		double [] vont;
		
		vint = new int[100];
		vont = new double[100];
		
		System.out.println(vint); // tutti gli oggetti obj hanno la funzione tostring 
		System.out.println(vont);
		
			// inserimento dei numeri da 1 a 100 sull'array vint:
			for(int i=0; i<100; i++) {
				vint[i] = i + 1;	
			}
			// inserimento numeri al contrario
			for(int i = 100; i > 0; i--) {
				vint[100 - i] = i;
				System.out.println(vint[i]); // metodo per stampare ogni elemento dell'array 
			}
			stampa_vint(vint);
			
			// inserire in vint i numeri pari (0=>2, 1=>4, 2=>6 ecc...)
			for(int i=0; i<100; i++){
				vint[i] = (i+1)*2;
			}
			for(int i=0; i<100; i++){
				vint[i-1] = i*2;
			}
			// inserire in vint i numeri dispari (0=>1, 1=>3, 2=>7 ecc...)
			for(int i=0; i<100; i++){
				vint[i] = (i+1)*2-1;
			}
			
			// inserire in vont la serie armonica (1, 1/2, 1/3, 1/4 ecc...)
			for(int i=0; i<100; i++){
				vont[i] = 1.0/(i+1);
				
			}
			for(int i=0; i<100; i++){
				vont[i-1] = 1.0/i;
				
			}
			
			// inserire in vint la seguente serie numerica (fibonacci)
			// es -> 1,1,2,3,5,8,13 ecc...
			// il valore attuale è la somma dei due precedenti
			vint[0] = 1;
			vint[1] = 1;
			for(int i=2; i<100 ; i++) {
				vint[i] = vint[i-1] + vint[i-2];
				
			}
			stampa_vint(vint);
			
			// inserire in vint i numeri primi in sequenza: 2,3,5,7,11,13,17 ecc...
			// Crivello di Eratostene
			/*
			 * Implementare il crivello di eratostene e stampare i primi 10000 numeri primi
			 */
			// Eratostene(10000);

			// Stampare il Fattoriale di un numero n
			System.out.println(Fattoriale(500));
			System.out.println(Fact(500));

			
			//Inserire nel vettore vdou la seguente serie geometrica
			// 1, 1/2, 1/(2*2), 1/(2*2*2), 1/(2*2*2*2), ...
			// 1/2^0, 1/2^1, 1/2^2, 1/2^3, 1/2^4, 1/2^5, ...
			for (int i=0; i<100; i++) {
				vont[i] = 1.0/Math.pow(2, i);
			}
			StampaVdou(vont);
			
			//La stessa cosa ma senza Math.pow
			for (int i=0; i<100; i++) {
				//Calcolo 2^i
				double dueAllaI=CalcolaDueAllaI(i);
				
				vont[i] = 1.0/dueAllaI;
			}
			StampaVdou(vont);
			
			//Ed ora? che facciamo?
		}
		
		
		public static double CalcolaDueAllaI(int i) {
			double ris=1.0;
			for (int k=1; k<=i; k++) {
				ris = ris*2.0;
			}
			return ris;
		}
		


		private static void StampaVdou(double[] vdou) {
			for (double v : vdou) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

		// Soluzione Iterativa
		private static int Fattoriale(int N) {
			int p = 1;
			for (int i = 2; i <= N; i++) {
				p = p * i;
			}
			return p;
		}

		// Soluzione ricorsiva
		public static int Fact(int N) {
			if (N == 0) {
				return 1;
			} else {
				return N * Fact(N - 1);
			}
		}

		private static void Eratostene(int N) {
			// Facciamo un miliardo poiché non so quanti
			// primi ci sono prima di un miliardo
			boolean[] v = new boolean[1000000000];
			for (int i = 2; i < v.length; i++) {
				v[i] = true;
			}
			// dato che la creazione di un vettore inizializza i suoi valori
			// al valore di default, tutti gli elementi di v sono stati messi a false
			// con il for abbiamo messo a true gli elementi da 2 in poi
			// 0 non è primo e anche 1 non lo consideriamo primo

			// Ora il ciclo per determinare i primi
			int numprimi = 0;
			for (int i = 2; i < v.length; i++) {
				if (v[i] == true) {
					System.out.println(i + " è il " + ++numprimi + "-esimo numero primo");

					// metto a false tutti i suoi multipli
					for (int k = i + i; k < v.length; k += i) {
						v[k] = false;
					}
				}
			}
		}

		private static void StampaVint(int[] vint) {
			for (int v : vint) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
			
		
		// altro metodo per stampare gli elementi delle collezioni(array,ecc..) utilizzando il ciclo for:
		private static void stampa_vint(int[] vint){
			for(int v: vint) {
				System.out.print(v + " ");
			}
			System.out.println();
			
			
	}

}
