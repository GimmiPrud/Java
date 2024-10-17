// Creazione classi e costruttori in java (getter and setter)
public class Computer {
	
	static int n_computer = 0;
   
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondita;
	private String produttore;
	private int annoProduzione;
		
	// costruttore senza parametri 
	public Computer() {
	}
	
	// costruttore con parametri 
	public Computer(double prezzo, double peso, double larghezza, double altezza, double profondita,
			String produttore, int annoProduzione) 
	{	
		
		this.setPrezzo(prezzo);
		this.setPeso(peso);
		this.setLarghezza(larghezza);
		this.setAltezza(altezza);
		this.setProfondita(profondita);
		this.setProduttore(produttore);
		this.setAnnoProduzione(annoProduzione);
		
		n_computer ++;
	}
	
	public static int comp() {
		System.out.println("computer a disposizione:");
		return n_computer;
		
	}
	
   public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   
	   // creazione degli oggetti di tipo computer 
	   Computer computer1 = new Computer(999.99, 1.4, 37.8, 23.7, 67.9, "HP", 2023);
	   System.out.println("prezzo: "+ computer1.getPrezzo());
	   System.out.println("Peso: "+ computer1.getPeso());
	   System.out.println("anno di produzione: "+ computer1.getAnnoProduzione());
	   System.out.println("Produttore: "+ computer1.getProduttore());
	   
	   Computer computer2 = new Computer(856.50, 1.35, 36.5, 24, 6.5, "Asus",2022);
	   System.out.println("prezzo: "+ computer2.getPrezzo());
	   System.out.println("Peso: "+ computer2.getPeso());
	   System.out.println("anno di produzione: "+ computer2.getAnnoProduzione());
	   System.out.println("Produttore: "+ computer2.getProduttore());
	   
	   System.out.println(comp());
	   
   }
   
   // getter and setter 
   public double getPrezzo() {
	   return prezzo;
   }

   public void setPrezzo(double prezzo) {
	   this.prezzo = prezzo;
   }

   public double getPeso() {
	   return peso;
   }

   public void setPeso(double peso) {
	   this.peso = peso;
   }

   public double getLarghezza() {
	   return larghezza;
   }

   public void setLarghezza(double larghezza) {
	   this.larghezza = larghezza;
	  
   }

   public double getAltezza() {
	   return altezza;
   }

   public void setAltezza(double altezza) {
	   this.altezza = altezza;
   }

   public double getProfondita() {
	   return profondita;
   }

   public void setProfondita(double profondita) {
	   this.profondita = profondita;
   }

   public String getProduttore() {
	   return produttore;
   }

   public void setProduttore(String produttore) {
	   this.produttore = produttore;
   }

   public int getAnnoProduzione() {
	   return annoProduzione;
   }

   public void setAnnoProduzione(int annoProduzione) {
	   this.annoProduzione = annoProduzione;
   }

   
}