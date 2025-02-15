//Arnob Barua
//04324205101093

package user_input;
import java.util.Scanner;
public class User_input 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
      System.out.println("Enter numbers : ");
      int x = input.nextInt();
      int y = input.nextInt();
      System.out.println("Before swap : " +x +" " +y);
      int swap = x;
      x = y;
      y = swap;
        System.out.println("After swap " +x +" " +y);
    }
}
