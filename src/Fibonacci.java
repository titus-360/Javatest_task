import java.util.Scanner;

/**
 * @author Titus Murithi Bundi
 */
public class Fibonacci {


    public static void main(String[] args) {
        //This creates a scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the number of fibonacci elements to be generated: ");

        // This is to validate the user input to make sure that it is a positive integer.
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next(); // Consume the invalid input
        }

        int number = scanner.nextInt();

//Check if the number is positive.
        if (number <= 0) {

            // Print a message indicating the range of the Fibonacci sequence
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Call the generateFibonacci method to generate and print the Fibonacci sequence
            System.out.println("Fibonacci Sequence up to " + number + " numbers:");
            generateFibonacci(number);
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Method to generate and print the Fibonacci sequence up to the specified number
    private static void generateFibonacci(int number) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");

        // Generate the Fibonacci sequence using a loop
        for (int i = 2; i < number; i++) {
            int nextFibonacci = first + second;
            System.out.print(nextFibonacci + " ");
            first = second;
            second = nextFibonacci;
        }
    }


}
