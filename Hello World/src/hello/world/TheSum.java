package hello.world;

/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 2.0
 */
public class TheSum {

    static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] numbers = {1, 3, 5, 9};
        System.out.println(sum(numbers));
    }
}
