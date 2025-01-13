
public class Thread_4_1 extends Thread{
	
	public void run() {
		try {
			for (int i = 0;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
