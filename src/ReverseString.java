//Create a function "ReverseString" that accepts a string and number of times to reverse the string (N) . N < 1000, length of string <1000.
public class ReverseString {

    public static void main(String [] args) {
        System.out.println(reverseString("asdf", 2));
        System.out.println(reverseString("hey", 1));
        System.out.println(reverseString("boseHealth", 4));
    }

    /*
        If I was not allow to use StringBuilder, then I would loop backwards appending the character to the return string.
        Repeating that process for the numTimes parameter
     */
    private static String reverseString(String stringToReverse, int numTimes) {
        StringBuilder stringBuilder = new StringBuilder(stringToReverse);

        for (int i = 0; i < numTimes; i++)
            stringBuilder = stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
