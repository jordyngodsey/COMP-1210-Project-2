import java.util.Scanner;
/**
 * A program that determines the number of bills to be dispensed from an ATM by
 * denomination ($20, $10, $5, and $1 bills).
 *
 * Project 2
 * @author Jordyn Godsey - COMP 1210 - 007
 * @version 1/28/22
 */
public class ATM
{
   /**
   * Determine the number bills by denomination ($20, $10, $5, and $1 bills).
   *
   *@param args Command Line Arguments
   */
   public static void main(String[] args)
   {
      /* Declare variables for initial amount of cash in whole dollars, each
       * bill by denomination, and remaining balance.
       */
      Scanner userInput = new Scanner(System.in);
      int initialAmount, twenties, tens, fives, ones, remainder;
      
      // Get input for initial amount
      System.out.print("Enter the amount: ");
      initialAmount = userInput.nextInt();
      
      if (initialAmount > 500) { //Check if initial amount exceeds limit
         System.out.println("Limit of $500 exceeded!");
      }
      else { //Display number of bills by denomination
         System.out.println("Bills by denomination:");
         
         // Calculate amount of $20 bills
         twenties = initialAmount / 20;
         remainder = initialAmount % 20;
         System.out.println("\t$20: " + twenties);
         
         // Calculate amount of $10 bills
         tens = remainder / 10;
         remainder = remainder % 10;
         System.out.println("\t$10: " + tens);
         
         // Calculate amount of $5 bills
         fives = remainder / 5;
         remainder = remainder % 5;
         System.out.println("\t$5: " + fives);
         
         // Calculate amount of $1 bills
         ones = remainder;
         System.out.println("\t$1: " + ones);
         
         // Display calculation of separate bills into initial amount
         System.out.println("$" + initialAmount + " = (" + twenties
                     + " * $20) + (" + tens + " * $10) + (" + fives
                     + " * $5) + (" + ones + " * $1)");
         
      }
   }
}