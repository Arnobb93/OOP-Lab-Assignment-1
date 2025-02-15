//Arnob Barua
//04324205101093

package user_input_string_count_occururence;
import java.util.Scanner;
public class User_input_string_count_occururence {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println("Enter string : ");
       String x = input.nextLine();
    
      Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
      int count = 0;
	    for (int i=0; i < x.length(); i++)
	    {
	        if (x.charAt(i) == ch)
	        {
	             count++;
	        }
	    }
		System.out.println("occurrence of character : "+count);	
    }
}
