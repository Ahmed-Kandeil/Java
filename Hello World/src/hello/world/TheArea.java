package hello.world;
import java.util.Scanner;
/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class TheArea {
    public static void main(String[] args) {
        int shape;
        double theLength, thewidth, radius, area;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Shape Number You Want To Calculate His Area");
        System.out.println("1 => Square");
        System.out.println("2 => Rectangle");
        System.out.println("3 => Circle");
        shape = input.nextInt();
        switch (shape) {
            case 1:
                System.out.println("Enter The Length :");
                theLength = input.nextDouble();
                area = theLength * theLength;
                System.out.println("The Area Of The Square Is => " + area);
                break;
            case 2:
                System.out.println("Enter The Length :");
                theLength = input.nextDouble();
                System.out.println("Enter The Width :");
                thewidth = input.nextDouble();
                area = theLength * thewidth;
                System.out.println("The Area Of The Rectangle Is => " + area) ;
                break;
            case 3:
                System.out.println("Enter The Radius :");
                radius = input. nextDouble();
                area = pi * radius * radius;
                System.out.println("The Area Is => " + area);
                break;
            default:
                System.out.println("Sorry!!!");
                System.out.println("Undefine Shape") ;
                break;
        }
    }
}