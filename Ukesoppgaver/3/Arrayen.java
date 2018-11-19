/** **************************************************************************************************************\
Et program som lager en array med ti tilfeldige integers og som printer ut alle tallene med partall som index, alle partall, alle elementene i baklengs rekkefølge, og bare første og siste elementet i arrayen.
\* ***************************************************************************************************************/
public class Arrayen {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random() * 100 + 1);
		}
		System.out.println("Every even index element:");
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println("Every even element:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
			System.out.println(numbers[i]);
			}
		}
		System.out.println("All elements in reverse order:");
		for (int i = numbers.length - 1; i > -1; i--) {
			System.out.println(numbers[i]);
		}
        		System.out.println("First and last element: " + numbers[0] + « and » + numbers[numbers.length 		- 1] );
	}
}
