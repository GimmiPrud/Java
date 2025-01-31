
public class Main  {
	
	public static void main(String[] args) throws Exception {
		Cliente c1 = new Cliente("Marisa", 30);
		Cliente c2 = new Cliente("Sergio", 60);
		// Avvio i Threads
		c1.start();
		c2.start();
		// Attendo il completamento del thread 
		c1.join();
		c2.join();
		
	}
}

