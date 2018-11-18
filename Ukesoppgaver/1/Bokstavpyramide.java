/** *******************************************************************************************************************\
a) Lag et Java-program som gjør dette, ved å bruke flere utskriftssetninger.
b) Endre programmet ditt slik at samme pyramiden blir printet ut, men denne gangen skal bokstavene i pyramiden være valgt fra terminalen av brukeren.
\* *******************************************************************************************************************/
import java.util.Scanner;
public class Bokstavpyramide{
	public static void main(String[] args) {
//Oppgave A
		System.out.println("     a");
		System.out.println("    a a");
		System.out.println("   a b a");
		System.out.println("  a c c a");
		System.out.println(" a d f d  a");
//Oppgave B
		Scanner in = new Scanner(System.in);
		System.out.println("Tast in et symbol:");
		String linje1 = in.hasNextLine;
		System.out.println("Tast in 2 symboler, med mellomrom mellom symbolene:");
		String linje2 = in.hasNextLine;
		System.out.println("Tast in 3 symboler, med mellomrom mellom symbolene:");
		String linje3 = in.hasNextLine;
		System.out.println("Tast in 4 symboler, med mellomrom mellom symbolene:");
		String linje4 = in.hasNextLine;
		System.out.println("Tast in 5 symboler, med mellomrom mellom symbolene:");
		String linje5 = in.hasNextLine;
		System.out.println("     " + linje 1);
		System.out.println("    " + linje 2);
		System.out.println("   " + linje 3);
		System.out.println("  " + linje 4);	
		System.out.println(" " + linje 5);
	}
}
