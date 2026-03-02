import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("=====================================");
        System.out.println("UC9: Recursive Palindrome Checker");
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleaned, 0, cleaned.length() - 1)) {
            System.out.println("✅ \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program execution completed.");
        sc.close();
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}