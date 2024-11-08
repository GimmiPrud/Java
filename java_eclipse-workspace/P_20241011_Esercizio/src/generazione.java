
/*
 A partire dalla classe computer
generare 10 computer inserendo dei valori casuali nei campi interi e double
per ogni computer stampare (modifica della toString oppure tramite un metodo ad hoc) in un formato allineato e ben leggibile, possibilmente con una cornice esterna (sopra, sotto e a fianco del testo)
*/

import java.util.Random;

public class generazione {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); // per utilizzare i metodi della libreria
		
		for(int i = 0; i<10; i++) {
			Computer2 C = new Computer2(random.nextDouble(500,2000),random.nextDouble(2,7),
					random.nextDouble(10,20),random.nextDouble(2,5),random.nextDouble(2,3), "Asus", random.nextInt(2000,2024));
			System.out.print("-------------------------");
			System.out.println("\n"+ C); 
			
		}
		
	}

}
