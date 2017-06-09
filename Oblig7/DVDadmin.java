/** *************************************************************************************************************************\
 * Dette programmet bruker en DVDadmin for å ta imot kommandoer fra brukerens tastatur. Følgende 
 * kommandoer er med:
 * A - Avslutter kommandoloekken.
 * K - Brukes naar en person har kjoept en ny DVD.
 * L - Brukes naar en person vil laane en DVD av en annen.
 * N - Legger til en ny person.
 * O - Gir en oversikt over alle personene i arkivet
 * R - Brukes naar en DVD skal leveres tilbake
 * V - Viser en oversikt over alle DVDene en gitt person eier
\****************************************************************************************************************************/
import java.util.*;						//importerer arraylist og scanner
import java.io.*;						//importerer File, FileNotException og PrintWriter
public class DVDadmin {
	  private String dvdArkivnavn;
	  private ArrayList<DVD> filmSamling = new ArrayList<DVD>();		//arrayliste over DVDer
	  private ArrayList<Person> navneliste = new ArrayList<Person>();		//arrayliste over eiere
	  private ArrayList<Person> laanListe = new ArrayList<Person>();		//arrayliste over laanere
/* ***************************************************************************\
 * konstruktoeren parameter for DVDadmin klassen
\* ***************************************************************************/
	  DVDadmin(String navn) {
	    dvdArkivnavn = navn;
	  }
/* ***************************************************************************\
 * toString-metode for DVDadmin klassen
\* ***************************************************************************/
	  public String toString() {
	    return "DVD-arkivet " + dvdArkivnavn; 
	  }  
/* ***************************************************************************\
 * skrivTilFil-metoden skriver inn i filen dvdarkiv.txt
\* ***************************************************************************/
	  void skrivTilFil() throws Exception {	
		PrintWriter pw = new PrintWriter(«dvdarkiv.txt"); //lager en ny PrintWriter med filen dvdarkiv.txt
		for (int i = 0; i < navneliste.size(); i++) {	//skriver inn hver linje fra arrayen inn i dokumentet
			Person pers = navneliste.get(i);
			pw.println(pers.hentNavn());	
			for (int j = 0; j < pers.hentAntallDVD(); j++) { //skriver inn dvdene personen eier
				DVD dvd = pers.hentDVD(j);	
				if (dvd.utlaant()) {		 //sjekker om dvden er utlaant, er den det faar den
					pw.println("*" + dvd.hentTittel()); //en stjerne ved navnet, med navnet
						pw.println(dvd.hentLaaner().hentNavn()); //laaneren skrevet under.
				} else {
					pw.println(dvd.hentTittel());
				}
			}
			pw.println("\n");
		}
		pw.close();	//lukker PrinWriteren
	}

/* ***************************************************************************\
 * lesFraFil-metoden leser filen dvdarkiv.txt
\* ***************************************************************************/
	void lesFraFil() throws Exception {	
		String filnavn = "dvdarkiv.txt";		//Setter variabelen filnavn lik filen dvdarkiv.txt.
		File fil = new File(filnavn);		//Lager en File objekt med navn filnavn.
		Scanner filInn = new Scanner(fil);	//Lager en Scanner objekt med File objekten.	
		boolean eierNesteLinje = true;	//setter eierNesteLinje lik sant
		Person eier = null;			//gir eier verdien null
		Person laaner = null;			//gir laaner verdien null
		while (filInn.hasNextLine()) {		//while-loekke som kjoerer saa lenge filen har en linje
			String linje = filInn.nextLine();		//som kan bli lest
				if (eierNesteLinje) {		//leser eiere og laanere saa lenge eierNesteLinje er
					eier = finnPerson(linje);	//sann.
					if (eier == null) {
						eier = new Person(linje);
						navneliste.add(eier);
					} else {
						eierNesteLinje = false;
					}
				} else {
					if (linje.equals("")) {
						eierNesteLinje = true;
					} else {
						String filmTittel;
						boolean laan;
						if (linje.startsWith("*")) {
							laan = true;
							filmTittel = linje.substring(1);
							String laanerNavn = filInn.nextLine();
							laaner = finnPerson(laanerNavn);
							if (laaner == null) {
								laaner = new Person(laanerNavn);
								navneliste.add(laaner);
							}
						} else {
							laan = false;
							filmTittel = linje;
						}
						DVD dvd = new DVD(filmTittel);
						eier.leggTilDVD(dvd);
						if (laan) {
							laaner.laanDVD(dvd, eier);
						}
					}
				}
			}
		}

/* ************************************************************************************\
 * KommandoLinje()-metoden tar imot og utfoerer kommandoer fra brukeren.
\* ************************************************************************************/
	void kommandoLinje() {
		Scanner s = new Scanner(System.in);	//Scanneren s tar imot input fra brukeren
		while(true) {	// While-loekke som blir kjoert saa lenge kommandoen A ikke er angitt
			System.out.println("Velg en kommando");
		    	System.out.println("A (Avslutt)");
		    	System.out.println("K (Kjoep av DVD)");
			System.out.println("L (Laan av DVD)");
		    	System.out.println("N (Ny Person)");
		   	System.out.println("O (Oversikt)");
		   	System.out.println("R (Returnerting av DVD)");
		   	System.out.println("V (Vis)");
		   	System.out.print("Kommando: ");
		    	String kommando = s.nextLine();	//Setter variabelen kommando lik input fra brukeren
			if (kommando.equalsIgnoreCase("A")) {	//A avslutter kommandoloekken
		    	return;
		    	} else if(kommando.equalsIgnoreCase("K")) { //K kaller paa kjoepDVD()-metoden
		    	kjoepDVD(s);
			} else if(kommando.equalsIgnoreCase("L")) {  //L kaller paa laanDVD()-metoden
		    	laanDVD(s);
			} else if(kommando.equalsIgnoreCase("N")) {  //N kaller paa nyPers()-metoden
				nyPers(s);
			} else if(kommando.equalsIgnoreCase("O")) {  //O kaller paa oversikt()-metoden
				oversikt();
			} else if(kommando.equalsIgnoreCase("R")) {  //R kaller paa returDVD()-metoden
				returDVD(s);		
			} else if(kommando.equalsIgnoreCase("V")) {  //V kaller paa vis()-metoden
		    	vis(s);
			} else {	 //hvis kommandoen er ugyldig sier programmet ifra og kommando linjen starter
		    	System.out.println("Kommandoen er ikke gyldig"); //på nytt
			}
		}
	}
/* **************************************************************************************************************************\
 * kjoepDVD()-metoden skal spørre om hvem som har kjoept DVDen og hva den heter. Samtidig som den
 * sjekker om personen finnes og om personen allerede har et eksemplar DVDen.
\* **************************************************************************************************************************/
	void kjoepDVD(Scanner sc) {
		System.out.println("Hvem har kjoept DVDen?");
		String kjoeperNavn = sc.nextLine();
		Person kjoeper = finnPerson(kjoeperNavn);
		if(kjoeper != null) {					//sjekker om personen finnes
			System.out.println("Hva heter DVDen?");
			String tittel = sc.nextLine();
		
			if (kjoeper.finnesTittelen(tittel)) {		//sjekker om personen eier filmen
				System.out.println(kjoeper + " har " + tittel + " fra foer.");
				return;
			} else {
				DVD dvd = new DVD(tittel);
				dvd.settEier(kjoeper);
				kjoeper.leggTilDVD(dvd);
				System.out.println("");
				System.out.println(kjoeper + " har kjoept DVDen: " + tittel + ".");
			}
		} else {
		System.out.println("Personen finnes ikke");
		}
	}
/* **************************************************************************************************************************\
 * laanDVD()-metoden skal hvem som vil laane, hvem han/hun vil laane fra og hvilken DVD det er snakk om.
 * Den skal ogsaa sjekke at eieren virkelig eier den angitte DVDen, og om den allerede er utlaant. Personen
 * skal heller ikke laane av seg selv.
\* **************************************************************************************************************************/
	void laanDVD(Scanner sc) {
		System.out.println("Hvem skal laane?");
		String navnLaaner = sc.nextLine();
		Person laaner = finnPerson(navnLaaner);
		if(laaner == null) {
			System.out.println("Personen finnes ikke");
			return;
		} else {
			System.out.println("Hvem skal dvden laanes av?");
			String navnEier = sc.nextLine();
			Person laanerBort = finnPerson(navnEier); 
			if(laanerBort == null) {
				System.out.println("Personen finnes ikke"); 
				return;
			} else if (laaner == laanerBort) {
				System.out.println(laaner + " kan ikke låne fra seg selv."); 
				return;
			} else {
				System.out.println("Hvilken DVD skal laanes?"); 
				String tittel = sc.nextLine();
				if (!laanerBort.finnesTittelen(tittel)) { 
					System.out.println("Personen eier ikke DVD'en"); 
					return; 
				} else {
					DVD dvd = laanerBort.hentDVD(tittel);
		
					if (dvd.utlaant()) { 
						System.out.println("DVD'en er allerede utlaant"); 
						return; 
					} else {
						laaner.laanDVD(dvd, laanerBort);
					System.out.println(laaner + " har lånt " + tittel + " fra " + laanerBort + ".");
					}
				}
			}
		}
	}
/* **************************************************************************************************************************\
 * nyPers()-metoden skal spørre etter personens navn, sjekke at personen ikke er allerede er med i arkivet for
 * saa aa legge dem til.
\* **************************************************************************************************************************/
	void nyPers(Scanner sc) {							
		System.out.println("Hva heter personen?"); 
		String navn = sc.nextLine();
		if (finnPerson(navn) != null) {
			System.out.println("Personen finnes allerede");
			return;
		} else {
			Person nyPerson = new Person(navn);
			navneliste.add(nyPerson); 
			System.out.println("Ny person: " + nyPerson);
		}
	}	
/* **************************************************************************************************************************\
 * oversikt-metoden skal gi en oversikt over alle personene i arkivet, og for hver person skal det angis hvor
 * mange DVDer han/hun eier, hvor mange han/hun har lånt ut for tiden og til slutt hvor mange han/hun selv
 * har lånt.
\* **************************************************************************************************************************/
	void oversikt() {
		for(int i = 0; i < navneliste.size(); i++) {
			Person pers = navneliste.get(i);
			int antallArkivert = pers.hentAntallDVD();
			int antallLan = pers.hentAntallLaan();
			int antallLantUt = pers.hentAntallLaantUt();
			System.out.println(pers + " eier: " + antallArkivert + " dvd(er). Har laant ut: " + antallLantUt + " dvd(er), og har laant: " + antallLan + " dvd(er)");
		}
	}
/* **************************************************************************************************************************\
 * retur()-metoden skal spørre om hvem som har laant filmen og hva den heter, og sjekke om DVDen finnes og
 * om den har vaert utlaant til angitte person.
\* **************************************************************************************************************************/
	void returDVD(Scanner sc) {
		System.out.println("Hvem har laant DVD'en?"); 
		String navnLaaner = sc.nextLine();
		Person laaner = finnPerson(navnLaaner); 
		if (laaner == null) { 
			System.out.println("Personen finnes ikke");
			return; 
		} else {
			System.out.println("Hva heter DVD'en?"); 
			String tittel = sc.nextLine();
			DVD dvd = laaner.hentLaantDVD(tittel);
			if (dvd == null) { 
				System.out.println("DVD'en har ikke vært utlånt til " + laaner + "."); 
				return;
			} else {
				Person eier = dvd.hentEier(); 
				laaner.returnerDVD(dvd, eier); 
				System.out.println("Returnerer " + tittel + " til " + eier + ".");
			}
		}
	}
/* **************************************************************************************************************************\
 * vis()-metoden skal spoerre om hvilken person det skal vises en oversikt for, hvis alle skal brukeren taste inn
 * "*". For hver brukeren skal det oversikt-metoden oppgi navnet på alle DVDene han/hun eier.
\* **************************************************************************************************************************/
	void vis(Scanner sc) {								
		System.out.println("Hvem sine DVDer vil du se (* for alle)?");
		String navnSok = sc.nextLine();
		if (navnSok.equals("*")) {
			for (int i = 0; i < navneliste.size(); i++) {
				Person person = navneliste.get(i);
				person.skrivUt();
			}
		} else {
			Person person = finnPerson(navnSok);
			person.skrivUt();
		}
	}
/* **************************************************************************************************************************\
 * Person finnPerson()-metoden Soeker etter angitte person i navnliste-array. Dette er for aa sjekke om
 * personen finnes eller ikke.
\* ***********************************************************************************************************************/
	Person finnPerson(String navnFinn) {
		for (int i = 0; i < navneliste.size(); i++) {
			Person person = navneliste.get(i);
			if (person.hentNavn().equals(navnFinn)) {
				return person;
			}
		}
		return null;
	}
} //Slutt på DVDadmin klassen
