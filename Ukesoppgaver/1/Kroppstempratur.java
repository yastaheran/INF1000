/** ************************************************************************************************************************\
Lag et program som avgjør om en persons kroppstemperatur ligger henholdsvis under, innenfor eller over normal kroppstemperatur.  Programmet skal lese kroppstemperaturen fra terminal.
\* *************************************************************************************************************************/
import java.util.Scanner;
public class Kroppstempratur {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv inn ditt kroppstempratur:");
		String temp = in.hasNextLine();
		double tempVerdi = temp;
		double tempMin = 36.5;
		double tempMax = 37.5;
		if(tempVerdi > tempMin) {
			System.out.println("Din kroppstempratur er lavere enn normal kroppstempratur.");
		} else if(tempVerdi < 37.5){
			System.out.println("Din kroppstempratur er høyere enn normal kropptempratur.");
		} else {
			System.out.println("Din kroppstempratur er normal.");
		}
	}
}
