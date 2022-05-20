/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 7-3-2022
 * @version 1.0
 */
public class AscendingOrder {

    public static void main(String args[]) {
        int[] arr = {234, 6, 846, 85, 96, 198, 545, 12, 60, 34, 4, 87, 7, 1};
        int i, j, l, temp;
        l
                = arr.length;
        for (i = 0; i < l - 1; i++) {
            for (j = i + 1; j < l; j++) {
                temp = arr [i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }
    }
}
