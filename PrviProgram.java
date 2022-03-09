import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class PrviProgram {
    public static void main(String [] args){
        System.out.print("Unesi broj ");
        Scanner moje = new Scanner(System.in);
        String s = moje.nextLine();

        int n = Integer.parseInt(s);
        System.out.print("rezultat je ");
        System.out.println(n*(n+1)/2);
    }
}
