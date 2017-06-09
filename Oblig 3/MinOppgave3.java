import java.util.Scanner;
public class MinOppgave3 {
/*A: Programmet skal ta imot tall fra brukeren og sortere det B: Programmet skal la brukeren soeke etter en  
 * verdi i arrayen */
	public static void main(String[] args) {
//Oppgave A
		Scanner in = new Scanner(System.in);
		int[] array1 = new int[5];
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0; i < 5; i++) {			//loekke som tar inn tall
			System.out.println("Skriv inn et tall:");	
			array1[i] = in.nextInt();
		}
		System.out.println("Sortet Array: ");
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(array1[i] < array1[j]) {	//loekke som sorterer tall
					temp = array1[i];
					array1[i] = array1[j];	
					array1[j] = temp;
				}
			}
		}
		for(i = 0; i < 5; i++){			//skriver ut den sortete arrayen
			System.out.println(array1[i]);
		}
		System.out.println("\n");
		
	//B
		System.out.println("Soek etter et tall i arrayen: ");
		int tallSoek = in.nextInt();
		boolean funnet = false;
		int lav = 0;
		int hoey = array1.length - 1;
		int pos = 0;
		while(lav <= hoey && !funnet) {	//lokken som soeker etter tallet
			pos  = (lav + høy) / 2;
			if(array1[pos] == tallSoek) {
				funnet = true;
			} else if (array1[pos] < tallSoek) {
				lav = pos + 1;
			} else {
				hoey = pos -1;
			}
		}
		if (funnet) {
			System.out.println("tallet ligger i posisjon " + pos + ".");
		} else {
			System.out.println("tallet ble ikke funnet.");
		}
	}
}
