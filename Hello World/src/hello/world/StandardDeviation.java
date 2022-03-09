package hello.world;
/**
 * @author Ahmed Kandil
 * @since 9-3-2022
 * @version 1.0
 */
public class StandardDeviation {
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
    static double standardDeviation(double[] numbers)
    {
        double standardDeviation = Math.sqrt(variance(numbers));
        return standardDeviation;
    }
    public static void main(String[] args) {
        double[] numbers = {1,2,3,4};
        System.out.println(standardDeviation(numbers));
    }
}
