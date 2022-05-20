/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 29-3-2022
 * @version 1.0
 */
public class TestRandomCharacter {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 25;
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacters.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
