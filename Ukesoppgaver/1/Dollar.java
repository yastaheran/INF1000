import java.util.Scanner;
public class Dollar {//programmet skal skille dollar og cents fra en gitt verdi
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn tre tall, tast Enter etter hvert tall.");
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		double a1 = Double.parseDouble(a);
		double b1 = Double.parseDouble(b);
		double c1 = Double.parseDouble(c);
		if(a1 > b1 && a1 > c1) {
			System.out.println("største tallet er lik " + a1);
		} else if(b1 > a1 && b1 > c1){
			System.out.println("største tallet er lik " + b1);
		} else {
			System.out.println("største tallet er lik " + c1);
		}
	}
}
