//Arnob BArua
//04324205101093

package user_input_array_finding;
import java.util.Scanner;
  public class User_input_array_finding {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int a[]=new int[10];
      System.out.println("Enter ten elements in an array : ");
      int f=0;
      for(int i=0;i<10;i++)
      {
      a[i]=sc.nextInt();
      }
      System.out.println("Enter number to be searched : ");
      int n = sc.nextInt();
      for(int j=0;j<10;j++)
      {
        if (n == a[j])
         {
           f = 1;
           break;
         }
      }
        if(f == 1)
      System.out.println("Number found");
        else
      System.out.println("Number not found");
    }
}
