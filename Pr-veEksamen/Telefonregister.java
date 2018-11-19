import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Telefonregister {
    private HashMap<String,Kontakt> h = new HashMap<String,Kontakt>();
    // private HashMap<String,Kontakt> h = new HashMap<>(); er også OK.

    // Deloppgave 6c:
    void lesFraFil(String f) throws Exception {
	        Scanner s = new Scanner(new File(f));
	        while (s.hasNextLine()) {
	            String n = s.nextLine();
              String a = s.nextLine();
              String t = s.nextLine();
              h.put(n, new Kontakt(n,a,t));
          }
          s.close();
    }
    // Deloppgave 6d:
    void snakkMedBruker() {
          Scanner tastatur = new Scanner(System.in);
          while (true) {
              System.out.print("Gi et navn: ");
              String n = tastatur.nextLine();
              if (h.containsKey(n)) {
	            	h.get(n).skrivUt();
              } else {
                System.out.println("Navnet " + n + " er ukjent!");
        	    }
         	}
    }
    // Deloppgave 6f:
    void skrivAdresser() {
	      HashMap<String,Husstand> husstander = new HashMap<>();
        for (String n: h.keySet()) {
            Kontakt k = h.get(n);
            String a = k.hentAdresse();
            if (husstander.containsKey(a)) {
                husstander.get(a).leggTil(k);
	          } else {
                Husstand hs = new Husstand();
                hs.leggTil(k);
                husstander.put(a,hs);
            }
        }
        for (String a: husstander.keySet()) {
           Husstand hs = husstander.get(a);
           hs.skrivLapp();
        }
   }
}
