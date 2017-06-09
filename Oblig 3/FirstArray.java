import java.util.Scanner;
public class FirstArray {
	public static void main (String[] args) {
//Oppgave A
		int[] heltall = new int[4];
		heltall[0] = 0;
		heltall[1] = 1;
		heltall[2] = 2;
		heltall[3] = 3;		
		for (int index = 0; index < heltall.length; index++) {
			   System.out.print(heltall[index] + ", ");	//skriver ut tallene
			}
		System.out.println("\n");
//Oppgave B
		int[] iArray = new int[4];
		for (int index = 0; index < iArray.length; index ++) {
			iArray[index]= index;
			System.out.println(iArray[index]);
		}
		System.out.println("\n");		
//Oppgave C endre forste og siste tall i arrayen til å bli 1337
		iArray[0] = 1337;
		iArray[3] = 1337;		
		System.out.print(iArray[0] + ", ");
		System.out.print(iArray[3] + ", ");	//Skriver ut verdiene i index 0 og 3
		System.out.println("\n");		
//Oppgave D
		Scanner in = new Scanner(System.in);
		String[] navn = new String[5]; 
		for (int index = 0; index <navn.length; index ++) {
			System.out.printkn(«Skriv inn et navn:»);
			navn[index] =  in.nextLine();
		}		
		for (int index = 0; index < navn.length; index++) {
			   System.out.print(navn[index] + ", ");      //skriver ut navnene
		}
	}
}
