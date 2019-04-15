public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-321));
    }

    //My solution not using int primitive type, does not account for overflow or negative numbers
    public static int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();

        String returnInt = "";
        for (int i = chars.length-1; i >= 0; i--) {
            returnInt += chars[i];
        }
        return Integer.valueOf(returnInt);
    }
}
