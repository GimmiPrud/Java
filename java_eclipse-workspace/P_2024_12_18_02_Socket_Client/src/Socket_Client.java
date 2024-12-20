
// Simple Java Socket Client
import java.io.*;
import java.net.*;

import javax.sound.sampled.Port;

public class Socket_Client {
	
	public void Run(String hostname, int port) {

        try (Socket socket = new Socket(hostname, port);
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true);
             InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            System.out.println("Connected to the server");

            // Sending messages to the server
//            String tobesent = String.format( "GET /HTTP/1.1\r\n" + "Host:" + hostname 
//        			+ "\r\n" + "User-Agent: curl/8.9.1\r\n" + "Accept: */*\r\n\r\n");
            writer.println("Hello Server");
            String response = reader.readLine();
            System.out.println(response);

            writer.println("bye");
            response = reader.readLine();
            System.out.println(response);

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
