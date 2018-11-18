/** ********************************************************\
Et program som leser inn tre ord og sorterer dem alfabetisk.
\* *********************************************************/
import java.util.Scanner;
public class SorterAlfabetisk.java {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String ord1 = " ";
		String ord2 = " ";
		String ord3 = " ";
		System.out.println("Skriv inn tre ord");
		ord1 = sc.next();
		ord2 = sc.next();
		ord3 = sc.next();
		String top = ord1;
		String bottom = ord1;
		if(top.compareTo(ord2) > 0) { 
			top = ord2; 
		} 
		if(top.compareTo(ord3) > 0) { 
			top = ord3; 
		}
		if(bottom.compareTo(ord2) < 0) { 
			bottom = ord2; 
		} 
		if(bottom.compareTo(ord3) < 0)  { 
			bottom = ord3; 
		}
		String middle = " ";
		if( !ord1.equals(bottom) && !ord1.equals(top) ) {
    		middle = ord1; 
		} else if( !ord2.equals(bottom) && !ord2.equals(top) ) {
    		middle = ord2; 
		}  else  {
    		middle = ord3; 
		}
		System.out.println(top); 
		System.out.println(middle); 
		System.out.println(bottom); 
	}
}
