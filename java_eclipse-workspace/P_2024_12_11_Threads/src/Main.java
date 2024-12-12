
public class Main {

	public static void main(String[] args) {
		
		/*
         * Supponiamo di avere un DB con una tabella (Unique) 
         * che contiene un solo record di un solo 
         * attributo (ID) numerico.
         * Quello che dovete fare è una procedura che
         * 1) accede alla tabella per leggere ID
         * 2) incrementare ID di 1
         * 3) aggiornare la tabella
         * 4) stampare l'ID
         * NB: dovete assicurarvi che anche in caso di 
         * accessi multipli al DB, i numeri stampati siano 
         * sempre unici, senza cioè duplicazioni
         * 
         * begin transaction  --> gestione coda degli accessi
         * sintassi classica:
			row = select ID from unique;
			print(row);
			row = row+1;
			update unique set ID=$row;
			commit
			se qualcosa va male:
			rollback
         */
//-------------------------------------------------------------\\
		
		// java come semantica aspetta che tutti i threads vengano terminati 
		
//		MyThread th1 = new MyThread(1000);
//		th1.start();
//		th1.run(); --> programma sequenziale 
		
//		MyThread th2 = new MyThread(1000);
//		th2.start();
//		th2.run(); --> programma sequenziale 
		
//		System.exit(0);
		
		Gen_ID id1 = new Gen_ID();
		id1.start();
		
		Gen_ID id2 = new Gen_ID();
		id2.start();
		
		Gen_ID id3 = new Gen_ID();
		id3.start();
		
		Gen_ID id4 = new Gen_ID();
		id4.start();
		
	}

}
