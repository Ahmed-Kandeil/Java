/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 5-4-2022
 * @version 1.0
 */
public class Frequency {

    public static void main(String[] args) {
        String str = "This website is awesome.";
        char ch = 'e';
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
