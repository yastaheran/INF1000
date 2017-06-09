/** *************************************************************************************************************************\
 * DVD klassen skal inneholde "egenskapene" til en DVD.Det er en kommentarboks over hver metode som 
 * forteller litt om metoden.
\****************************************************************************************************************************/
public class DVD {
 /*public static void main(String[] args) { DVD dvd = new DVD(""); System.out.println(dvd);} */
	private String filmTittel = " ";		//variabelen filmTittel skal holde paa tittelen til filmen
    	private Person navnEier;		//variabelen navnEier skal holde paa navnet til eieren
   	private Person navnLaaner;		//variabelen nanvLaaner skal holde paa navnet til laaneren
/* *************************************************************************************\
 * Konstruktoer parameter for DVD klassen. Den skal ta imot nye DVD navn
\* *************************************************************************************/
    DVD(String tittel) {
    	filmTittel = tittel;
    }
/* **************************************************************************************************************************\
 * toString-metode for DVD klassen. toString metoden skal returnerer en tekst versjon av objektet.
\* **************************************************************************************************************************/
    public String toString() {
    	return filmTittel;
    }
/* ***************************************************************************\
 * settEier-metode skal bli brukt for aa gi DVDen en eier
\* ***************************************************************************/   
    void settEier(Person navn) {
    	navnEier = navn;
    }
/* **************************************************************************************************************************\
 * settLaaner-metoden skal brukes naar DVDen laanes ut. Den tar vare på navnet til laaneren
\* *****************************************************************************************************************************/
    void settLaaner(Person laaner) {
    	navnLaaner = laaner;
    }
/* ***************************************************************************\
 * utlaant-metoden sjekker om personen har laanet tidligere
\* ***************************************************************************/
    public boolean utlaant() {
    	if(navnLaaner != null) {
    		return true;
    	}
    	return false;
    }
/* ***************************************************************************\
 * hentTittel-metoden skal returner navnet paa DVDen
\* ***************************************************************************/
    public String hentTittel() {
    	return filmTittel;
    }
/* ***************************************************************************\
 * hentEier-metoden skal hente navnet paa eieren av DVDen
\* ***************************************************************************/
    public Person hentEier() {
    	return navnEier;
    }
/* ***************************************************************************\
 * hentLaaner-metoden skal hente navnet paa laaneren av DVDen
\* ***************************************************************************/
    public Person hentLaaner() {
    	return navnLaaner;
    } 
} //Slutt på DVD klassen
