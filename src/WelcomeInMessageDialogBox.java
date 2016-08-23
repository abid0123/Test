import javax.swing.*;//or
//import javax.swing.JOptionPane;//must be there to locate class JOptionPane

/* Example WelcomeInMessageDialogBox.java:
   This application program displays Welcome to Java!
   in a message dialog box. */

public class WelcomeInMessageDialogBox {
    public static void main(String[] args) {
    // Display Welcome to Java! in a message dialog box
        JOptionPane.showMessageDialog(null, "Welcome DCPE 3A/B...all of you!\nDon't be late");
        JOptionPane.showMessageDialog(null, "Have you finished dowloading IDE?");
        JOptionPane.showMessageDialog(null, "YANHUI LIKES BIG DICKS");
     // below is another way to display message with more customized info
     //   JOptionPane.showMessageDialog(null, "Hello", "Welcome", JOptionPane.INFORMATION_MESSAGE);
     //   System.out.print("The info message value: "+JOptionPane.INFORMATION_MESSAGE);
       
       // System.out.println(100);
       // System.out.println(200);
     
        System.exit(0);//needed for JOptionPane.showMessageDialog to release resource
        // Exit the program
        }
}
