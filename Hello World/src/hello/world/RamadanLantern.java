package hello.world;

import java.util.Scanner;

/**
 * @author Ahmed Kandil
 * @since 4-3-2022
 * @version 1.0
 */
public class RamadanLantern {

    public static void main(String[] args) {
        int rowSize, space, i ,j ,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of The Ramadan Lantern => ");
        rowSize = input.nextInt();
        space = rowSize - 1;
        for (j = 1; j <= rowSize; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i < 2 * j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (j = 1; j < rowSize; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i < 2 * (rowSize - j); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = rowSize - 1;
        for (j = 1; j <= rowSize / 2; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i < 2 * j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
