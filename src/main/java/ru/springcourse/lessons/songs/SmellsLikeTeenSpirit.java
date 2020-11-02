package ru.springcourse.lessons.songs;

public class SmellsLikeTeenSpirit implements Song {

    private final String author = "Nirvana";
    @Override
    public String getSong() {
        return author + " - Smells Like Teen Spirit";
    }
}