package hello.world;

/**
 * @author Ahmed Kandil
 * @since 9-3-2022
 * @version 1.0
 */
public class Average {
    static double mean(double[] numbers)
    {
        double sum = 0;
        double mean;
        for(double number:numbers)
        {
            sum += number;
        }
        mean = sum / numbers.length;
        return mean;
    }
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4};
        System.out.println(mean(numbers));
    }
}
