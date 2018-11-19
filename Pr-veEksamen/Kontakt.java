class Kontakt {
    private String navn, adresse, tlf;

    // Deloppgave 6a:
    Kontakt(String n, String a, String t) {
	      navn = n; 
        adresse = a;  
        tlf = t;
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
