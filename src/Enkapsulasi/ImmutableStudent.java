/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public final class ImmutableStudent {
    private final String name;
    private final int score;

    public ImmutableStudent(String name, int score) {
        this.name = validateName(name);
        this.score = validateScore(score);
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public ImmutableStudent withAddedScore(int delta) {
        int newScore = validateScore(this.score + delta);
        return new ImmutableStudent(this.name, newScore);
    }

    private int validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        }
        return score;
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        return name.trim();
    }
}
