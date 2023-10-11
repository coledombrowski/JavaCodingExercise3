/* Java Coding Exercise 3 Part 3
   StringBuilder Class
   Fall 2023
   Student: Cole Dombrowski
   Date: September 2023
 */

package dombrowski.cole.jce3;

import javax.swing.JOptionPane;

public class EmailBuilder
{
    public static void main(String[] args)
    {
        String toAddress;
        
        // Create the StringBuilder object
        StringBuilder email = new StringBuilder();

        // Build email header, leaving the "To" field empty for now
        // Note that when we modify the text inside the StringBuilder object,
        // we don't assign the modified contents back to the object like
        // we would with a String. This is because whatever modification made
        // to the StringBuilder object is done in its memory location
        // immediately.
        email.append("To: ");

        // Continue header with "From" field
        // Note the use of escape sequences
        email.append("\nFrom: ITDS (\"itds@unt,edu\")\n");

        // Build subject line
        email.append("Subject: Turn in your JCE\n\n");

        // Continue to build the email body
        email.append("Lorem ipsum dolor sit amet, consectetuer adipiscing\n" +
                "elit. Aliquam tincidunt. Cum sociis natoque penatibus \n" +
                "et magnis dis parturient montes, nascetur ridiculus mus. \n" +
                "Fusce quam urna, ultricies nec, auctor non, vehicula in, \n" +
                "nulla. Aliquam est. Class aptent taciti sociosqu ad \n" +
                "litora torquent per conubia nostra, per inceptos \n" +
                "hymenaeos. Nullam ac diam. Nam congue rutrum sem. \n" +
                "Mauris et ipsum. Cras eu tortor et augue semper \n" +
                "aliquam. Curabitur lacinia.\n");

        // Get recipient email address
        toAddress = JOptionPane.showInputDialog(null,
                "Please enter the name of the recipient.",
                "Email Builder", 3);

        // Insert email address in the right location into "To" field
        email.insert(4, toAddress);

        // Display completed email
        System.out.println(email);
    }
}
