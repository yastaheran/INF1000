/** ************************************************************************************************************************\
Programmes skal erstatte hver linje av en fil med ordet speilvendt.
\* ************************************************************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReverserOrd {
	public static void main(String[] args) throws FileNotFoundException {
		String filename;
		if (args.length == 1) {
			filename = args[0];
		} else {
			System.out.print("File name: ");
			Scanner console = new Scanner(System.in);
			filename = console.next();
			console.close();
		}
		Scanner fileRead = new Scanner(new File(filename));
		while (fileRead.hasNextLine()) {
            		String line = fileRead.nextLine();
		            line = reverse(line);
            		System.out.println(line);
        		}
        		fileRead.close();
    	}
	public static String reverse(String line) {
		return new StringBuilder(line).reverse().toString();
    	}
}
