/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public class Main1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Nazwa", 85);
        Student1 s2 = new Student1("Celia", 92);

        System.out.println("\n=== Data Awal Student ===");
        System.out.println(s1.getName() + " -> Score: " + s1.getScore());
        System.out.println(s2.getName() + " -> Score: " + s2.getScore());

        s1.setName("Nazwa Aisy");
        s2.setName("Celia Marselia");

        s1.setScore(95);
        s2.setScore(95);

        System.out.println("\n=== Data Setelah Update ===");
        System.out.println(s1.getName() + " -> Score: " + s1.getScore());
        System.out.println(s2.getName() + " -> Score: " + s2.getScore());

        try {
            s1.setScore(101);
        } catch (IllegalArgumentException e) {
            System.err.println("\nError saat mengubah score: " + e.getMessage());
        }
    }
}
