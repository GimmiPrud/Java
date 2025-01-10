
public class Thread_2 implements Runnable {

	public static void main(String[] args) {
		
		Thread t2 = new Thread(new Thread_2());
		t2.start();
		
	}

	@Override
	public void run() {
		
		System.out.println("Sono un Thread runnable");
		
	}

}
