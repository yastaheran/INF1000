import java.io.*;

public class Oblig6 {
	public static void main(String[] args) throws FileNotFoundException {
		Ordliste ol = new Ordliste();
		ol.lesBok("scarlet.text");
		ol.antallOrd();
		ol.antallForekomster("Holmes");
		ol.antallForekomster("elementary");
		//ol.vanligste();
	}
}
