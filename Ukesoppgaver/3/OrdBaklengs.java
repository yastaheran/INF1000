/** ************************************************************************************************************\
Programmet skal lese inn et ord fra terminalen og skrive det ut igjen baklengs.
\* *************************************************************************************************************/
import java.util.Scanner;
public class OrdBaklengs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ord: ");
		String ord = input.next();
		StringBuilder nyttOrd = new StringBuilder(ord);
		ord = nyttOrd.reverse().toString();
		System.out.println("Reverse: " + ord);
	}
}
