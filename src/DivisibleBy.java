// #5: For numbers zero to 1000, sum all numbers that are divisible by 3 or 5 or both
public class DivisibleBy {

    public static void main(String [] args) {
        System.out.println(divisibleBy());
    }

    private static int divisibleBy() {
        int sum = 0;

        //to 1000, assuming thats inclusive in this case
        for (int i = 0; i <= 1000; i++) {
            if (i % 15 == 0) //divisible by 3 and 5
                sum += i;
            else if (i % 3 == 0)
                sum += i;
            else if (i % 5 == 0)
                sum += i;
        }

        return sum;
    }
}
