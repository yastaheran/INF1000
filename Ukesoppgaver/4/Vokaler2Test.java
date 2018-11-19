/** ************************************************************************************************************************\
Metoden public static int countVowels(String str) skal returnere antall vokaler i string str.
\* ************************************************************************************************************************/
import static org.junit.Assert.*;
import org.junit.Test;
public class Vokaler2Test {
	public void no_vowels() {
		assertEquals(0, Vokalr2.countVowels("DCTPZXC"));
	}
	public void three_vowels() {
		assertEquals(3, Vokaler2.countVowels("AEGY"));
	}
	public void all_vowels() {
		assertEquals(5, Vokaler2.countVowels("AEIOU"));
	}
}
public class Vokaler2 {
	public static int countVowels(String sentence) {
		int vowels_count = 0;
		for (int i = 0; i < sentence.length(); i++) {
	   		char current_char = Character.toLowerCase(sentence.charAt(i));
	   		if (current_char == 'a' || current_char == 'e' || current_char == ‘o' || current_char == 'i' || 				current_char == 'u' || current_char == 'y') {
				vowels_count += 1;
			}
		}
		return vowels_count;
	}
}
