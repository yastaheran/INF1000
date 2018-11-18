import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Ordliste {
  /*  public static void main(String[] args) throws FileNotFoundException {

        Ordliste ol = new Ordliste();
        ol.lesBok("scarlet.text");
        ol.leggTilOrd("A");
    } */
   private ArrayList<Ord> ordListe = new ArrayList<Ord>();
    
   void lesBok(String filnavn) throws FileNotFoundException {
    	File fil = new File(filnavn);
    	Scanner inFil = new Scanner(fil);
    	while(inFil.hasNextLine()){
    		leggTilOrd(inFil.nextLine());
    	}
    }
    
    void leggTilOrd(String s) {
    	for(int i = 0; i < ordListe.size(); i++) {
    		if(s.equalsIgnoreCase(ordListe.get(i).toString())) {
    		return;
    		}
    	}
    }
    
    Ord finnOrd(String s) {
    	Ord temp = new Ord(s);
    	for(int i = 0; i < ordListe.size(); i ++) {
    		if(!s.equalsIgnoreCase(ordListe.get(i).toString()) && ordListe.get(i) != null) {
    			temp = null;
    		}
    	}
    	return temp;
    }
    
    int antallOrd() {
    	System.out.println("Boken inneholder " + ordListe.size() + " ulike ord.");
    	return ordListe.size();
    }
    
    int antallForekomster(String s) {
    	int antall = 0;
    	for(int i = 0; i < ordListe.size(); i++) {
    		if(s.equalsIgnoreCase(ordListe.get(i).toString())) {
    			antall = ordListe.get(i).hentAntall();
    		}
    	}
    	System.out.println("Ordet " + s + " forekommer " +  antall + " ganger.");
    	return antall;
    }
    
  /*  Ord vanligste() {
    	for (int i = 0; i < ordListe.size(); i++) {
    		for (int j = 0; j < ordListe.size(); j ++) {
    			if(ordListe.get(i).hentAntall() > ordListe.get(j).hentAntall()) {
    				Ord vanligste = ordListe.get(i);
    			}
    		}
    	}
    	return vanligste.toString();
    }*/
}
