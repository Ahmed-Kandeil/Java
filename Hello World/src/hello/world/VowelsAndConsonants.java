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
public class VowelsAndConsonants {

    public static void main(String[] args) {
        String line = "This website is Ahmed Kandil.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            } // check if character is in between 0 to 9
            else if (ch >= '0' && ch <= '9') {
                ++digits;
            } else if (ch
                    == ' ') {
                ++spaces;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }
}
