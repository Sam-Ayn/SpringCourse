package ru.springcourse.lessons;

public class ToscoFantasy implements Song {

    private final String author = "Antonio Vivaldi";
    @Override
    public String getSong() {
        return author + " - Tosco Fantasy";
    }
}