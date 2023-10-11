/* Java Coding Exercise 3 Part 1
   String and Primitive Types
   Fall 2023
   Student: Cole Dombrowski
   Date: September 2023
 */

package dombrowski.cole.jce3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProcessConsole
{
    public static void main(String[] args)
    {
      String countInput;
      int countValue;
      double totalBonus = 20000.00;
      double bonusPerCap;
      DecimalFormat df = new DecimalFormat("#,##0.00");
        
      // Get the string to compare
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter number of salespeople: ");
      countInput = kb.nextLine();
      
      // Check whether input is string
      if (countInput instanceof String)
      {
          System.out.println("The variable countInput, which contains "
                  + countInput + ", is a String.");
      }
      else
      {
          System.out.println("The variable countInput, which contains "
                  + countInput + ", is NOT a string.");
      }
        
      // Convert input into integer
      countValue = Integer.parseInt(countInput);        
      // Perform mathematic operation on the input
      bonusPerCap = totalBonus/countValue;
        
      // Display result of calculation
      System.out.println("Total bonus available is $" + df.format(totalBonus));
      System.out.println("Bonus per salesperson is $" + df.format(bonusPerCap));
    }
}
