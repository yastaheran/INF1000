/** *********************************************************************************************************************\
Gitt tre heltallsvariable, a, b og c. Sjekk om de har felles siste siffer, og skriv eventuelt ut disse til skjerm.
\* *********************************************************************************************************************/
public class SisteSiffer {
	public static void main(String[] args) {
		int a = 23;
		int b = 432;
		int c = 93;
		int lastA = a % 10;
       		int lastB = b % 10;
        		int lastC = c % 10;
        		if (lastA == lastB) { 
            		System.out.println(a + " og " + b + " har samme siste siffer");
        		}
       		if (lastB == lastC) { 
            		System.out.println(b + " og " + c + " har samme siste siffer");
       		}
    		if (lastA == lastB) { 
            		System.out.println(a + " og " + c + " har samme siste siffer");
      		}
	}
}
