/** ************************************************************************************************************************\
Programmet skal åpne 1 fil, lagre 1 melding, lukke, åpne filen, skrive meldingen inn i 1 string og skrive den ut.
\* ************************************************************************************************************************/
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Filen {
	public static void writeToFile(String filename) throws FileNotFoundException {
		try (PrintWriter outputFile = new PrintWriter(filename)) {
			outputFile.println("Hello, World!");
		} catch (FileNotFoundException exception) {
			System.out.println("File not found!");
		}
	}
	public static void printFileContents(String filename) {
		Scanner inputFile = new Scanner(filename);
		String contents = inputFile.nextLine();
        		inputFile.close();
		System.out.println(contents);
	}
}
