public class IntegerPalindrome {

    public static void main(String [] args) {

        int test = 121;
        int test1 = 10;
        int test2 = 1001;
//        System.out.println(isPalindrome(test));
//        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
    }

    public static boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        int lengthOfInt = intToString.length();

        for (int i = 0; i < lengthOfInt / 2; i++) {
            if (intToString.charAt(i) != intToString.charAt(lengthOfInt - (1 + i))) {
                return false;
            }
        }
        return true;
    }
}
