
public class Volo {
	
	private String areaoporto_partenza;
	private String areaoporto_arrivo;
	private String decollo;
	private String atterraggio;
	
	

	public Volo() {
		super();
	}

	public Volo(String areaoporto_partenza, String areaoporto_arrivo, String decollo, String atterraggio) {
		super();
		this.areaoporto_partenza = areaoporto_partenza;
		this.areaoporto_arrivo = areaoporto_arrivo;
		this.decollo = decollo;
		this.atterraggio = atterraggio;
	}

	
	public String getAreaoporto_partenza() {
		return areaoporto_partenza;
	}

	public void setAreaoporto_partenza(String areaoporto_partenza) {
		this.areaoporto_partenza = areaoporto_partenza;
	}

	public String getAreaoporto_arrivo() {
		return areaoporto_arrivo;
	}

	public void setAreaoporto_arrivo(String areaoporto_arrivo) {
		this.areaoporto_arrivo = areaoporto_arrivo;
	}

	public String getDecollo() {
		return decollo;
	}

	public void setDecollo(String decollo) {
		this.decollo = decollo;
	}

	public String getAtterraggio() {
		return atterraggio;
	}

	public void setAtterraggio(String atterraggio) {
		this.atterraggio = atterraggio;
	}

	@Override
	public String toString() {
		return "Volo [areaoporto_partenza=" + areaoporto_partenza + ", areaoporto_arrivo=" + areaoporto_arrivo
				+ ", decollo=" + decollo + ", atterraggio=" + atterraggio + "]";
	}
	
	
	
	
	
	
	
}
