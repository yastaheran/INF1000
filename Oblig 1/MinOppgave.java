import java.util.Scanner;
public class MinOppgave {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int poeng = 0;
		System.out.println("1 +1 = ?");	//Spørsmål 1
		int svar1 = 2;				//Svar1
		int inSvar1 = in.nextInt();
		if (svar1 == inSvar1) {			//test 1
			System.out.println("Riktig");
		} else  {
			System.out.println("Feil, riktig svar er " + svar1);
		}
		System.out.println("3 * 2 = ?");	//Spørsmål 2
		int svar2 = 6;				//Svar 2
		int inSvar2 = in.nextInt();
		if (svar2 == inSvar2) {			//test 2
			System.out.println("Riktig");
		} else {
			System.out.println("Feil, riktig svar er " + svar2);
		}
		System.out.println("16 / 4 = ?");	//Spørsmål 3
		int svar3 = 4;				//Svar 3
		int inSvar3 = in.nextInt();
		if (svar3 == inSvar3) {			//test 3
			System.out.println("Riktig");
		} else {
			System.out.println("Feil, riktig svar er " + svar3);
		}
		System.out.println("Gratulerer du er ferdig!");	
	}
}
