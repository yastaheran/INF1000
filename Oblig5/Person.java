public class Person  {
	private String navn;
	private int alder;
	private String Bosted;
	public Person(String navnInn)  {
		this.navn = navnInn;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String nyttNavn) {
		this.navn = nyttNavn;
	}
	public String getBosted() {
		return bosted;
	}
	public void setBosted(String by) {
		this.bosted = by;
	}
	public int getAlder() {
		return alder;
	}
	public void setAlder(int alderInn) {
		this.alder = alderInn;
	}
}
