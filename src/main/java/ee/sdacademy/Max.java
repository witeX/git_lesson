package ee.sdacademy;

public class Max {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 3;

        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.println("Max value is: " + max);

    }
}
