/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 15-4-2022
 * @version 1.0
 */
public class RecursionFactorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String args[]) {
        int fact, number = 4; 
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
