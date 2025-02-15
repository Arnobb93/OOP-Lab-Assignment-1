//Arnob Barua
//04324205101093

package user_input2;
import java.util.Scanner;
public class USer_input2 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
      System.out.println("Enter numbers : ");
      int x = input.nextInt();
      int y = input.nextInt();
      int z = input.nextInt();
      System.out.println("Sum : " +(x+y+z));
      float avg = (float) (x+y+z)/3;
        System.out.printf("Average : %.2f", avg);
    }
}
