import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Motociclo> m1 = new LinkedList<Motociclo>();
		
		m1.add(new Motociclo(2, "benzina", 350, 30.5));
		m1.add(new Motociclo(2, "benzina", 250, 40.5));
		m1.add(new Motociclo(2, "benzina", 300, 50.0));
		m1.add(new Motociclo(2, "benzina", 350, 40.0));
		m1.add(new Motociclo(2, "benzina", 200, 50.0));
		m1.add(new Motociclo(2, "benzina", 125, 30.0));
		m1.add(new Motociclo(2, "benzina", 100, 30.5));
		m1.add(new Motociclo(2, "benzina", 600, 30.5));
		m1.add(new Motociclo(2, "benzina", 900, 30.5));
		m1.add(new Motociclo(2, "benzina", 350, 30.5));
		
		Collections.sort(m1);
		for(Motociclo m : m1) {
			System.out.println(m);
		}
		
		
	System.out.printf("\n\n");
		
		
		LinkedList<Autovettura> a1 = new LinkedList<Autovettura>();
		
		a1.add(new Autovettura(4, "benzina", 200, 20.0));
		a1.add(new Autovettura(4, "diesel", 300, 50.0));
		a1.add(new Autovettura(4, "benzina", 350, 40.0));
		a1.add(new Autovettura(4, "gpl", 200, 50.0));
		a1.add(new Autovettura(4, "benzina", 125, 30.0));
		a1.add(new Autovettura(4, "benzina", 100, 30.5));
		a1.add(new Autovettura(4, "gpl", 600, 30.5));
		a1.add(new Autovettura(4, "diesel", 900, 30.5));
		a1.add(new Autovettura(4, "benzina", 350, 30.5));
		a1.add(new Autovettura(4, "gpl", 600, 30.5));
		
		Collections.sort(a1);
		for(Automezzo a : a1) {
			System.out.println(a);
		}
		
	LinkedList<Automezzo> au = new LinkedList<Automezzo>();
			
			// addAll() permette di aggiungere alla lista tutti gli elementi all'interno di un altra lista 
			au.addAll(m1);
			au.addAll(a1);
			
			for (var i:au) {
				System.out.println(i);
			}
			System.out.println();
		


		
		
		
		
	}

}