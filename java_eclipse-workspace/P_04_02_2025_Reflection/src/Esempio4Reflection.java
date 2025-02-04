import java.lang.reflect.Field;

public class Esempio4Reflection {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Persona p =new Persona();
		Field campoNome = Persona.class.getDeclaredField("nome");
		campoNome.setAccessible(true);
		System.out.println("Valore campo nome =" + campoNome.get(p));
		
		campoNome.set(p, "Luigi");
		System.out.println("Valore campo nome modificato = " + campoNome.get(p));
		
	}
}
