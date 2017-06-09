import java.util.Scanner;
public class EnkelKalkulator {
	public static void main(String[] args) {
		Scanner tallIn = new Scanner(System.in);
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.extInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.extInt();
//Oppgave A
		sumMetode(heltall1, helltall2);	
//Oppgave B
		difMetode(heltall1, helltall2);
//Oppgave C
		prodMetode(heltall1, helltall2);
//Oppgave D
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.nextInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.nextInt();
		System.out.println("Summen er lik " + (heltall1 + heltall2) + "Differansen er lik " + (heltall1 - 		heltall2) + "Produktet er lik " + (heltall1 * heltall2));
	}
	public static void sumMetode(int t1, int t2) {
		System.out.println("Summen er lik " + (t1 + t2));	
	}
	public static void difMetode(int t1, int t2) {
		System.out.println("Summen er lik " + (heltall1 - heltall2));	
	}
	public static void prodMetode(int t1, int t2) {
		System.out.println("Produktet er lik " + (t1 * t2));
	}
}
