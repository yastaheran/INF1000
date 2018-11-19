public class Doublee{
	public static double smallest(double x, double y, double z) {
		return ((x <= y && x < z) || (x < y && x <= z))? x :(y < x && y < z)? y: z;
	}
	public static double average(double x, double y, double z) {
		return (x + y + z) / 3;
   	}
}
