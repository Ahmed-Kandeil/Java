package hello.world;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Ahmed Kandil
 * @since 5-3-2022
 * @version 1.4
 */
public class GPA {
    public static void main(String[] args) {
        int degree, number = 1;
        ArrayList<Integer> subjectsDegree = new ArrayList<Integer>();
        float theSum = 0, average;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Your Degree For The " + number++ + " Subject :");
            degree = input.nextInt();
            subjectsDegree.add(degree);
        }
        for(int num:subjectsDegree) {
            theSum += num;
        }
        average = (theSum / subjectsDegree.size());
        if (average >= 80)
        {
            System.out.println("A"); 
        }
        else if (average < 80 && average >= 60)
        {
            System.out.println("B"); 
        }
        else if (average < 60 && average >= 40)
        {
            System.out.println("C"); 
        }
        else
        {
            System.out.println("D");
        }
    }
}