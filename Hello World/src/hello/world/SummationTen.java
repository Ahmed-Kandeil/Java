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
public class SummationTen {

    public static void main(String args[]) {
        int x = 1, sum = 0;
        // Exit when x becomes greater than 4 
        while (x <= 10) {
            // summing up x
            sum += x;
            // Increment the value of x for 
            // next iteration
            x++;
        }
        System.out.println("Summation: " + sum);
    }
}
