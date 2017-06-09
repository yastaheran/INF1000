import java.util.*;
import java.io.File;
/** I denne oppgaven skal programmet lese filen,tall.txt, summere alle tallene i filen og til slutt printe ut 
 * summen. */
public class MinOppgave4 {
	public static void main(String[] args) throws Exception {
		Scanner fil = new Scanner(new File("tall.txt"));
       			 filLeser(fil);
	}
	static void filLeser(Scanner fil) {
		 int linje = 0;         
	   	 int sum = 0;          
	     	while(fil.hasNext()) {       
	    		 int nextInt = fil.nextInt();          
	    	 	//System.out.println(nextInt);             
	         		sum = sum + nextInt;
	        		 linje++;         
	        	} 
	    	System.out.println("Summen av tallene i filen er " + sum);
	}
}
