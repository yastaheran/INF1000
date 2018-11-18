public class Ord {
	private String ord;
	private int teller = 1;
	
	Ord(String o){
		this.ord = o;
	}
	
	public String toString(){
		return ord;
	}
	
	public int hentAntall(){
		if(teller >= 1){
			System.out.println("Ordet:" + ord + "forekommer " + teller + " ganger.");
		}
		return teller;
	}
	
	public void oekAntall(){
		teller ++;
	}
}