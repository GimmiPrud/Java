
public class Main_Thread_5 {

	public static void main(String[] args) {
		
	 ThreadConta T1 = new ThreadConta('A');
        ThreadConta T2 = new ThreadConta('B');
        T1.start();
        T2.start();

	}

}
