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
public class SummationTwenty {

    public static void main(String args[]) {
        int sum = 0;
        // for loop begins
        // and runs till x <= 20
        for (int x = 1; x <= 20; x++) {
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}
