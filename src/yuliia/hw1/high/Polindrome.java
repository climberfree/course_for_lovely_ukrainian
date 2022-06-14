package yuliia.hw1.high;


public class Polindrome {

    public static void main(String[] args) {
        System.out.println("----START----");

        System.out.print("Is "+ 1221 + " polindrome? => ");
        System.out.println(isPalindrome(1221));

        System.out.println("-------------");
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revertedInt = 0;  ///1221
        while (x > revertedInt) {
            revertedInt = revertedInt * 10 + x % 10;
            x = x / 10;
        }
        return x==revertedInt || x == revertedInt/10;
    }
}
