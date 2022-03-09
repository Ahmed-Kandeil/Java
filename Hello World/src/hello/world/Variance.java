package hello.world;

/**
 * @author Ahmed Kandil
 * @since 9-3-2022
 * @version 1.0
 */
public class Variance {
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
    static double variance(double[] numbers)
    {
        double sum = 0;
        double variance;
        double Mu = mean(numbers);
        for(double number:numbers)
        {
            sum += (number - Mu) * (number - Mu);
        }
        variance = sum / numbers.length;
        return variance;
    }
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4};
        System.out.println(variance(numbers));
    }
}
