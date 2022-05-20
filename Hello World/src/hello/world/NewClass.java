package hello.world;

/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class NewClass {
    static double theSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = theSum(arr);
        System.out.println(sum);
    }
}
