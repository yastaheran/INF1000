public class SjekkLikeTall{ //programmet skal lese tre tall og sjekke om alle er like, forskjellige eller ingen av delene
	public stativ void main(String[] args) {
		int tall1 = 3;
		int	tall2 = 2;
		int tall3 = 3;
		
		if(tall1 == tall2 && tall1 == tall3	) {
			System.out.println("De er alle like");
		} else if(tall1 == tall2 || tall1 == tall3 || tall2 == tall3) {
			System.out.println("Det er to like tall");
		} else {
			System.out.println("Alle er forksjellige");
		}
	}
}
