import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Titus Murithi Bundi
 */
public class GetLargestDifference {
    public static void main(String[] args) {
        // Example usage
        List<Integer> numbers = List.of(1, 9, 3, 7);
        int result = largestDifference(numbers);
        System.out.println("Largest Difference: " + result); // Output: 8
    }

    // Function to calculate the largest difference between any two numbers in the input list
    public static int largestDifference(List<Integer> numbers) {
        // Return 0 if the list has less than two elements
        if (numbers == null || numbers.size() < 2) {
            return 0;
        }

        // Create a mutable copy of the input list
        List<Integer> mutableList = new ArrayList<>(numbers);

        // Sort the mutable list to get the minimum and maximum values
        Collections.sort(mutableList);

        // Calculate the largest difference
        int min = mutableList.get(0);
        int max = mutableList.get(mutableList.size() - 1);
        return max - min;
    }

}
