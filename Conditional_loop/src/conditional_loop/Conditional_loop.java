//Arnob Barua
//04324205101093

package conditional_loop;
public class Conditional_loop 
{
public static void main(String[] args)
    {
        int i;
        int sum=0;
     for(i=1;i<=10;i++){
         if(i==5)
             continue;
         System.out.println(i +" ");
         sum = sum+i;
     }
     System.out.println("Sum = " +sum);
     
        /*int i;
     for(i=1;i<=10;i++){
         if(i==5)
             continue;
         System.out.println(i);
     }*/
     
        /*int i;
     for(i=-10;i<=10;i++){
         System.out.println(i);
     }*/
     
        /*int i;
     for(i=100;i>=50;i=i-5){
         System.out.println(i);
     }*/
        
     /*int i;
     for(i=10;i<=40;i=i+2){
         System.out.println(i);
     }*/
    }
}
