/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

import java.util.Scanner;

/**
 * @author Ahmed Kandil
 * @since 29-3-2022
 * @version 1.0
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
