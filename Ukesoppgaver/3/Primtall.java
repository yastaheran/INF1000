/** ************************************************************************************************************\
Et program som tar imot et tall fra brukeren. Skriver ut alle primtall lavere enn tallet fra brukeren.
\* *************************************************************************************************************/
import java.util.Scanner;
public class Primtall {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Number: ");
	int number = input.nextInt();
	for (int current_number = 2; current_number <= number; current_number++) {
		boolean prime = true;
	    	int test_number = 2;
	    	while (prime && test_number < current_number) {
			if (current_number % test_number == 0) {
				prime = false;		    
			} 
			test_number += 1;
		}
		if (prime) {
			System.out.println(current_number);
		}
	}
    }
}
