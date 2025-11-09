/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author Nazwajafni
 */
public final class Student2 {
    private final String name;
    private int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = validateScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int delta) {
        int newScore = this.score + delta;
        this.score = validateScore(newScore);
    }

    public void reduceScore(int delta) {
        int newScore = this.score - delta;
        this.score = validateScore(newScore);
    }

    private int validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score harus antara 0 dan 100");
        }
        return score;
    }
}
// Penjelasan:
    // Pendekatan ini lebih bagus karena:
    // 1. Field bersifat final (immutable), jadi data tidak bisa diubah sembarangan.
    // 2. Setiap perubahan score dilakukan melalui method terkontrol (addScore/reduceScore).
    // 3. Validasi selalu dijalankan, mencegah nilai invalid.