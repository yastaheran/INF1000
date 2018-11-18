/** *************************************************************************************************************************\
Hvis en person har inntekt < 10000,  så betaler man 10% skatt, og hvis inntekten >= 10000, så betaler man 10% skatt på de første 10000 kr og 30% skatt på resten av inntekten. Program skal regner og skriver ut hvor mange kroner som skal betales i skatt. Programmet skal lese inntekten fra terminal.
\* **************************************************************************************************************************/
import java.util.Scanner;
public class SkattRuritania {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn din inntekt");
		int loenn = sc.nextInt();
		int skatt = 0;
		if(loenn < 10000) {
			skatt = loenn*1/10;
			System.out.println("Du skal betale " + skatt + " kr i skatt");
		} else {
			int loenn1 = (loenn - 10000);
			int loenn2 = (loenn -loenn1);
			int skattTemp1 = loenn1*1/10;
			int skattTemp2 = loenn2*3/10;
			skatt = skattTemp1 + skattTemp2;
			System.out.println("Du skal betale " + skatt + " kr i skatt");
		}
	}
}
