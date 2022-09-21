import javax.swing.*;
import java.util.Scanner;

public class NumericSystemsScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input an int number");
        String decimalNumber = scanner.nextLine();
        int decNumber = 0;
        try {
            decNumber = Integer.parseInt(decimalNumber);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Invalid data");
            main(args);
            System.exit(0);
        }

        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber = " + binaryNumber);
        //Converts from binary number to octal number
        System.out.println("Octal number of " + binaryNumber + " = " + Integer.toOctalString(binaryNumber));

        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);
        //Converts from octal number to hexadecimal number
        System.out.println("Hexadecimal number of " + octalNumber + " = " + Integer.toHexString(octalNumber));

        int hexNumber = 0x1F4;
        System.out.println("hexNumber = " + hexNumber);
    }

}
