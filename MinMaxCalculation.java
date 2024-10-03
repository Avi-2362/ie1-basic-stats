import java.math.BigInteger;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        
        // Length of the array (number of inputs)
        System.out.println("Enter the number of integers: ");
        int length = scanner.nextInt();
        
        // Initialize an array
        BigInteger[] numbers = new BigInteger[length];
        
        // Prompt to input numbers one by one
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextBigInteger();
        }
        
        // Find the minimum and maximum
        BigInteger min = findMin(numbers);
        BigInteger max = findMax(numbers);
        
        // Display the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        scanner.close();
    }

    // Minimum number
    public static BigInteger findMin(BigInteger[] numbers) {
        BigInteger min = numbers[0];
        for (BigInteger num : numbers) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }

    // Maximum number
    public static BigInteger findMax(BigInteger[] numbers) {
        BigInteger max = numbers[0];
        for (BigInteger num : numbers) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
}

