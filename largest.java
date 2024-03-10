import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Find the biggest number
        int biggest = findBiggest(num1, num2, num3);

        // Display the result
        System.out.println("The biggest number among " + num1 + ", " 
        + num2 + ", and " + num3 + " is: " + biggest);

        // Close the scanner
        scanner.close();
    }

    // Function to find the biggest among three numbers
    public static int findBiggest(int a, int b, int c) {
        int biggest = a;

        if (b > biggest) {
            biggest = b;
        }

        if (c > biggest) {
            biggest = c;
        }

        return biggest;
    }
}
