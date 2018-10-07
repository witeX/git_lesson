package ee.sdacademy;

public class Sum {

    public static void main(String[] args) {
        final int[] array = {32, 4, 4, 223, 123, 223, 55, 123, 55, 223};

        int sum = 0;
        for (int anArray1 : array) {
            sum += anArray1;
        }

        System.out.println("Sum: " + sum);
    }
}
