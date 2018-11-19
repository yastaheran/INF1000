/** ************************************************************************************************************************\
Metoden double smallest(double x, double y, double z) skal returnere den laveste verdien
Metoden double average(double x, double y, double z) skal returnere den gjennomsnittet av verdiene
\* ************************************************************************************************************************/
import static org.junit.Assert.*;
import org.junit.Test;
public DoubleeTest {
	public void smallest_when_x_smallest() {
		assertEquals(5, Doublee.smallest(5, 6, 7), 0);
  }
	public void smallest_when_y_smallest() {
		assertEquals(5, Doublee.smallest(10, 5, 7), 0);
  }
	public void smallest_when_z_smallest() {
		assertEquals(5, P5_01.smallest(10, 9, 5), 0);
	}
	public void smallest_when_x_and_y_smallest() {
		assertEquals(7, Doublee.smallest(7, 7, 9), 0);
	}
	public void smallest_when_x_and_z_smallest() {
		assertEquals(3, Doublee.smallest(3, 5, 3), 0);
	}
	public void smallest_when_y_and_z_smallest() {
		assertEquals(1, Doublee.smallest(5, 1, 1), 0);
	}
	public void average() {
		assertEquals((1 + 2 + 3) / 3, Doublee.average(1, 2, 3), 0.1);
	}
}
