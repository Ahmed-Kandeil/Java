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
public class Student4 {

    int id;
    String name;

    //creating a parameterized constructor
    Student4(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects and passing values
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4(222, "Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }

}
