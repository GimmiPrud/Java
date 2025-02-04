
public class Esempio1Reflection {
	public static void main(String[] args) {

		try {
			Class a = Class.forName("Cane");
			System.out.println("Nome della classe : " + a.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Cane c1 = new Cane();
		Class b = c1.getClass();
		System.out.println("Nome della classe creata: " + b.getName());
	}

}
