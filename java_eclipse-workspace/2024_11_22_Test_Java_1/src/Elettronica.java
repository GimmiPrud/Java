
public class Elettronica extends Prodotto {

	
	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	
	@Override
	public Double calculateDiscount() {
		if (getPrice() > 500) {
			Double	sco = getPrice()-(getPrice()*0.10);
			return sco;
		}else {
			return getPrice();
		}
		
	}

	@Override
	public String toString() {
		return "Elettronica [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCategoria()="
				+ getCategoria() + "]";
	}
		
}