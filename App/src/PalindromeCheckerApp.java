import java.util.*;

public class PalindromeCheckerApp {

    // Algorithm 1: Reverse String
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Algorithm 2: Stack Method
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Algorithm 3: Two Pointer Method
    public static boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Two Pointer Method
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Two Pointer Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}