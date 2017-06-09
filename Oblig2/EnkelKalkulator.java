import java.util.Scanner;
public class EnkelKalkulator {
	public static void main(String[] args) {
		Scanner tallIn = new Scanner(System.in);
//Oppgave A
		sumMetode();			
//Oppgave B
		difMetode();
//Oppgave C
		prodMetode();
//Oppgave D
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.nextInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.nextInt();
		System.out.println("Summen er lik " + (heltall1 + heltall2) + "Differansen er lik " + (heltall1 - 		heltall2) + "Produktet er lik " + (heltall1 * heltall2));
	}
	public static void sumMetode() {
		Scanner tallIn = new Scanner(System.in);
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.nextInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.nextInt();
		System.out.println("Summen er lik " + (heltall1 + heltall2));	
	}
	public static void difMetode() {
		Scanner tallIn = new Scanner(System.in);
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.nextInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.nextInt();
		System.out.println("Summen er lik " + (heltall1 - heltall2));	
	}
	public static void prodMetode() {
		Scanner tallIn = new Scanner(System.in);
		System.out.println("Skriv inn et heltall:");
		int heltall1 = tallIn.nextInt();
		System.out.println("Skriv inn et annet heltall:");
		int heltall2 = tallIn.nextInt();
		System.out.println("Produktet er lik " + (heltall1 * heltall2));
	}
}
