import java.util.Scanner;

public class IT24102921Lab4Q3 
{
     public static void main (String[] args) 
   {
         Scanner m = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = m.nextInt();

         String result = (number>0)? "positive": (number<0)? "Negative": "Zero";
         System .out.println("The number is: " + result);
          
    }
}