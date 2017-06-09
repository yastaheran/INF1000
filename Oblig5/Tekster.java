public class Tekster {
	public static void main(String[] args) {
//Oppgave A
		String tekst = "Agnes i senga";				//leser bare setningen rett frem
		char[] ch = tekst.toCharArray();
		for(int i = 0; i >= ch.length; i++){				//skal lese setningen baklengs
			tekst += ch[i];						// se trix oppgaver uke 3
		}
		System.out.println(tekst);
//Oppgave B
		String nr1 = "INF1000";
		String nr2 = "inf1000";
		if (nr1.equals(nr2)) {
			System.out.println("De er like");
		} else {
			System.out.println("De er ikke like»);
		}
//Oppgave C
		String str = "INF1100INF1000INF1010";
		String inf = str.substring(7,14);
		System.out.println(inf);
	}
}
