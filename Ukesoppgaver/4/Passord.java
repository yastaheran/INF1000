/** ************************************************************************************************************************\
Programmet skal validere et nytt passord som skal følge disse reglene: minst 8 karakterer, minst 1 storbokstav og minst 1 litenbokstav, minst 1 tall. Programmet skal spørre 2 ganger for passordet for å bekrefte passordet. Hvis passordene ikke er like, eller reglene ikke er fulgt, må brukeren prøve igjen.
\* ************************************************************************************************************************/
public class Passord {
	public static boolean checkLength(String password) {
		return password.length() > 8;
	}
	public static boolean hasUppercaseAndLowercase(String password) {
        		boolean uppercase = false;
        		boolean lowercase = false;
        		for (int i = 0; i < password.length(); i++) {
           			if (Character.isUpperCase(password.charAt(i))) {
               			uppercase = true;
            		} else if (Character.isLowerCase(password.charAt(i))) {
                			lowercase = true;
            		}
		}
        		if (lowercase == true && uppercase == true) {
           	 		return true;
        		}
        			return false;
    	}
	public static boolean hasDigit(String password) {
        		for (int i = 0; i < password.length(); i++) {
            		if (Character.isDigit((password.charAt(i)))) {
                			return true;
            		}
        		}
        		return false;
    	}
	public static boolean passwordsMatch(String input, String expected) {
		return input == expected;
	}
}
