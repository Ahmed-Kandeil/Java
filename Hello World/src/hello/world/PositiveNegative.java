package hello.world;
import java.util.Scanner;

/**
 * @author Ahmed Kandil
 * @since 11-3-2022
 * @version 1.0
 */
public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        String type, size = "Normal";
        System.out.print("Enter The Number => ");
        number = input.nextFloat();
        if (number > 0) {
            type = "Positive";
        } else if (number < 0) {
            type = "Negative";
        } else {
            type = "Zero";
        }
        if (Math.abs(number) < 1) {
            size = "Small";
        } else if (Math.abs(number) > 1000) {
            size = "Big";
        }
        System.out.println("The Number [" + number + "] Is " + type + " And " + size + ".");
    }
}
