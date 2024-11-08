import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in); // bidogna sempre creare lo scanner prima di utilizzarlo
		// lo scanner si utilizza per creare un input 
		
		String s1 = read.nextLine(); 
		int i1 = read.nextInt();
		String s2 = read.nextLine();
		// differenza tra next e nextline o nextint:
		// ilmetodo next() legge i token 
		String s3 = read.nextLine(); 
		int i2 = read.nextInt();
		String s4 = read.nextLine();
		
		System.out.printf("<%s>, <%d>, <%s>\n", s1, i1, s2);
		System.out.printf("<%s>, <%d>, <%s>\n", s3, i2, s4);
		
		while(true){
			s1 = read.next();
			System.out.println(s1);
			
		}
		
	}

}
