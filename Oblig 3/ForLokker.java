public class ForLokker {
	public static void main(String[] args) {	
		final int maxTall = 10;
		int sum = 0;
//Oppgave A
		for (int tall = 0; tall <= maxTall; tall += 2) {
			System.out.println(tall);
		}
		System.out.println("\n");		
//Oppgave B
		for (int tall2 = 0; tall2 <= maxTall; tall2 += 2) {
			sum += tall2;
		}
		System.out.println("Summen av alle partall fra 0 til 10 er " + sum + "\n");
		sum = 0;
//Oppgave C
		for (int tall3 = 1; tall3 <= maxTall; tall3 +=2 ) {
			sum += tall3;
		}
		System.out.println("Summen av alle oddetall fra 0 til 10 er " + sum);
	}
}
