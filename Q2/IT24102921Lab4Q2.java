import java.util.Scanner;

public class IT24102921Lab4Q2 
{
     public static void main (String[] args) 
   {
         Scanner m = new Scanner(System.in);
         System.out.print("please enter exam marks (out of 100): ");
         double examMarks = m.nextDouble();

         if (examMarks<0 || examMarks>100)
         { System.out.println ("Invaild input for exam marks. Terminating program.");
         return; }

         
         System.out.print ("Please enter lab submission marks (out of 100): ");
         double labMarks = m.nextDouble();

         if (labMarks<0 || labMarks>100)
         { System.out.println ("Invaild input for lab submission marks. Terminating program.");
         return; }

         System.out.print ("Please enter the percentage given for the exam: ");
         double examPercentage = m.nextDouble();
         
         System.out.print ("Please enter the percentage given for the lab submission: "); 
         double labPercentage = m.nextDouble();

         if (examPercentage + labPercentage != 100)
         { System.out.println ("The percentage must add up to 100. Terminating ");
         return; }

         double finalMark = (examMarks * examPercentage/100) + (labMarks * labPercentage/100);
         System.out.println ("Final Exam Mark is: " + finalMark);
    }
}