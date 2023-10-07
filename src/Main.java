import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {12.5, 10.7, 2.5, -36.5, 4.1, -9.8, 2.1, 6.7, -4.3, 6.4, 7.6, -8.3, 2.9, -6.1, 5.9};
        System.out.println(Arrays.toString(numbers));
        boolean check = false;
        double start = 0.0;
        int total= 0;
        for (double number: numbers) {
            if (number < 0) check = true;
            else if (check && number > 0) {
                start = start + number;
                total++;
            }
        }
        System.out.println(start/total);

    }
}