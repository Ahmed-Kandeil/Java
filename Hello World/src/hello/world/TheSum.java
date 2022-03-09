package hello.world;
import java.util.Scanner;
/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class TheSum {
    public static void main(String[] args) {
        int numberOne, numberTwo, numberThree, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Number :");
        numberOne = input.nextInt();
        System.out.println("Enter The Second Number :");
        numberTwo = input.nextInt();
        System.out.println("Enter The Thrid Number :");
        numberThree = input.nextInt();
        sum = numberOne + numberTwo + numberThree;
        System.out.println("The Sum Is => " + sum);
    }
}
