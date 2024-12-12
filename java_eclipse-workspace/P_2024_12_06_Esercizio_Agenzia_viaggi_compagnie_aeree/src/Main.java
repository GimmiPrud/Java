import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Aereo, Volo> voli = new HashMap<Aereo, Volo>();
		
		Aereo a1 = new Aereo("12", 100);
		Aereo a2 = new Aereo("13", 150);
		
		Volo v1 = new Volo("Roma", "Milano", "10:00", "20:00");
		
		Compagnia_aerea c = new Compagnia_aerea();
		
		c.create_aereo(voli, a1, v1);
		System.out.println(voli);
		
		
		
	}
	
	
}
