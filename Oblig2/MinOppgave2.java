/** programmet skal ta inn navn, alder og bosted, og brukeren skal faa velge mellom aa printe navn, alder og 
 * bosted, og legge til navn, alder og bosted.  */ 
import java.util.Scanner;
public class MinOppgave2 {
	public static void main(String [] args) {
		treGanger();
		treGanger();
	}
//metode
	public static void treGanger() {
		Scanner inn = new Scanner(System.in);
		String navn = "ikke satt";
		String alder = "ikke satt";
		String by = "ikke satt";
		int valg = 0;
//valg nr 1
		printMeny();
		valg = Integer.parseInt(inn.nextLine());
		if (valg == 1) {
			regPerson();
			navn = inn.nextLine();
			alder = inn.nextLine();
			by = inn.nextLine();
		}
		if (valg == 2) {
			printPerson(navn,alder,by);
		}
//valg nr 2
		printMeny();
		valg = Integer.parseInt(inn.nextLine());
		if (valg == 1) {
			regPerson();
			navn = inn.nextLine();
			alder = inn.nextLine();
			by = inn.nextLine();
		}
		if (valg == 2) {
			printPerson(navn,alder,by);
		}
	}
//metode for aa gjore valg
	public static void printMeny(){
		System.out.println("1. Registrer en person");
		System.out.println("2. Print personen");
	}
//metode for aa skrive ut beksjed om aa registrere en person
	public static void regPerson(){
		System.out.println("Skriv inn navnet, trykk enter, skriv så inn alder, trykk enter, og til slutt skriv inn bosted og trykk enter!");
	}
//metode for aa printe en person
	public static void printPerson(String navn, String alder, String by){
		System.out.println("Du har registrert personen: " + navn + " som er " + alder + "aar, fra " + by);
	}
}
