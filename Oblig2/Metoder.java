import java.util.Scanner;
public class Metoder {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//Oppgave A
		System.out.println("Skriv inn navn:");
		String navnInn = in.nextLine();
		System.out.println("Skriv inn bosted");
		String bostedInn = in.nextLine();
		System.out.println("Hei, " + navnInn + "! Du er fra " + bostedInn);
//Oppgave B
		treGanger();
		treGanger();
		treGanger();
	}
	public static void treGanger() {
		Scanner in3 = new Scanner(System.in);
		System.out.println("Skriv inn navn:");
		String navnInn = in3.nextLine();
		System.out.println("Skriv inn bosted");
		String bostedInn = in3.nextLine();
		System.out.println("Hei, " + navnInn + "! Du er fra " + bostedInn);
	}
}
