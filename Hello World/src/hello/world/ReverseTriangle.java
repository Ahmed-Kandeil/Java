package hello.world;

import java.util.Scanner;

/**
 * @author Ahmed Kandil
 * @since 10-3-2022
 * @version 1.0
 */
public class ReverseTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowsSize;
        System.out.print("Enter The Size Of The Reverse Triangle => ");
        rowsSize = input.nextInt();
        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rowsSize - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
