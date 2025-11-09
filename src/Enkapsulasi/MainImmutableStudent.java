/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public class MainImmutableStudent {
    public static void main(String[] args) {
        ImmutableStudent s1 = new ImmutableStudent("Nazwa", 85);
        ImmutableStudent s2 = new ImmutableStudent("Celia", 92);

        System.out.println("=== Data Awal ===");
        System.out.println(s1.getName() + " -> Score: " + s1.getScore());
        System.out.println(s2.getName() + " -> Score: " + s2.getScore());

        ImmutableStudent s1Updated = s1.withAddedScore(10);
        ImmutableStudent s2Updated = s2.withAddedScore(5);

        System.out.println("\n=== Data Setelah Update ===");
        System.out.println(s1Updated.getName() + " -> Score: " + s1Updated.getScore());
        System.out.println(s2Updated.getName() + " -> Score: " + s2Updated.getScore());

        System.out.println("\n=== Data Lama Tetap ===");
        System.out.println(s1.getName() + " -> Score: " + s1.getScore());
        System.out.println(s2.getName() + " -> Score: " + s2.getScore());
    }
}
