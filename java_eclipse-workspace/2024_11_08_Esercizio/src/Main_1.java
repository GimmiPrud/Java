import java.util.Collections; // metodi di manipolazione di oggetti sulle liste 
import java.util.LinkedList; // liste 

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//come creare un lista e i suoi metordi (add())
		LinkedList<Studente> lstud = new LinkedList<Studente>();
		lstud.add(new Studente("Gianni", 40, "Agraria", 5));
		lstud.add(new Studente("Luca", 30, "medicina", 4));
		lstud.add(new Studente("Ania", 20, "chimica", 1));
		
		System.out.println(lstud);
		System.out.println("studenti creati finora:" + lstud.getFirst().studenti_creati);
		// getFirst() è un metodo che ritorna il primo elemento della lista 
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(1);
		System.out.println(li);
		
		Collections.sort(li); // si utilizza per ordinare gli elementi in maniera crescente della lista 	
		System.out.println(li);
		
		Collections.reverse(li); // si utilizza per ordinare gli elementi in maniera decrescente della lista 
		System.out.println(li);
		
		System.out.println(Collections.max(li)); // elemento maggiore della lista
		System.out.println(Collections.min(li)); // elemento minore della lista
		
		
		Collections.sort(lstud);
		System.out.println(lstud);
		
		
//----------------------------------------------------------------------------//
		
	
		if (false) {
		//Persona p1 = (Persona)Parse_class.Parse("Persona");
		//Persona p1 = (Persona)Parse_class.Parse(Persona.class);
		
		Studente s1 = (Studente)Parse_class.Parse(Studente.class);
		System.out.println(s1);
		
		String s;
		Paziente[] pazienti = new Paziente[4]; // creazione array staticamente definito
		pazienti[0] = new Paziente("marco", 100, "tutto", true);
		
		Studente[] studenti = new Studente[4];
		studenti[0] = new Studente("alessio", 20,"ingegneria", 1);
		
		
		Persona[] persone = new Persona[8];
		
		persone[0] = studenti[0];
		persone[1] = pazienti[0];
		System.out.println(persone[0]);
		System.out.println(persone[1]);
		
		
		// creazione dell'oggetto dalla classe astratta(con metodi astratti)
		essere_vivente ev = new essere_vivente() {
			
			@Override
			public void set_colore_occhi(String s) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void get_colore_occhi(String s) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

	}
		

}
