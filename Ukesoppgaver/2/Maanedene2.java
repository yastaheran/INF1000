/** ***************************************************************************************************************\
Programmet skal spørre etter en måned (gitt som tall) for så å printe ut antall dager i måneden.
\* ***************************************************************************************************************/
import java.util.Scanner;
public class Maanedene2{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print(«Maaned (tall): ");
	int maaned = input.nextInt();
	if (maaned < 1 || maaned> 12) {
	    System.out.println("Ugyldig maaned. ");
	    return;
	}
	System.out.print("Antall dager i denne maaneden: ");
	if (maaned == 4 || maaned == 6 || maaned == 9 || maaned== 11) {
	    System.out.print("30");
	} else if (month == 2) {
	    System.out.print("28 eller 29");
	} else {
	    System.out.print("31");
	}
    }
}
