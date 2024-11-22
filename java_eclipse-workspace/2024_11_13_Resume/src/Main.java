
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	
	// final si utilizza per inizializzare una costante (che quindi non può più mutare)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// un dato strutturato è un dato che ha una sua struttura tipo le liste 
		
		// le liste si creano così:
		/* esistono le linkedlist e 
		 * le arraylist
		 */
		
		// linkedlist:  (è fatta per contenere una lista di classi)
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(7);
		li.add(5);
		li.add(9);
		li.add(2);
		
		li.addFirst(11);
		li.addLast(37);
		li.add(3, 99); // il primo numero è l'indice (posizione) mentre il secondo è il numero che verrà aggiunto a quell'indice
		li.add(li.size(), 3); // aggiunge l'elemento 3 alla fine della lista (come li.addLast()) o come append() in python)		
		System.out.println(li);
		
		
		Collections.max(li);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.shuffle(li); // shuffle() -> metodo che permette di oridnare gli elementi di una lista in maniera casuale ogni volta che si printa
		System.out.println(li);
		
		
		// instanziamento della classe (creazione nuovo oggetto della classe ghepardo)
		Ghepardo g1 = new Ghepardo(15,60,90.0);
		Ghepardo g2 = new Ghepardo(13,66,80.0);
		Ghepardo g3 = new Ghepardo(16,50,100.0);
		Ghepardo g4 = new Ghepardo(14,55,85.0);
		
		LinkedList<Ghepardo> gg = new LinkedList<Ghepardo>();
		
		gg.add(g1);
		gg.add(g2);
		gg.add(g3);
		gg.add(g4);
		
		System.out.println(gg);
		
		// per printare ogni singolo oggetto di una lista per riga 
		for (Ghepardo g :gg) {
			System.out.println(g);
		}
		
		// mettendo var davanti si prendono automaticamente tutti gli elementi della lista 
		// per fare questa cosa la lista deve contenere tutti elementi dello stesso tipo 
		for (var g:gg) {
			System.out.println(g);
		}
		
		
		// metodo del comparator per confrontare 2 elementi 
		// creo un metodo per comparare 2 oggetti 
		Collections.sort(gg);
		gg.sort(new Comparator<Ghepardo>() {
			public int compare(Ghepardo o1, Ghepardo o2) {
				return g1.getSpeed().compareTo(g2.getSpeed());
			}
		});
		System.out.println();
		
		
		LinkedList<Elefante> e1 = new LinkedList<Elefante>();
		
		e1.add(new Elefante(5, 10, 4500.0));
		e1.add(new Elefante(10, 11, 4550.0));
		e1.add(new Elefante(6, 8, 4900.0));
		
		System.out.println(e1);
		
		for (var e:e1) {
			System.out.println(e);
		}
		System.out.println();
		
		
		LinkedList<Mammifero> Mam = new LinkedList<Mammifero>();
		
		// addAll() permette di aggiungere alla lista tutti gli elementi all'interno di un altra lista 
		Mam.addAll(e1);
		Mam.addAll(gg);
		
		for (var i:Mam) {
			System.out.println(i);
		}
		System.out.println();
		// siamo riusciti a creare una lista elefanti e ghepardi perche sono accumunati dalla superclasse mammifero
	
		// esiste la superclasse object, e questo permette di creare anche liste con all'interno oggetti differenti
		
	//---------------------------------------------------------------------------------------------------------------\\
	
	// mergesort (list)
		
		// Procedura merge, usiamo due liste di interi già ordinate
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(3);
        l1.add(8);
        l1.add(11);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(9);
        l2.add(12);
        l2.add(15);
        LinkedList<Integer> lsorted = MergeLists(l1, l2);
        
     
	}
	
	private static LinkedList<Integer> MergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        //Prima cosa: impariamo a usare gli iteratori!!!
        
        //Usando un iteratore, stampare una lista
        Iterator<Integer> it1 = l1.iterator();
        while (it1.hasNext()) {
            Integer num = it1.next();
            System.out.println(num);
        }
        return null;
    }

}
