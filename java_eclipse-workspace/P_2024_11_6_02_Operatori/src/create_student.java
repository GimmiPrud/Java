
import java.util.Scanner;

public class create_student {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Studente lista_s[] = new Studente[10]; // lunghezza dell'array 
		int n_s = 0; 
		
		while (true) {
			System.out.println("Cosa vuoi fare ?");
			int a = input.nextInt();
			switch (a) {
			case 1:{
				if (n_s<=lista_s.length) {
					System.out.println("inserisci nome dello studente:");
					String nome = input.next();
					System.out.println("inserisci età dello studente:");
					int età = input.nextInt();
					System.out.println("inserisci materia:");
					String materia = input.next();
					System.out.println("inserisci anno di frequenza :");
					int anno_frequenza = input.nextInt();
					
					lista_s[n_s] = new Studente(nome,età,materia,anno_frequenza);
					n_s ++;
				}
			}
			break;
			
			case 2:{
				System.out.println("lista studenti:");
				for(Studente studente:lista_s) {
					
					if(studente != null) {
						System.out.println(studente);
					}
					
				}
				break;
			}
			case 3:{
				System.out.println("Arrivederci");
				break;
				}
			
			}
		}
	}
}
