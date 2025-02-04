import java.lang.reflect.Method;

public class Esempio2Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("Calcolatrice");
		
		Method [] metodi = c.getDeclaredMethods();
		
		System.out.println("Metodi della classe " + c.getName());
		for(Method metodo : metodi) {
			System.out.println("Metodo = " + metodo.getName());
		}
		
	}

}
