import java.lang.reflect.Method;

public class Esempio3Reflection {
	public static void main(String[] args) {
        try {
            String str = "Hello, world!";
            Method metodo = String.class.getMethod("toUpperCase");
            String risultato = (String) metodo.invoke(str);
            System.out.println("Risultato: " + risultato);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
