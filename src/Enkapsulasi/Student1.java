/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public class Student1 {
    private String name;
    private int score;

    public Student1(String name, int score) {
        this.name = name;
        setScore(score); 
    }
    
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.name = name.trim();
    }
   
    public int getScore() {
        return score;
    }
   
    public void setScore(int score) {
        this.score = validateScore(score);
    }
   
    private int validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        }
        return score;
    }
}