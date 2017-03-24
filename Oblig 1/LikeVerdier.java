import java.util.Scanner;
public class LikeVerdier {
	public static void main(String[] args) {
		int c = 49;							//Oppgave A
		int d = 51;
		if (c == d) {							//Oppgave B
			System.out.println("c og d er like");
		} else {
			System.out.println("c er ikke lik d");
		}
		Scanner in = new Scanner(System.in);		//Oppgave C
		System.out.print("Skriv inn et verdi for c:");
		int c1 = in.nextInt();
		System.out.print("Skriv inn et verdi for d:");
		int d1 = in.nextInt();
		if (c1 == d1) {
			System.out.println("c og d er like");
		} else {
			System.out.println("c er ikke lik d");
		}	
	}
}
