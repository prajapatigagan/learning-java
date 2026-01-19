public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        // Base Cases
        if (n <= 1) {
            return n;
        }
        // Recursive Calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}