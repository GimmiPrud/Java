
public class Abbigliamento extends Prodotto {

	
	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);

	}

	@Override
	public Double calculateDiscount() {
		if (getCategoria()=="Abbigliamento invernale") {
			Double	sco = getPrice()-(getPrice()*0.15);
			return sco;
		}else {
			return getPrice();
		}
		
	}

	@Override
	public String toString() {
		return "Abbigliamento [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCategoria()="
				+ getCategoria() + "]";
	}

}