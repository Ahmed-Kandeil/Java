/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;

import java.io.File;
import java.io.IOException;

/**
 * @author Ahmed Kandil
 * @since 29-3-2022
 * @version 1.0
 */
public class CheckAttributes {

    public static void main(String[] args) throws IOException {
        File myfile = new File("D://Myfile.txt");
        if (myfile.canWrite()) {
            System.out.println("File is writable.");
        } else {
            System.out.println("File is read only.");
        }
    }
}
