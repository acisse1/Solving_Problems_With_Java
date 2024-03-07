public class SumOfDigits {

    static int sumOfDigits(int num) {

        int sum = 0;
        for (int i = num; i >= 0; i--) {

            // last digit
            int remainder = num % 10;

            sum += remainder;

            // remove last digit
            num = num / 10;
           
        }

        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sumOfDigits(103));

    }
}