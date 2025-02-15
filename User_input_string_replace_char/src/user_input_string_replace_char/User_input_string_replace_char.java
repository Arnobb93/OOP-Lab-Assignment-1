//Arnob Barua
//04324205101093

package user_input_string_replace_char;
import java.util.Scanner;
public class User_input_string_replace_char {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.println("Enter string : ");
       String x = input.nextLine();
       
       Scanner input1 = new Scanner(System.in);
      System.out.println("Enter index : ");
       int y = input1.nextInt();
       
       Scanner input2 = new Scanner(System.in);
      System.out.println("Enter character : ");
       char ch = input2.next().charAt(0);
       
       StringBuilder string = new StringBuilder(x);
        string.setCharAt(y,ch);
 
        System.out.println("Modified String = " + string);
    }  
}
