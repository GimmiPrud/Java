
public class Ghepardo extends Mammifero implements Must, Requirements, Comparable<Ghepardo> {
	
	private Double speed;
	
	

	public Ghepardo(Integer freq_resp, Integer freq_cardio, Double speed) {
		super(freq_resp, freq_cardio);
		this.speed = speed;
	}

	public Ghepardo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Ghepardo [speed=" + speed + ", toString()=" + super.toString() + ", getFreq_resp()=" + getFreq_resp()
				+ ", getFreq_cardio()=" + getFreq_cardio() + "]";
	}

	// estendendo la classe mammifero ha bisogno del metodo verso 
	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return "Roar" ;
	}

	// queste sono le implementazioni sulle interfacce 
	
	@Override
	public String get_class_name() {
		// TODO Auto-generated method stub
		return "Ghepardo";
	}

	@Override
	public String get_version() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String get_serial() {
		// TODO Auto-generated method stub
		return "AI48";
	}

//	@Override
//	public int compareTo(Ghepardo o) {
//		return speed.compareTo(o.speed);
		
//		return 
//		if (speed < o.speed) {
//			return -1;
//			
//		}else if (speed > o.speed) {
//			return 1;
//			
//		}else {
//			return 0;
//		}
		
//	}
	
	@Override
	public int compareTo(Ghepardo o) {
		Integer ret = speed.compareTo(o.speed);
		if (ret!=0) {
			return ret;
		}else {
			return getFreq_cardio().compareTo(o.getFreq_cardio());
			
		}
	}

}
