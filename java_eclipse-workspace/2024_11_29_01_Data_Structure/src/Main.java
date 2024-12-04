import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// le collezioni:
		// Set, Map, list, Queue, Stack, Array... 
		
		// Set:
		HashSet<Prova> hsp = new HashSet<Prova>(); // più veloce, lavora sugli array(vettori)
		TreeSet<Prova> tsp = new TreeSet<Prova>(); // è naturalmente ordinato
		
		// Mappe:
		HashMap<Prova, Integer> hmp = new HashMap<Prova, Integer>(); // ha il metodo add
		TreeMap<Prova, Integer> tmp = new TreeMap<Prova, Integer>();
		
		for (int i=0; i<100; i++) {
			hsp.add(new Prova(i));
			tsp.add(new Prova(i));
		}
		
		//Per cercare un elemento in un Set, mi serve l'elemento stesso, oppure?
		System.out.println(hsp.contains(new Prova(10)));
		 //non lo trova poiché contains cerca ESATTAMENTE l'oggetto che sto cercando
		
		//Quindi
		Prova unaProva = new Prova(987);
		hsp.add(unaProva);
		System.out.println(hsp.contains(unaProva));
		
		hsp.clear();
		hsp.add(new Prova(1));
		System.out.println(hsp);
		hsp.add(new Prova(2));
		System.out.println(hsp);
		hsp.add(new Prova(3));
		System.out.println(hsp);
		hsp.add(new Prova(4));
		System.out.println(hsp);
		hsp.add(new Prova(5));
		System.out.println(hsp);
		hsp.add(new Prova(6));
		System.out.println(hsp);
		
		var it = hsp.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		tsp.add(new Prova(987));
		System.out.println(tsp.contains(new Prova(987)));
		hsp.add(new Prova(988));
		System.out.println(hsp.contains(new Prova(988)));
		
		
		//Ora hashmap
		for (int i=0; i<100; i++) {
			hmp.put(new Prova(i), i);
			tmp.put(new Prova(i), i);
		}
		
		System.out.println(hmp.get(new Prova(10)));
		System.out.println(tmp.get(new Prova(10)));

		/*Conclusioni
		 * HashSet e HashMap usano sulle chiavi due metodi: equals e hashCode
		 * che consentono di verificare se due oggetti contengono gli stessi valori
		 * Senza di essi due oggetti creati con due new, anche se con stesso contenuto, 
		 * diventano differenti  
		 */
		
		Queue<String> qs = new LinkedList<String>();
		qs.add("uno"); //aggiungne in coda
		qs.add("due");
		qs.add("tre");
		
		var item = qs.poll(); //toglie il primo elemento della coda
		System.out.println(qs);
		
		
		Stack<String> ss = new Stack<String>();
		ss.push("uno");
		ss.push("due");
		ss.push("tre");
		ss.push("quattro");
		
		System.out.println(ss.pop());
		System.out.println(ss);
		
		Vector<String> vs = new Vector<String>();
	}
	
}

class Prova implements Comparable<Prova>{
	public String uno;
	public Integer due;
	public Prova(int n) {
		uno ="UNO";
		due = n;
	}
	public String toString() {
		return ""+due;
	}
	@Override
	public int compareTo(Prova o) {
		return due-o.due;
		
	}
}






