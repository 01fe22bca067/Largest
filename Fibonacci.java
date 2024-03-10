import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of terms for Fibonacci series
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n = scanner.nextInt();
        // Display the Fibonacci series
        System.out.println("Fibonacci Series for " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        // Close the scanner
        scanner.close();
    }
    // Function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}