import java.util.ArrayList;

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
