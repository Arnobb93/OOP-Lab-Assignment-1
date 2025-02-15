//Arnob Barua
//04324205101093

package full_name_single_scan_and_print_statement;
import java.util.Scanner;
public class Full_name_single_scan_and_print_statement {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String fullname = input.nextLine();
        
        System.out.println("Your full name is : " +fullname);
    }
}
