import java.util.HashSet;
import java.util.stream.Stream;

// #3: In an array of 100 numbers, print out all duplicate numbers
public class PrintDupNums {

    public static void main(String [] args) {
        printDups(new int[]{1,1,2,2,1,2,3,4,5,6,7,8,8,8});
    }

    private static void printDups(int [] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
