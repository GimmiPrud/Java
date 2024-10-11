
public class Mutaforma {
	
	/*public = metodi che possono essere chiamati da altri metodi di classi esterne
	 *Private = metodi che non possono essere chiamati da altri metodi esterni e si limitano alle funzioni della classe in cui si trovano   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*i metodi static void si utilizzano per funzioni che 
		 * non ritornano nessun valore */
		
		int a = somma(10, 20);
		System.out.println(a);
		
		double b = somma(10.1, 20.0);
		
		String s = somma("buona", "sera");
		
		System.out.println("ciao");
		System.out.println(1);
		System.out.println(2.5);
	}	
	
	// i metodi senza void si utilizzano perche ritornano un valore
	private static String somma(String s1, String s2, String s3) {
		return s1+s2+s3;
	}
	
	private static double somma(double d, double e) {
		return d+e;
	}
	
	private static int somma(int i, int j) {
		return i+j;
	}
	
}
