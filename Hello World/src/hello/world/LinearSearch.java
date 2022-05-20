/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 11-5-2022
 * @version 1.0
 */
public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }
}
