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
public class House {

    Room r;

    void createHouse() {
        r = new Room();
    }

    void displayHouse() {
        r.displayData();
    }

    public static void main(String args[]) {
        House h = new House();
        h.createHouse();
        h.displayHouse();
    }

    private static class Room {

        public Room() {
        }

        private void displayData() {
            
        }
    }
}
