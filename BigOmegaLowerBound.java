public class BigOmegaLowerBound {
    public static void main(String[] args) {
        int[] numbers = {15, 28, 34, 49, 53, 67, 71, 86, 92, 100};

        // Set the first element as the number to search for (Best Case)
        int target = numbers[0];
        int operations = 0;

        for (int i = 0; i < numbers.length; i++) {
            operations++;
            if (numbers[i] == target) {
                System.out.println("Best-case match! Found " + target + " at index " + i + ".");
                break;
            }
        }

        System.out.println("Array size (n): " + numbers.length);
        System.out.println("Operations performed: " + operations);
    }
}