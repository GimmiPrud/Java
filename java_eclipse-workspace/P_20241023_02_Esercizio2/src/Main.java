
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
			
			
		}
		
		// altro metodo per stampare gli elementi delle collezioni(array,ecc..) utilizzando il ciclo for:
		private static void stampa_vint(int[] vint){
			for(int v: vint) {
				System.out.print(v + " ");
			}
			System.out.println();
			
			
	}

}
