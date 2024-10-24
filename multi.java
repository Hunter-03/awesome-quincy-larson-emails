import java.util.Scanner;

public class NumberOperations {

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

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Function to check if a number is Harshad
    public static boolean isHarshad(int num) {
        int sum = 0, originalNum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return originalNum % sum == 0;
    }

    // Function to check if a number is Neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Function to calculate factorial
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    // Function to generate Fibonacci sequence up to n terms
    public static void fibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci sequence: " + first + ", " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nNumber Operations Menu:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Check Harshad Number");
            System.out.println("4. Check Neon Number");
            System.out.println("5. Calculate Factorial");
            System.out.println("6. Generate Fibonacci Sequence");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it's prime: ");
                    int primeNum = scanner.nextInt();
                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " is a Prime number.");
                    } else {
                        System.out.println(primeNum + " is not a Prime number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number to check if it's an Armstrong number: ");
                    int armstrongNum = scanner.nextInt();
                    if (isArmstrong(armstrongNum)) {
                        System.out.println(armstrongNum + " is an Armstrong number.");
                    } else {
                        System.out.println(armstrongNum + " is not an Armstrong number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number to check if it's a Harshad number: ");
                    int harshadNum = scanner.nextInt();
                    if (isHarshad(harshadNum)) {
                        System.out.println(harshadNum + " is a Harshad number.");
                    } else {
                        System.out.println(harshadNum + " is not a Harshad number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a number to check if it's a Neon number: ");
                    int neonNum = scanner.nextInt();
                    if (isNeon(neonNum)) {
                        System.out.println(neonNum + " is a Neon number.");
                    } else {
                        System.out.println(neonNum + " is not a Neon number.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a number to calculate its factorial: ");
                    int factNum = scanner.nextInt();
                    System.out.println("Factorial of " + factNum + " is " + factorial(factNum) + ".");
                    break;

                case 6:
                    System.out.print("Enter the number of terms for the Fibonacci sequence: ");
                    int fibTerms = scanner.nextInt();
                    fibonacci(fibTerms);
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }
}
