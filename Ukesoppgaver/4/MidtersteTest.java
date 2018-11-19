/** ************************************************************************************************************************\
Metoden public static String middle(String str) skal returnere en string med den midterste karakteren i str hvis lengden på str er ulike, eller de to midterste karakterene hvis lengden er lik.
\* ************************************************************************************************************************/
import static org.junit.Assert.*;
import org.junit.Test;
public class MidtersteTest {
	public void oddSentence() {
		assertEquals("t", Midterste.middle("str"));
	}
	public void evenSentence() {
		assertEquals("dd", Midterste.middle("middle"));
	}
}
public class Midterst {
	public static String middle(String sentence) {
		String output = " ";
		int sentence_middle = sentence.length() / 2;
		if (sentence.length() % 2 == 0) {
			output = sentence.substring(sentence_middle - 1, sentence_middle + 1);
		} else {
			output = sentence.substring(sentence_middle, sentence_middle + 1);
		}
		return output;
	}
}
