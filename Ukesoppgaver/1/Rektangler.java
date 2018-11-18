/** *************************************************************************************************************************\
a) Et program som ber brukeren oppgi lengden og bredden til et rektangel, og skriver ut arealet.
b) Regn ut omkretsen til rektanglene og skriv den til terminalen.
\* **************************************************************************************************************************/
import java.util.Scanner;
public class Rektangler {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tast inn lengden og bredden på rektangelet. Henholdsvis.»);
		int side1 = in.nextInt();
		int side2 = in.nextInt();
		int areal = side1*side2;
		System.out.println("Arealet til rektangelet = " + areal);
	}
}
