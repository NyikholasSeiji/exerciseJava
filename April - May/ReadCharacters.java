// Exercise about reading and manipulating characters and strings

import java.util.Scanner;
//import javax.swing.JOptionPane; (other option to do)

public class ReadCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        //char letter1 = sc.nextLine().charAt(0);
        String s = sc.nextLine();
        char letter1 = s.charAt(0);

        System.out.println("\nYou entered: " + letter1);

        System.out.print("\nEnter another letter: ");

        s = sc.nextLine();
        char letter2 = s.charAt(0);

        System.out.println("\nYou entered: " + letter2);

        //s = JOptionPane.showInputDialog("Enter another letter"); (other option to do)
        //char letter2 = s.charAt(0);
        //JOptionPane.showMessageDialog(null, "Another letter = " + letter2);

        System.out.print("\nEnter a word: ");
        s = sc.nextLine();
        
        char lastLetter = s.charAt(s.length() - 1);
        System.out.println("\nThe last letter is: " + lastLetter);

        sc.close();
    }
}