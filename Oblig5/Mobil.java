import java.util.*;					//Oppgave A 
public class Mobil {
	private String navnEier;
	private String mobilmerke;
	private int tlf;
	public Mobil(String nyMerke) {
		this.mobilmerke =  nyMerke;
	}	
	public String getMerke() {
		return mobilmerke;
	}	
	public void setMerke(String merke) {
		this.mobilmerke = merke;
	}	
	public String getEier() {
		return navnEier;
	}	
	public void setEier(String eier) {
		this.navnEier = eier;
	}
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int mobilNr) {
		this.tlf = mobilNr;
	}
}
