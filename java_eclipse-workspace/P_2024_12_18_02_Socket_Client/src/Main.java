import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		
		Socket_Client client = new Socket_Client();
		
		client.Run("localhost", 32456);
		
//		client.Run("www.microsoft.com", 80);

	}
}

