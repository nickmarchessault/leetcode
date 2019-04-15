import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String [] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> subtraction  = new HashMap<String, Integer>() {{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};

        Map<Character, Integer> numerals  = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        if (s.length() < 2) {
            return numerals.get(s.charAt(0));
        } else {
            int sum = 0;
            int count = 0;

            while (count < s.length()) {
                if (count+2 <= s.length()) {
                    if (subtraction.containsKey(s.substring(count, count+2))) {
                        sum += subtraction.get(s.substring(count, count+2));
                        count += 2;
                    } else {
                        sum += numerals.get(s.charAt(count));
                        count++;
                    }
                } else {
                    sum += numerals.get(s.charAt(count));
                    count++;
                }
            }
         return sum;
        }
    }
}
