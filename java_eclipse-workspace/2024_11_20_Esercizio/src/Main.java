import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creiamo la classe che contiene due numeri integer (coppia int)
		
		Coppia<Integer, Double> c1 = new Coppia<Integer,Double>(1, 2.0);
		Coppia<Integer, Double> c2 = new Coppia<Integer,Double>(111, 112.0);
		
		/*implementazione metodo che cambia tra loro i contenuti di
		 * due coppie di dati utilizzando il metodo swapcoppia().
		 */
		
		System.out.println(c1);
		System.out.println(c2);
		
		Swapcoppia(c1, c2); // si può autocostruire il metodo 
		
		System.out.println (c1 + ", " + c2);
		
	//--------------------------------------------------------------------\\
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addAll(Arrays.asList(new Integer []{3,4,6,2,7,8}));
		System.out.println(l1);
		// ora scambiamo 2 numeri con un metodo swap (dalla posizione 3 alla posizione 5)
		swap(l1,3,5);
		System.out.println(l1);
		
	}
	
	private static void swap(LinkedList<Integer> l1, int n1, int n2) {
		
	}
	

	private static <T1, T2> void Swapcoppia(Coppia<T1, T2> c1, Coppia<T1, T2> c2) {
		
		Coppia<T1, T2> appo = new Coppia<T1, T2>(c1.getN1(), c1.getN2());
		
		c1.setN1(c2.getN1());
		c1.setN2(c2.getN2());
		
		c2.setN1(appo.getN1());
		c2.setN2(appo.getN2());
		
		
	}

}