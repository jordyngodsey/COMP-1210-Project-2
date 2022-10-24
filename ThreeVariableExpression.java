import java.util.Scanner;
/**
 * A program that finds the result of a specified expression after reading
 * input values for x, y, and z.
 *
 * Project 2
 * @author Jordyn Godsey - COMP 1210 - 007
 * @version 1/28/22
 */
public class ThreeVariableExpression
{
   /**
   * Calculates the result of an expression from input values x, y, z.
   *
   *@param args Command Line Arguments
   */
   public static void main(String[] args)
   {
      // Declare variables x, y, z, and result
      Scanner userInput = new Scanner(System.in);
      double x = 0, y = 0, z = 0, result = 0;
      
      // Print the expression used to determine result
      System.out.println("result = (3.5x - 7.75) (2.85y + 6.0) (1.5z - 3.1) "
               + "/ xyz");
               
      // Get input for x, y, and z
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      System.out.print("\tz = ");
      z = userInput.nextDouble();
   
      // Calculate the result if xyz is not 0.
      if (x * y * z != 0) {
         result = (3.5 * x - 7.75) * (2.85 * y + 6.0) * (1.5 * z - 3.1)
                  / (x * y * z);
         System.out.println("result = " + result);
      }
      else { // Print result is undefined
         System.out.println("result is \"undefined\"");
      }
   }
}