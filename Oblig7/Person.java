/** *************************************************************************************************************************\
 * Person klassen skal inneholde "egenskapene" til eier og laaner. Det er en liten kommentarboks over hver
 * metode som kort forteller om metoden.
\ ***************************************************************************************************************************/
import java.util.*;							//importerer ArrayList og Scanner
class Person {
  /*public static void main(String[] args) { Person person = new Person("Julie Susanne"); System.out.println(person); }*/
	private String navnEier;			//variabelen navnEier skal holde på navnet til eieren
	private int antallLaan = 0;			//variabelen antallLaan skal ha veriden av antall laan
	private int antallLaanUt = 0;			//variabelen antallLaanUt skal ha verdien av antall utlaan 
	private ArrayList <DVD> dVDarkiv = new ArrayList<>();		//ArrayList med dvdene til eieren
	private ArrayList <DVD> laantDVDarkiv = new ArrayList<>(); //ArrayList med dvdene utlaant til laaner
/* ********************************************************************************\
 * konstruktoer parameter til Person klassen. Den tar imot nye Personer.
\* ********************************************************************************/	
	Person (String nyttNavn) {
		this.navnEier = nyttNavn;
	}
/* ****************************************************************************************************\
 * toString-metode for Person klassen. Den skal returnerer en tekst versjon av objektet.
\* ****************************************************************************************************/	
	public String toString() {
		return navnEier;
	}
/* ***************************************************************************\
 * hentNavn-metoden skal returnere navnet på eieren av DVDen
\* ***************************************************************************/
	public String hentNavn() {
		return navnEier;
	} 
/* *****************************************************************************************\
 * leggTilDVD-metoden skal brukes for aa arkivere DVDer inn i eierens dvdarkiv.
\* *****************************************************************************************/
	public void leggTilDVD(DVD tittel) {
		dVDarkiv.add(tittel);
	}
/* ***********************************************************************************\
 * hentAntallDVD skal brukes naar vi skal se hvor mange dvder en eier har.
\* ***********************************************************************************/
	public int hentAntallDVD() { 
		return dVDarkiv.size(); 
	}
/* ***************************************************************************\
 * hentDVD-metoden henter navnet på DVDen fra eierens dvd arkiv.
\* ***************************************************************************/
	public DVD hentDVD(int i) {	
		return dVDarkiv.get(i);
	}
/* **************************************************************************************************\
 * hentAntallLaan-metoden skal brukes naar vi skal se hvor mange dvder som er laant.
\* **************************************************************************************************/
	public int hentAntallLaan() {
		return antallLaan;
	} 
/* ******************************************************************************************************\
 * hentAntallLaantUt-metoden skal brukes naar vi skal se hvor mange dvder som er utlaant.
\* *****************************************************************************************************/
	public int hentAntallLaantUt() { 
		return antallLaanUt; 
	} 
/* **************************************************************************************************************************\
 *laanDVD-metoden skal ta i mot navnet til dvden og personen. For saa aa oeke antallet dvder personen har
 * laaant/laant ut med 1, og arkivere dette i laant arkivet.
\* **************************************************************************************************************************/
	public void laanDVD(DVD dvd, Person pers) {
		antallLaan++; 
		pers.antallLaanUt++;
		dvd.settLaaner(this); 
		laantDVDarkiv.add(dvd); 
	} 
/* **************************************************************************************************************************\
 * returnerDVD-metoden skal brukes når en person skal returnere DVDen. Den tar imot navn på dvd og laaner,
 * og minker antall utlaan/laan med 1. Deretter fjernes dvden fra laant arkivet
\* **************************************************************************************************************************/
	public void returnerDVD(DVD dvd, Person pers) {
		antallLaan--; 
		pers.antallLaanUt--;
		dvd.settLaaner(null); 
		laantDVDarkiv.remove(dvd); 
	}
/* ***************************************************************************\
 * finneTittelen-metoden skal sjekke om tittelen finnes i arkivet.
\* ***************************************************************************/
	public boolean finnesTittelen(String tittel) { 
		for (int i = 0; i < dVDarkiv.size(); i++) { 
			DVD dvd = dVDarkiv.get(i); 
			if (tittel.equals(dvd.hentTittel())) { 
				return true; 
			}
		} 
		return false;
	} 
/* **************************************************************************************************************************\
 * hentLaantDVD skal sjekke om DVDen er laant, og hvis den er det skal den returnere navnet paa DVDen.
\* **************************************************************************************************************************/
	public DVD hentLaantDVD(String tittel) {
		for (int i = 0; i < laantDVDarkiv.size(); i++) {
			DVD dvd = laantDVDarkiv.get(i); 
			if (tittel.equals(dvd.hentTittel())) { 
				return dvd; 
			}
		}
		return null;
	} 
/* **************************************************************************************************************************\
 * hentDVD-metoden skal sjekke om dvden er i dvd arkivet, og hvis den er det skal den returnere navnet paa
 * DVDen.
\* **************************************************************************************************************************/
	public DVD hentDVD(String tittel) { 
		for (int i = 0; i < dVDarkiv.size(); i++) { 
			DVD dvd = dVDarkiv.get(i); 
			if (tittel.equals(dvd.hentTittel())) { 
				return dvd; 
			}
		} 
		return null;
	} 
/* ***********************************************************************************\
 * skrivUt-metoden skal printe ut navnet paa eieren og alle dvdene den eier.
\* ***********************************************************************************/
	public void skrivUt() { 
		System.out.println(navnEier + " eier disse DVDene:"); 
		for (int i = 0; i < dVDarkiv.size(); i++) { 
			DVD dvd = dVDarkiv.get(i); 
			if (dvd.utlaant()) { 
				System.out.println("	" + dvd + "(lånt av " + dvd.hentLaaner() + ")"); } else 				{ System.out.println("	" + dvd); 
			} 
		} 
	} 
} //Slutt på Person klassen
