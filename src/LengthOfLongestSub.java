import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *   Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LengthOfLongestSub {

    public static void main(String [] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
//        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty())
            return 0;

        HashSet<Character> tempSet = new HashSet<>();

        int lengthOfLongestSub = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if(tempSet.add(s.charAt(i)) == false) {
                if (endIndex - startIndex > lengthOfLongestSub)
                    lengthOfLongestSub = endIndex - startIndex;
                startIndex = i;
                endIndex = i;
                tempSet.clear();
                tempSet.add(s.charAt(i));
            } else {
                endIndex = i;
            }
            if (i == s.length() - 1 && lengthOfLongestSub == 0 && endIndex > 0) {
                lengthOfLongestSub = endIndex - startIndex;
            }
        }

        return lengthOfLongestSub + 1;
    }
}
