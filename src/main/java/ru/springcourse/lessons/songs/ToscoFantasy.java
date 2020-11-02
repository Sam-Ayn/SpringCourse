package ru.springcourse.lessons.songs;

import ru.springcourse.lessons.songs.Song;

public class ToscoFantasy implements Song {

    private final String author = "Antonio Vivaldi";
    @Override
    public String getSong() {
        return author + " - Tosco Fantasy";
    }
}