/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

/**
 * @author Ahmed Kandil
 * @since 15-3-2022
 * @version 1.0
 */
public class DemonstrateArrayCopy {

    static char a[] = {'H', 'E', 'L', 'L', 'O'};
    static char b[] = {'W', 'O', 'R', 'L', 'D'};

    public static void main(String args[]) {
        System.out.print("Before ArrayCopy a -->");
        System.out.println(a);
        System.out.print("Before ArrayCopy b -->");
        System.out.println(b);
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.print("After ArrayCopy a -->");
        System.out.print(a);
        System.out.print("After ArrayCopy b -->");
        System.out.println(b);
    }
}
