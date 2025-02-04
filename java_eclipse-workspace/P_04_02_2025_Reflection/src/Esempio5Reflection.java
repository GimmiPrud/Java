
public class Esempio5Reflection {
	public static void main(String[] args) {
        try {
            Class data = Class.forName("java.util.Date");
            
            Object oggetto = data.getDeclaredConstructor().newInstance();
            
            System.out.println("Nome Classe creata: " + data.getName());
            System.out.println("Oggetto creato: " + oggetto.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
