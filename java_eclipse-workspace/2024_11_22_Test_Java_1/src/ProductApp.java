import java.util.Collections;
import java.util.LinkedList;

public class ProductApp {

	public static void main(String[] args) {
		
		LinkedList<Prodotto> Prodotti = new LinkedList<Prodotto>();
		
		Prodotti.add(new Elettronica("Play Station 5", 450.0, "Svago"));
		Prodotti.add(new Elettronica("Xbox", 400.0, "Svago"));
		Prodotti.add(new Elettronica("Tv Oled", 700.0, "Svago"));
		Prodotti.add(new Elettronica("Hp Zbook", 1000.0, "Svago"));
		Prodotti.add(new Abbigliamento("Maglione", 30.0, "Abbigliamento invernale"));
		Prodotti.add(new Abbigliamento("T-shirt", 20.0, "Abbigliamento estivo"));
		Prodotti.add(new Abbigliamento("Felpa", 60.0, "Abbigliamento invernale"));
		
		
		
		for (Prodotto P:Prodotti) {
		System.out.println(P);
		System.out.println("Prezzo con sconto: " + P.calculateDiscount());
		}
		
		Prodotto p1 = new Abbigliamento("Jeans", 50.0, "Abbigliamento");
		ProductManager.add_Prodotto(Prodotti, p1);
		
		ProductManager Pr = new ProductManager();
		Pr.sortByPrice(Prodotti);
		
		System.out.println();
		
		for (Prodotto P:Prodotti) {
			System.out.println(P);
			System.out.println("Prezzo con sconto: " + P.calculateDiscount());
			
		}
		
	}
	

}
