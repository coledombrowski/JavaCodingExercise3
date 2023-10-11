/* Java Coding Exercise 3 Part 2
   String and Primitive Types
   Fall 2023
   Student: Cole Dombrowski
   Date: September 2023
 */

package dombrowski.cole.jce3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/* JOptionPane constants
   1 = INFORMATION_MESSAGE
   2 = ERROR_MESSAGE
   3 = QUESTION_MESSAGE
 */

public class ProcessGUI
{
    public static void main(String[] args)
    {
        String weightInput;
        double weightValue;
        double grams;
        String gramsString;
        int numOfDigits;
        String digitString;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Get user input through GUI dialog box
        weightInput = JOptionPane.showInputDialog(null,
                    "Enter the weight in pounds", "JCE", 3);

        // Check whether input is string
        if (weightInput instanceof String)
        {
            JOptionPane.showMessageDialog(null,
                     "The variable weight input, which contains " + weightInput
                     + ", is a string", "JCE", 1);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                     "The variable weight input, which contains " + weightInput
                     + ", is NOT a string", "JCE", 1);
        }

        // Convert the input into numeric value
        weightValue = Double.parseDouble(weightInput);

        // Perform mathematic operation on the input
        grams = weightValue * 453.592;

        // Convert calculation result to string
        gramsString = String.valueOf(grams);

        // Find and report the number of digits after the decimal point
        numOfDigits = gramsString.substring(gramsString.indexOf('.')+1).length();
        if (numOfDigits == 1)
        {
            digitString = numOfDigits + "1 digit";
        }
        else
        {
            digitString = numOfDigits + " digits";
        }
        JOptionPane.showMessageDialog(null,
                "The grams figure " + grams + " has " + digitString +
                "after the decimal point.", "JCE", 1);
        // Display result of calculation
        JOptionPane.showMessageDialog(null,
        weightInput + " lbs = " + df.format(grams) + " grams (rounded)",
        "JCE", 1);
    }
}
