public class NegativeTall {
	public static void main(String[] args) {
		int[] arrayTall = {1,4,5,-2,-4,6,10,3,-2};
		int antallNeg = 0;
		int sumAntall = 0;		
//Oppgave A
		for(int i = 0; i < arrayTall.length; i++){
			if (arrayTall[i] < 0){
				antallNeg = 1;
				sumAntall += antallNeg;
			}
		}
		System.out.println("det er " + sumAntall + " negativetall i arrayen");
//Oppgave B
		int i = 0;
		while(arrayTall.length < 0) {
			arrayTall[i] = i;
		}
		System.out.println("det er " + sumAntall + " negativetall i arrayen");
//Oppgave C
		for (int i = 0; i < arrayTall.length; i++)  {
			if (arrayTall|[i] < 0)  {
				arrayTall[i] = i;
			}
		}	
	}
}
