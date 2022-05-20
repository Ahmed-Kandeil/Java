/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 22-3-2022
 * @version 1.0
 */
public class AddMethod {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        //method calling
        int c = add(a, b);
        //a and b are actual parameters
        System.out.println("The sum of a and b is= " + c);
    }
}
