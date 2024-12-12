import java.util.concurrent.locks.ReentrantLock;

public class Gen_ID extends Thread {
	
	private static ReentrantLock lock = new ReentrantLock();
	static long ID = 0;
	
	public static synchronized void increase() {
		lock.lock();
		System.out.println(ID);
		// simulare un minimo di tempo di calcolo
		try {
			Thread.sleep(71);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ID = ID + 1; 
		
	}
	
	public void run() {
		for (int i=0; i<100; i++) {
			lock.lock();
		System.out.println(ID);
		// simulare un minimo di tempo di calcolo
		try {
			Thread.sleep(71);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ID = ID + 1; 
		lock.unlock();
		
			try {
				Thread.sleep(97);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	
}
