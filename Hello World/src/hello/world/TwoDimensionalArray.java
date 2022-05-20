/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 15-3-2022
 * @version 1.0
 */
public class TwoDimensionalArray {

    public static void main(String args[]) {
        int twoD[][] = new int[3][3];
        int i, j, k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

}
