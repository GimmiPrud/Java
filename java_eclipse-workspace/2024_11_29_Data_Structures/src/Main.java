import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		// Set, Map, Queue, Stack, Arrays, List
		 
		
		/*Calcolare il tempo che ci vuole per inserire 1000000 dinumeri interi 
		 * sequenziali in testa a una Linkedlist 
		 */
		
		//calcolare il tempo che ci vuole 
				//per inserire 1000000 di numeri interi
				//sequenziali in testa a una LinkedList
		
				final Integer N=10000000;
				long inizio, fine;
				
				//test LinkedList
				inizio = System.nanoTime();
				AddToLinkedList(N);
				fine = System.nanoTime();
				System.out.println("LinkedList: per inserire " + 
						N + " elementi in coda:" + (fine-inizio)/1000000000.0 + " sec.");
				
				inizio = System.nanoTime();
				AddFirstLinkedList(N);
				fine = System.nanoTime();
				System.out.println("LinkedList: per inserire " + 
						N + " elementi in testa: " + (fine-inizio)/1000000000.0 + " sec.");
				
				//test ArrayList
				inizio = System.nanoTime();
				AddToArrayList(N);
				fine = System.nanoTime();
				System.out.println("ArrayList: per inserire " + 
						N + " elementi in coda:" + (fine-inizio)/1000000000.0 + " sec.");
				
//				inizio = System.nanoTime();
//				AddFirstArrayList(N);
//				fine = System.nanoTime();
//				System.out.println("ArrayList: per inserire " + 
//						N + " elementi in testa: " + (fine-inizio)/1000000000.0 + " sec.");

				//test Nostra LinkedList
				inizio = System.nanoTime();
				AddFirst(N);
				fine = System.nanoTime();
				System.out.println("NOstra: per inserire " + 
						N + " elementi in testa:" + (fine-inizio)/1000000000.0 + " sec.");
				
				inizio = System.nanoTime();
				AddLast(N);
				fine = System.nanoTime();
				System.out.println("Nostra: per inserire " + 
						N + " elementi in coda: " + (fine-inizio)/1000000000.0 + " sec.");
				
			}

			private static LinkedList<Integer> AddToLinkedList(Integer n) {
				LinkedList<Integer> lli = new LinkedList<Integer>();
				while (n > 0) {
					lli.add(n--);
				}
				return lli;
			}
			private static ArrayList<Integer> AddToArrayList(Integer n) {
				ArrayList<Integer> lli = new ArrayList<Integer>();
				while (n > 0) {
					lli.add(n--);
				}
				return lli;
			}
			private static LinkedList<Integer> AddFirstLinkedList(Integer n) {
				LinkedList<Integer> lli = new LinkedList<Integer>();
				while (n > 0) {
					lli.addFirst(n--);
				}
				return lli;
			}
			private static ArrayList<Integer> AddFirstArrayList(Integer n) {
				ArrayList<Integer> lli = new ArrayList<Integer>();
				while (n > 0) {
					lli.addFirst(n--);
				}
				return lli;
			}
			
			private static Nostra_LL<Integer> AddLast(Integer n) {
				Nostra_LL<Integer> lli=new Nostra_LL<Integer>();
				while (n > 0) {
					lli.addLast(n--);
				}
				return lli;		
			}
			private static Nostra_LL<Integer> AddFirst(Integer n) {
				Nostra_LL<Integer> lli=new Nostra_LL<Integer>();
				while (n > 0) {
					lli.addFirst(n--);
				}
				return lli;		
			}

		}