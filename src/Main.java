import java.util.Scanner;

/*
The application prompts the user to enter an integer between 1 and 100
Display the associated result based on the integer range entered

I know the program breaks down the classification of odds more than is indicated but it would be an easy change
to do that and I was going for clarity.
 */

public class Main {

    public static void main(String[] args) {
        char cont;

        Scanner scnr = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 and 100: ");
            int uInput = scnr.nextInt();

            String output;

            if (uInput > 0 && uInput < 101) { // first check of user input

                if (uInput < 26) {
                    if (uInput % 2 == 0) { //25 or less and tests for even
                        output = "Even and less than 25";
                    } else {//25 or less and odd
                        output = "Odd and less than 25";
                    }
                } else if (uInput < 61) {//more than 61 less than 100
                    if (uInput % 2 == 0) { //25 or more and tests for even
                        output = "Even and between 25 and 60";
                    } else {//61 or more  and odd
                        output = "Odd and between 25 and 60";
                    }
                } else { // Number greater than 60 and less than 100
                    if (uInput % 2 == 0) { //25 or more and tests for even
                        output = "Even and greater than 100";
                    } else {//61 or more  and odd
                        output = "Odd and greater than 100";
                    }
                }
                System.out.println(output); // Output line
            } else {
                System.out.println("Input outside bounds of 1-100"); // condition if user input isn't between 1 and 100
                }
            System.out.println("Do you want to continue? Please use y or n");
            cont = scnr.next().charAt(0);

        } while (cont != 'n');

    } // main
} //class