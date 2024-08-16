import java.util.Scanner;

public class IT24102921Lab4Q1 
{
     public static void main (String[] args) 
   {
         Scanner m = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = m.nextInt();

         {if (number>0)
          System.out.println ("The number is Positive" );
          else if (number<0)
          System.out.println ("The number is Negative" );
          else
          System.out.println ("The number is zero" );}
          
    }
}