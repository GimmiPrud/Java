
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// classi wrapper nascondono i tipi primitivi di java
				/* Es:
				 * int(tipo primitivo) --> Integer(wrapper)
				 * double(tipo primitivo) --> Double(wrapper)
				 * ...
				 */
				// i wrapper racchiudono i metodi 
		
		Computer com1 = new Computer();
		com1.setAltezza(1.5);
		com1.setAnnoProduzione(2023);
		com1.setLarghezza(35.0);
		com1.setPeso(4.5);
		com1.setPrezzo(4500);
		com1.setProduttore("archer");
		com1.setProfondita(25.0);
		
		Computer2 com2 = new Computer2(9875., 7.2, 60., 5., 40., "IBM", 1990);
		
		System.out.println(com2);
		
		Integer.parseInt("1923");
		
		// due oggetti sono identici se stanno sulla stessa zona di memoria 
		System.out.println("ciao"=="ciao");
		// True
		String s1 = "ciao";
		String s2 = "";
		s2+="c";
		s2+="i";
		s2+="a";
		s2+="o";
		System.out.println(s1 == s2);
		// False
		
		// tutti gli oggetti sono figli della classe object (obj) che ha dei metodi deifniti 
		
	}

}
