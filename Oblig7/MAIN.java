/** ***************************************************************************\
 * MAIN klassen er main-metoden for programmet.
 * ***************************************************************************/
public class MAIN {
	public static void main(String[] args) throws Exception {
		DVDadmin arkiv = new DVDadmin("dvdarkiv.txt");
		arkiv.lesFraFil();
		arkiv.kommandoLinje();
		arkiv.skrivTilFil();
	}
} //Slutt på MAIN klassen
