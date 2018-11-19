/** ************************************************************************************************************************\
Programmet skal lete etter stavefeil, er et ord stavet feil skal den lete etter ordet i ordboken til linux i filen /user/share/dict/words og finnes ikke ordet i filen skal programmet skrive ut en liste med alle ordene som ikke ligger i filen.
\* ************************************************************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
public class OrdbokSoek{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("File to spellcheck: ");
		String fileToRead = console.next();
		console.close();
		HashSet<String> fileWords = wordSet(fileToRead);
		HashSet<String> dictionary = dictionarySet();
		spellcheck(fileWords, dictionary);
	}
	public static HashSet<String> wordSet(String filename) throws FileNotFoundException {
		Scanner fileRead = new Scanner(new File(filename));
        		HashSet<String> words = new HashSet<String>();
        		while (fileRead.hasNext()) {
            		String word = fileRead.next();
            		words.add(word);
        		}
        		fileRead.close();
        		return words;
    	}
	public static HashSet<String> dictionarySet() throws FileNotFoundException {
        		Scanner dictionaryRead = new Scanner(new File("~/usr/share/dict/words"));
        		HashSet<String> dictionary = new HashSet<String>();
       		while (dictionaryRead.hasNext()) {
            		String word = dictionaryRead.next();
            		dictionary.add(word);
        		}
		dictionaryRead.close();
		return dictionary;
   	}
	public static void spellcheck(HashSet<String> words, HashSet<String> dictionary) throws 		FileNotFoundException {
        		for (String word : words) {
            		if (!dictionary.contains(word)) {
                			System.out.println(word);
            		}
        		}
    	}
}
