/** ***************************************************************************************************************\
Programmet skal gjøre om 1, 2, 3, … , 12 om til månedene Januar, Februar, Mars, … , Desember.
\* *************************************************************************************************************/
import java.util.Scanner;
public class Maanedene {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(«Maaned (i tall): ");
        int maaned = in.nextInt();
        String maaned_navn = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        String maaned_txt = maaned_navn.substring((maaned - 1) * 9, maaned * 9);
        System.out.println(maaned_txt);
    }
}
