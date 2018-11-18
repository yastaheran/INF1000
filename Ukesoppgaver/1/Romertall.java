/** ***********************************************************************\
Et program som konverter et tall om til et romertall. 
Bare tall opp til 3999. Programmet skal klare å konverte 1978 til MCMLXXVIII
\* *************************************************************************/
import java.util.Scanner;
public class Romertall{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Integer number (1-4000): ");
		int number = input.nextInt();
		String roman = "";
		if (number < 1) {
	    		System.out.println("Number must be an integer between 1 and 4000");
	    		return;
		}
		int digit = number / 1000;
		if (digit == 3) {
	    		roman = "MMM";
		} else if (digit == 2) {
	    		roman = "MM";
		} else if (digit == 1) {
	    		roman = "M";
		}
		digit = (number % 1000) / 100;
		if (digit == 9) {
	    		roman += "CM";
		} else if (digit == 4) {
	    		roman += "CD";
		} else {	    
	    		if (digit >= 5) {
    	    			roman += "D";
    	    			digit -= 5;
	    		}
	    		if (digit == 3) {
    	    			roman += "CCC";
	    		} else if (digit == 2) {
        				roman += "CC";
	    		} else if (digit == 1) {
				roman += "C";
	    		}
		}
		digit = (number % 100) / 10;
		if (digit == 9) {
	    		roman += "XC";
		} else if (digit == 4) {
	    		roman += "XL";
		} else {
	    		if (digit >= 5) {
				roman += "L";
				digit -= 5;
	    		}
	    		if (digit == 3) {
				roman += "XXX";
	    		} else if (digit == 2) {
				roman += "XX";
	    		} else if (digit == 1){
				roman += "X";
	    		}
		}
		digit = number % 10;
		if (digit == 9) {
	    		roman += "IX";
		} else if (digit == 4) {
	    		roman += "IV";
		} else {
	    		if (digit >= 5) {
				roman += "V";
				digit -= 5;
	    		}
	    		if (digit == 3) {
				roman += "III";
	    		} else if (digit == 2) {
				roman += "II";
	    		} else if (digit == 1) {
				roman += "I";
	    		}
		}
		System.out.println("Roman numeral: " + roman);
	}
}
