
public class Motociclo extends Automezzo implements Comparable<Motociclo> {
	
	private Integer cilindrata;
	private Double consumo;
	
	
	
	public Motociclo(Integer numero_ruote, String carburante, Integer cilindrata, Double consumo) {
		super(numero_ruote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}
	
	public Integer getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public Double getConsumo() {
		return consumo;
	}
	
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		return "Motociclo [cilindrata=" + cilindrata + ", consumo=" + consumo + ", getNumero_ruote()="
				+ getNumero_ruote() + ", getCarburante()=" + getCarburante() + ", toString()=" + super.toString() +
				 ", get_max_speed()=" + get_max_speed() + "]";
	}
	
	@Override
	public Integer get_max_speed() {
		// TODO Auto-generated method stub
		return 200;
	}


	@Override
	public int compareTo(Motociclo o) {
		if (get_max_speed().compareTo(o.get_max_speed()) != 0) {
			return get_max_speed().compareTo(o.get_max_speed());
			
		}else {
			return getConsumo().compareTo(o.getConsumo());
		}
		
		
	}


	
	
	
	
	
	
	
	


}