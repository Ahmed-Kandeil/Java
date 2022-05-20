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
public class OneDimensionalArray {

    public static void main(String args[]) {
        int num[];
        int size = 5;
        num = new int[size];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        for (int i = 0; i < size; i++) {
            System.out.println("num [" + i + " ] =" + num[i]);
        }
    }
}
