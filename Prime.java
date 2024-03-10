import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the range of numbers
        System.out.println("Enter the starting number of the range:");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number of the range:");
        int end = scanner.nextInt();
        // Display the prime numbers in the given range
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        // Close the scanner
        scanner.close();
    }
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

