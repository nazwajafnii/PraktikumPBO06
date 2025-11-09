 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public class Main2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Nazwa", 85);
        Student2 s2 = new Student2("Celia", 92);

        System.out.println("=== Data Awal ===");
        System.out.println(s1.getName() + " -> " + s1.getScore());
        System.out.println(s2.getName() + " -> " + s2.getScore());

        s1.addScore(5);
        s2.reduceScore(3);

        System.out.println("\n=== Setelah Diubah ===");
        System.out.println(s1.getName() + " -> " + s1.getScore());
        System.out.println(s2.getName() + " -> " + s2.getScore());
    }
}
