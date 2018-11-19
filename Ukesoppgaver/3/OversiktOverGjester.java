/** ************************************************************************************************************************\
Et program som holder oversikten over hvor mange folk det kan være i en østersbar samtidig. De kan forlate baren når som helst, men en gruppe kan ikke komme inn hvis det fører til at antall folk i baren blir mer enn 100. Så fort baren har nådd sin grense skal programmet si ifra og avslutte.
\* ************************************************************************************************************************/
import java.util.Scanner;
public class OversiktOverGjester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAXIMUM_PEOPLE = 100;
		int currentPeople = 0;
		do {
			System.out.print("Size of group entering: ");
			int enteringpPeople = input.nextInt();
			if (currentPeople + enteringPeople <= MAXIMUM_PEOPLE) {
				System.out.println("Welcome in !");
				currentPeople += enteringPeople;
			} else {
				System.out.println("Group exceeds bar capacity.");
			}

			System.out.println("~~~Currently " + currentPeople + " in the oyster bar");
		} 
	while (currentPeople < MAXIMUM_PEOPLE);
	input.close();
	System.out.println("Oyster bar is full.");
    }
}
