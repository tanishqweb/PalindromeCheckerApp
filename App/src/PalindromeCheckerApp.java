import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("=====================================");
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println("✅ \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("-------------------------------------");
        System.out.println("Program execution completed.");
        sc.close();
    }
}