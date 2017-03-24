import java.util.Scanner;
public class Billettpris {
	public static void main(String[] args) {
		Scanner inAlder = new Scanner(System.in);
		System.out.print("Hvor gammel er du?");
		int alderIn = inAlder.nextInt();
		int billett = 50;
		if (alderIn>=12 && alderIn<=67) {
			System.out.println("Du må betale " + billett + "kr");
		} else {
			System.out.println("Du må betale " + billett/2 + "kr");
		}
	}
}
