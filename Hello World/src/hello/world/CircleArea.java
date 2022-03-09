package hello.world;
import java.util.Scanner;
/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class CircleArea {
    public static void main(String[] args){
        double radius, area;
        double pi = 3.14;
        System.out.println("Enter The Radius :");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = pi * radius * radius;
        System.out.println("The Area Is => " + area);
    }
}
