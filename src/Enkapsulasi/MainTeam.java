/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

import java.util.List;

/**
 *
 * @author Nazwajafni
 */
public class MainTeam {
    public static void main(String[] args) {
        Team myTeam = new Team();

        myTeam.addMember(new Student2("Nazwa", 85));
        myTeam.addMember(new Student2("Celia", 92));

        List<Student2> membersCopy = myTeam.getMembers();

        System.out.println("=== Daftar Anggota Team ===");
        for (Student2 s : membersCopy) {
            System.out.println(s.getName() + " -> Score: " + s.getScore());
        }

        membersCopy.add(new Student2("Salsa", 75));

        System.out.println("\n=== Setelah dicoba ubah dari luar ===");
        for (Student2 s : myTeam.getMembers()) { // ambil lagi list asli
            System.out.println(s.getName() + " -> Score: " + s.getScore());
        }
    }
}
