package example;

public class StringPalindrome {
    public static boolean isIt(String str) {
        boolean res = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return res;

    }
}
