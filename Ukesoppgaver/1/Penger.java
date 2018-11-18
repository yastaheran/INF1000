public class Penger {	//programmet skal skille dollar og cents fra en gitt verdi
	public static void main(String[] args) {
		double dollar = 2.95;
		double Cent = (dollar - 2 + 0.5)*100;
		double dollarUtenCent = dollar - 0.95;
		double dollar2 = 4.35;
		double Cent2 = (dollar2 - 4 + 0.5)*100;
		double dollarUtenCent2 = dollar2 - 0.35;
		System.out.println("Dollar = " + (dollarUtenCent) + "\t" + "Cents = " + Cent);
		System.out.println("Dollar = " + (dollarUtenCent2) + "\t" + "Cents = " + Cent2);
	}
}
