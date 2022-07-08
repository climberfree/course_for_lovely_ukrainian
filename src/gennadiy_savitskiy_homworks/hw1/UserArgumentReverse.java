package gennadiy_savitskiy_homworks.hw1;

public class UserArgumentReverse {
    public static void main(String[] args) {
        for (int i = args.length; i > 0 ; i--) {
            System.out.println(args[i-1]);
        }
    }
}
