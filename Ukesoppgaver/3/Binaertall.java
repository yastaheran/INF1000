/** ************************************************************************************************************\
Et program som gjør et desimaltall om til binæretall i reversert rekkefølge.
\* *************************************************************************************************************/
import java.util.Scanner;
public class Binaeretall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		int number = input.nextInt();
		input.close();
		while (number > 0) {
	   		System.out.println(number % 2);
			number /= 2;
		}
    	}
}
