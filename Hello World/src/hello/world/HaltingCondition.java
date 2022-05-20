/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 19-4-2022
 * @version 1.0
 */
public class HaltingCondition {

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
