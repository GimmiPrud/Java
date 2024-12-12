import java.util.HashMap;

public class Compagnia_aerea {
	
//	HashMap<Aereo, Volo> voli = new HashMap<Aereo, Volo>();
	
	
	public static String Prenotazione_volo() {
		return null;
		
	}
	
	public static String cancellazione_volo() {
		return null;
	}	
	
	
	public static void create_aereo( HashMap<Aereo, Volo> l, Aereo a, Volo b ) {
			if (l.containsKey(a)== false) {
				l.put(a,b);	
		}
		
	}
	
	public static void delete_aereo(HashMap<Aereo, Volo> l, Aereo a, Volo b) {
		if (l.containsKey(a)== true) {
			l.remove(a,b);
		}
		
	}
		
}

