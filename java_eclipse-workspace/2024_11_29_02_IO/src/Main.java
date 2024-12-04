
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US); // per modificare il formato in base alla zona geografica

		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
		System.out.println();
		
//		
//		var fou = Util.OpenFileForWriting("wifi.dat");
//		for (var x: lwifi) {
//			String a = String.format("%s,%s,%s,%f\n", 
//					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
//			fou.write(a);
//			
//		}
//		fou.close();
//		
//		lwifi.clear(); 
//		
//		var fin = Util.OpenFileForReading("wifi.dat");
//		String riga = fin.readLine();
//		while (riga != null) {
//			
//			String[] items = riga.split(",");
//			
//			WiFi it = new WiFi(items[0], items[1], items[2], Double.parseDouble(items[3]));
//			lwifi.add(it);
//			System.out.println(riga);	
//			
//			riga = fin.readLine();
//			
//		}
//		fin.close();
		
		// creazione oggetto wifi
		WiFi  appo = WiFi.MakeWifi();
		
		// Dichiaro la stringa che conterrà la descrizione in formato JSON
		String jsonString;
		ObjectMapper ObjectMapper = new ObjectMapper();
		jsonString = ObjectMapper.writeValueAsString(appo);
		
		System.out.println(jsonString);
		
		// ritrasformiamo il JSON 
		WiFi nuovo = ObjectMapper.readValue(jsonString, WiFi.class);
		System.out.println(nuovo);
		
	}
	
}
