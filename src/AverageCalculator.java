/**
 * @author Titus Murithi Bundi
 */
public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        /* Bug: In the original code, the division was performed using integer division,
        resulting in an incorrect average when total and numbers.length are integers.
         Corrected: Cast 'total' to double before dividing to ensure floating-point division.*/

        double average = (double) total / numbers.length; // Perform floating-point division
        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
