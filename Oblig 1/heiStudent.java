import java.util.Scanner;
public class HeiStudent {
	public static void main(String[] args){
		System.out.println("Hei Student");		//Oppgave A
		String name = "Yas";				//Oppgave B
		System.out.println("Hei " + name);
		Scanner in = new Scanner(System.in);	//Oppgave C
		System.out.print("Skriv inn navnet ditt:");
		String helloName = in.next();
		int tall1 = 50;					//Oppgave D
		int tall2 = 45;
		System.out.print("Summen av tall1 og tall2 er " + (tall1+tall2));
		System.out.print("Skriv inn et verdi for tall 1 (må være et heltall):");	//Oppgave E
		int tall01 = in.nextInt();
		System.out.print("Skriv inn et verdi for tall 2 (må være et heltall):");
		int tall02 = in.nextInt();
		System.out.print("Summen av tall 1 og tall 2 er " + (tall01+tall02));
	}
}
