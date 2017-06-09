import java.util.Scanner;
public class SumTall {
	public static void main(String[] args) {
		Scanner inn = new Scanner(System.in);
		System.out.println("Skriv inn et heltall:");
		int tallInn = Integer.parseInt(inn.nextLine());
		int sum = 0;		
//Oppgave A
		while (tallInn != 0) {
			sum += tallInn; //Oppgave B
			System.out.println("Skriv inn et heltall:");
			tallInn = Integer.parseInt(inn.nextLine());
		}
		System.out.println(sum);
	}
}
