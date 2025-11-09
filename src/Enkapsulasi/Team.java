/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Student2> members;

    public Team() {
        this.members = new ArrayList<>();
    }

    public void addMember(Student2 s) {
        if (s == null) throw new IllegalArgumentException("Member tidak boleh null");
        members.add(s);
    }
    
    public List<Student2> getMembers() {
        return new ArrayList<>(members);
    }
}

