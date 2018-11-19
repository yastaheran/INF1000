/** ************************************************************************************************************\
Array metoder som utøferer disse oppgavene: a. bytter første og siste elemnt i arrayen, b. flytter alle elementene et hakk ned og flytter siste element inn i første indeks, c. bytter alle partall med 0, d. bytter hvert element, utenom den første og siste, med et tall to større enn naboene sine, e. fjerne det midterste elementet hvis lengden på arrayen er oddetall, eller de to midterste hvis den er partalltall, f. flytte alle partallene øverst, g. skriv ut det nest høyeste elementet i arrayen, h. returner true hvis arrayen er sortert etter økende rekkefølge, i. returner true hvis arrayen inneholder to like elementer (som er ved siden av hverandre) og j. returner true hvis det er to like elementer i arrayen.
\* *************************************************************************************************************/
public class Array2{
public static void swap(int[] seq, int a_index, int b_index) { 			// A
	int temp = seq[a_index];
	seq[a_index] = seq[b_index];
	seq[b_index] = temp;
}
public static void shift(int[] seq) {						// B
	int last = seq[seq.length - 1];
	System.arraycopy(seq, 0, seq, 1, seq.length - 1);
	seq[0] = last;
}
public static void replace(int[] seq, int replacement) {			// C
	for (int i = 0; i < seq.length; i++) {
		if (seq[i] % 2 == 0) {
		seq[i] = replacement;
		}
	}
}
public static int[] replaceByNeighBours(int[] seq) {				// D
	for (int i = 1; i < seq.length - 1; i++) {
		if (seq[i + 1] > seq[i - 1]) {
			seq[i] = seq[i + 1];
		} else if (seq[i - 1] > seq[i + 1]) {
			seq[i] = seq[i - 1];
		}
	}
	return seq;
}
public static void removeMiddleElement(int[] seq) {				// E
	int middle = seq.length / 2;
	if (seq.length % 2 == 0) {
		for (int i = middle; i < seq.length - 1; i++) {
			seq[i - 1] = seq[i + 1];
		}
		seq[seq.length - 1] = 0;
		seq[seq.length - 2] = 0;
	} else if (seq.length % 2 == 1) {

		for (int i = middle; i < seq.length - 1; i++) {
			seq[i] = seq[i + 1];
		}
		seq[seq.length - 1] = 0;
	}
}
public static void moveEvenElements(int[] seq) {				// F
	int swapPos = 0;
	for (int i = 0; i < seq.length; i++) {
		if (seq[i] % 2 == 0) {
			int temp = seq[swapPos];
                		seq[swapPos] = seq[i];
                		seq[i] = temp;
                		swapPos += 1;
		}
	}
}
public static int secondLargestElement(int[] seq) {				// G
	int largest = seq[0];
	int secondLargest = largest;
	for (int i = 0; i < seq.length; i++) {
		if (seq[i] > largest) {
			int temp = largest;
			largest = seq[i];
			secondLargest = temp;
		}
	}
	return secondLargest;
}
public static boolean isSorted(int[] seq) {					// H
	for (int i = 0; i < seq.length - 1; i++) {
		if (seq[i] > seq[i + 1]) {
			return false;
		}
	}
	return true;
}
public static boolean hasAdjacentDuplicates(int[] seq) {			// I
	for (int i = 0; i < seq.length - 1; i++) {
		if (seq[i] == seq[i + 1]) {
			return true;
		}
	}
	return false;
}
public static boolean hasDuplicateElements(int[] seq) {			// J
	for (int i = 0; i < seq.length; i++) {
		for (int j = 0; j < seq.length; j++) {
			if (i != j && seq[i] == seq[j]) {
				return true;
			}
		}
	}
        return false;
}
