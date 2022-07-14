import java.util.Arrays;
import java.util.Scanner;

public class High {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input integer value");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char[] reverseChars = new char[chars.length];
        reverseInput(chars, reverseChars);
    }

    public static void reverseInput(char[] chars, char[] reverseChars) {
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
            reverseChars[i] = chars[j];
        }
    }

    public static boolean ifPalindrome(char[] chars, char[] reverseChars) {
        return Arrays.equals(chars, reverseChars);
    }
}
