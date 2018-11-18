import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class TelefonregisterMain2 {
    public static void main(String[] args) throws Exception {
	Telefonregister tr = new Telefonregister();
	tr.lesFraFil("kontakter.txt");
	tr.skrivAdresser();
	tr.snakkMedBruker();
    }
}
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
class Kontakt {
    private String navn, adresse, tlf;

    // Deloppgave 6a:
    Kontakt(String n, String a, String t) {
	navn = n;  adresse = a;  tlf = t;
    }

    // Deloppgave 6b:
    void skrivUt() {
	System.out.println(navn);
	System.out.println(adresse);
	System.out.println(tlf);
    }

    String hentAdresse() {
	return adresse;
    }

    String hentNavn() {
	return navn;
    }
}
// Deloppgave 6e:
class Husstand {
    private ArrayList<Kontakt> medlemmer = new ArrayList<>();

    void leggTil(Kontakt k) {
	    medlemmer.add(k);
    }

    void skrivLapp() {
	    for (int i = 0;  i < medlemmer.size();  i++) {
	      System.out.println(medlemmer.get(i).hentNavn());
	    }
	    System.out.println(medlemmer.get(0).hentAdresse());
	  System.out.println();
    }
}
