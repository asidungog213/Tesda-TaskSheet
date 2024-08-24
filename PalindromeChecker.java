  import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Madam, Level, Radar");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();
        String reversedString = reversed.toString();

        if (input.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}