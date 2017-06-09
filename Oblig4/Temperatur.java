/* *
* Programmet skal regne ut gjennomsnittet. Array bør leses inn som String og gjøre om til int når man leser fra fil. 
* For å finne gjennomsnittet av dette lager man en «sum» variabel, går gjennom arrayet og plusser hver verdi i arrayet ved 
* hjelp av en løkke.
*/
import java.util.Scanner;
import java.io.File;
public class Tempratur {
	public static void main(String[] args) throws Exception {
		File temp = new File("tempratur.txt");
		Scanner in = new Scanner(temp);
		String[] maned = new String[12];
		int sum = 0;
//Oppgave A
		while (in.hasNextLine()) {
			for(int i = 0; i <= maned.length; i++){
				maned[i] = in.nextLine();
			}	
		}
	}
}
