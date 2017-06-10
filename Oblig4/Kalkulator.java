import java.util.Scanner;
public class Kalkulator {
	public static void main(String[] args) {
		int addSvar = addisjon(3, 4);
		System.out.println(addSvar);
		int subSvar = subtraksjon(5, 2);
		System.out.println(subSvar);
		int helDivSvar = heltallsdivisjon(10, 3);
		System.out.println(helDivSvar);
		double divSvar = divisjon(10, 3);
		System.out.println(divSvar);
	}
//Oppgave A - addisjon
	public static int addisjon(int heltall1, int heltall2) {
		int sum = heltall1 + heltall2;
		return sum;
	}
//Oppgave B - subtraksjon
	public static int subtraksjon(int heltall1, int heltall2) {
		int sum = heltall1 - heltall2;
		return sum;
	}
//Oppgave C - heltallsdivisjon
	public static int heltallsdivisjon(int heltall1, int heltall2) {
		int sum = heltall1/heltall2;
		return sum;
	}
//Oppgave D - divisjon med desimaler
	public static double divisjon(double tall1, double tall2) {
		double sum = tall1/tall2;
		return sum;
	}
}
