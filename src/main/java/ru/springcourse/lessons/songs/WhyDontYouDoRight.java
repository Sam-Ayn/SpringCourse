package ru.springcourse.lessons.songs;

import ru.springcourse.lessons.songs.Song;

public class WhyDontYouDoRight implements Song {

    private final String author = "Benny Goodman";
    @Override
    public String getSong() {
        return author + " - Why Don't You Do Right";
    }
}