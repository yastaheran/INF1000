/** ***************************************************************************************************************\
Et program som setter artiklene le, la les og l' foran franske navn på verdenslandene.
\* ****************************************************************************************************************/
import java.util.Scanner;
public class LandenePaaFransk {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Country: ");
	String country = input.next();
	boolean vowel = false;
	boolean plural = false;
	boolean feminine = false;
	char first_letter = country.charAt(0);
	if (country.equals("Etats-Unis") || country.equals("Pays-Bas")) {
	    plural = true;
	} else if (first_letter == 'a' || first_letter == 'A'
		|| first_letter == 'e' || first_letter == 'E'
		|| first_letter == 'i' || first_letter == 'I'
		|| first_letter == 'o' || first_letter == 'O'
		|| first_letter == 'u' || first_letter == 'U') {
	    vowel = true;
	} else if (!(country.equals("Belize") || country.equals("Cambodge")
		|| country.equals("Mexique") || country.equals("Mozambique")
		|| country.equals("Zaïre") || country.equals("Zimbabwe"))) {
	    if (country.charAt(country.length() - 1) == 'e') {
		feminine = true;
	    }
	}
	if (vowel) {
	    country = "l’" + country;
	} else if (plural) {
	    country = "les " + country;
	} else if (feminine) {
	    country = "la " + country;
	} else {
	    country = "le " + country;
	}
	System.out.println(country);
    }
}
