

public class Char_string {
	
	public static int caratteri(char c, String f) {
		int count = 0;
		char ca[] = f.toCharArray();// creo un array di caratteri per semplificare l'iterazione
		for (char i: ca) { // ciclo ogni singolo carattere 
			if (i == c) {
				count +=1;
			}
		}
		return count;
		
	}
	
	public static boolean palindroma(String s) {
		 for (int i = 0, j = s.length() - 1; i < j; i++, j--) { // for con piu variabili (i e j)
	           if (s.charAt(i) != s.charAt(j)) { // se 
	               return false;
	           }
	       }
	       return true;
		
	}
	
	

}
