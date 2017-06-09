import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Innlesing {
	public static void main(String[] args) throws FileNotFoundException {
		File fil = new File("winnie.txt");
		Scanner reader = new Scanner(fil);
		String ord = "Winnie-the-Pooh";
		reader = new Scanner(new File(«winnie.txt"));
		int teller = 0;
//Oppgave A
		while (reader.hasNext()) {
			String line = reader.nextLine();
			System.out.println(line);		
//Oppgave B
			if(line.toLowerCase().contains(ord.toLowerCase())) {
				teller++;
			}
		}
		System.out.println(teller);		
//Oppgave C
		Scanner inn = new Scanner(System.in);
		int teller2 = 0;
		System.out.println("Søk etter et ord i Winnie-the-Pooh teksten:");
		String ordFraBruker = inn.nextLine();
		while(reader.hasNext()){
			String linje = reader.nextLine();
			if(linje.toLowerCase().contains(ordFraBruker.toLowerCase())){
				teller2++;
			}
		}
		System.out.println(teller2);
		reader.close();
		inn.close();
	}
}
