
public class Thread_3 implements Runnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Thread_3());
		t1.start();
		
		Thread t2 = new Thread(new Thread_3());
		t2.start();
	}

	@Override
	public void run() {
		Integer c = 0;
		while (c <= 5) {
			 System.out.println("Sono stato avviato");
			 c++;
		}
		
	}

}
