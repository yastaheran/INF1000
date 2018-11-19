/** ************************************************************************************************************\
En metode public static boolean equals(int[] a, int[] b) som sjekker om to arrayer har det samme  elementet i samme rekkefølge.
\* *************************************************************************************************************/
public class ArrayElemtFoelge {
	public static boolean arrayEquals(int[] a, int[] b) {
		if (a.length != a.length) {
			return false;
		}
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
 	}
}
