/** ************************************************************************************************************************\
Programmet skal ha følgende metoder: boolean allTheSame(double x, double y, double z), returnere true hvis alle er like, boolean allDifferent(double x, double y, double z), returnere true hvis alle er forskjellige, boolean sorted(double x, double y, double z), returnere true hvis alle er sortet etter største 
\* ************************************************************************************************************************/
import static org.junit.Assert.*;
import org.junit.Test;
public class BooleanTest {			//tester motioned
	public void allTheSame_true() {
		assertTrue(Boolean.allTheSame(1, 1, 1));
	}
	public void allTheSame_false() {
		assertFalse(Boolean.allTheSame(3, 4, 5));

    	}
	public void allDifferent_two_same() {
		assertFalse(Boolean.allDifferent(5, 5, 4));
   	}
	public void allDifferent_true() {
		assertTrue(Boolean.allDifferent(1, 3, 5));
	}
   	public void sorted_false() {
		assertFalse(Boolean.sorted(5, 6, 2));
	}
	public void sorted_true() {
		assertTrue(Boolean.sorted(3, 2, 1));
	}
}
public class Boolean{
	public static boolean allTheSame(double x, double y, double z) {
		return x == y && y == z;
	}
	public static boolean allDifferent(double x, double y, double z) {
		return x != y && x != z && y != z;
	}
	public static boolean sorted(double x, double y, double z) {
		return ((x > y && y > z) || (x >= y && y > z));
	}
}
