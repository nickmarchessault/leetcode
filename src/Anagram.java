import java.util.Arrays;

// #1: Write a function to check whether two strings are an anagram (the words have same letters arranged differently)
public class Anagram {

    public static void main(String [] args) {
        System.out.println(isAnagram("madam", "adamm"));
        System.out.println(isAnagram("onet", "oneS"));
    }

    private static boolean isAnagram(String one, String two) {

        //more edge cases to handle here, if one string is null but not the other,
        //if both strings are null return true
        //Going to assume both strings are not null for now..
        if (one.length() != two.length())
            return false;

        char [] arr1 = one.toCharArray();
        char [] arr2 = two.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String first = new String(arr1);
        String second = new String(arr2);

        return first.equals(second);
    }
}
