import java.util.Scanner;

public class BigOUpperBound {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 44, 51, 63, 78, 82, 90, 99};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        int operations = 0;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            operations++;
            if (numbers[i] == target) {
                found = true;
                System.out.println("Number " + target + " found at index " + i + ".");
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " was NOT found in the array.");
        }

        System.out.println("Array size (n): " + numbers.length);
        System.out.println("Operations performed: " + operations);
        scanner.close();
    }
}