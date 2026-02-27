public class TaskSevenMathDemo {

    //task a --> min method - returns the smallest of two integers
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    //task b --> max method - returns the largest of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //task c --> sum method - returns the sum of all elements in an array
    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    //task d --> mean method - returns the average of all elements in an array
    public static float mean(int[] args) {
        if (args.length == 0) {
            return 0; // or throw an exception for empty array
        }
        return (float) sum(args) / args.length;
    }

    //task e --> factorial method - returns the factorial of n (n!)
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //the method "Main" to test the MathDemo class
    public static void main(String[] args) {
        System.out.println("Testing MathDemo methods:");
        System.out.println("min(10, 5): " + min(10, 5));
        System.out.println("max(10, 5): " + max(10, 5));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("sum of [1,2,3,4,5]: " + sum(numbers));
        System.out.println("mean of [1,2,3,4,5]: " + mean(numbers));

        System.out.println("factorial(5): " + factorial(5));
        System.out.println("factorial(0): " + factorial(0));
    }
}

//task f --> We do not need to create objects,
// which makes it more memory efficient and less complex in Big O in both time and space complexity.
// It makes the code more readable, and does not have any negative effect such as security and safety issues.