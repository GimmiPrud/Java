import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager implements Ordinabile{

	@Override
	public List<Prodotto> sortByPrice(List<Prodotto> Prodotto) {
		Collections.sort(Prodotto);
		return Prodotto;
	}
	
	public static void add_Prodotto(LinkedList<Prodotto> lp, Prodotto P) {
		lp.add(P);
	}
	
	
	public ProductManager() {
		super();
	}
	
}
