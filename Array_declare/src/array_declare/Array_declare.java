//Arnob Barua
//04324205101093

package array_declare;
import java.util.Scanner;
public class Array_declare 
{
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        System.out.println("Enter = ");
        int a = input.nextInt();
        int resultArray[] = new int [a];
        resultArray[0]=15;
        resultArray[1]=70;
        
        System.out.println("Marks of first subject : " +resultArray[0]);
        System.out.println("Marks of second subject : " +resultArray[1]);
        
        
        
        /*int a = input.nextInt();
        int resultArray[] = new int [a];
        int i;
        int sum = 0;
        
        for(i=1;i<=a;i++){
            System.out.printf("Enter a number = ", i);
            int num = input.nextInt();
            System.out.println(num);
            sum = sum + num;
        }
            System.out.println("Sum = " +sum);*/
    }
    
}
