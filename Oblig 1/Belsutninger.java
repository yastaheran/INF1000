public class Beslutninger {
	public static void main(String[] args) {
		int alder = 19;						//Oppgave A
		if (alder>=18) {						//Oppgave B
			System.out.println("Du er myndig");
		} else {
			System.out.println("Du er ikke myndig");
		}
		Scanner in = new Scanner(System.in);		//Oppgave C
		System.out.print("Skriv inn alderen din:");
		int alderNy = in.nextInt();
		if (alderNy>=18) {
			System.out.println("Du er myndig");
		} else {
			System.out.println("Du er ikke myndig");
		}
	}
}
