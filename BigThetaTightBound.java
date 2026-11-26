public class BigThetaTightBound {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int sum = 0;
        int operations = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            operations++;
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Array size (n): " + numbers.length);
        System.out.println("Operations performed: " + operations);
    }
}