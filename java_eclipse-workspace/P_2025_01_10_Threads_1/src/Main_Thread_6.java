
public class Main_Thread_6 {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Thread_6());
		th1.run();
				
		Thread th2 = new Thread(new Thread_6());
		th2.run();
		
	}

}
