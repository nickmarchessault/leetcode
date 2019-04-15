package health;

import java.util.HashSet;

//Find if a string has any duplicate characters.
// If so, please remove all duplicates ( Length of string < 1000).
public class DuplicateChars {

    public static void main(String [] args) {
        System.out.println(returnNoDuplicateChars("aaatestinggg"));
        System.out.println(returnNoDuplicateChars("a"));
        System.out.println(returnNoDuplicateChars("ajlhsdbfkabsdfklkjkkjasdfkjbnaslkjdfnbkljasndlgfjksassssss"));
    }

    private static String returnNoDuplicateChars(String stringWDups) {
        if (stringWDups.isEmpty() || stringWDups == null)
            return stringWDups;

        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> dupChars = new HashSet<>();

        for (int i = 0; i < stringWDups.length(); i++) {
            char currentChar = stringWDups.charAt(i);

            //If the character is not a dup, then add it to the return string
            if (dupChars.add(currentChar)) {
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }
}
