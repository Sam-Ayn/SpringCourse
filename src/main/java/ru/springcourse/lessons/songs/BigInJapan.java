package ru.springcourse.lessons.songs;

public class BigInJapan implements Song {

    private final String author = "Guano Apes";
    @Override
    public String getSong() {
        return author + " - BigInJapan";
    }
}