import java.util.Arrays;

//In an array of numbers, find the longest sorted (ascending order) array. Assume length of array < 1000 .
public class LongestSubarray {

    public static void main(String [] args) {
        printLongestSubArray(new int[]{17,3,5,7,6});
        printLongestSubArray(new int[]{1,2,3,2,3,4,5,6,1,2});

    }

    private static void printLongestSubArray(int [] arr) {
        if (arr.length < 1)
            System.out.println(Arrays.toString(arr));

        int min = 0; //first index of longest subarray
        int max = 0; //last index of longest subarray

        int tempBeg = 0; //temp sub array to compare to the current longest
        int tempEnd = 0;
        int prevElement = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            int currElement = arr[i];

            if (currElement > prevElement) {
                tempEnd = i;
            } else { //next element is less than the prev element
                if (tempEnd - tempBeg > max - min) {
                    min = tempBeg;
                    max = tempEnd;
                }
                tempBeg = i;
            }
            prevElement = arr[i];
        }

        //Print the longest subArray
        for (int i = min; i <= max; i++) {
            System.out.print(arr[i]);
        }
    }
}