package ru.springcourse.lessons.songs;

import ru.springcourse.lessons.songs.Song;

public class TheWindCriesMary implements Song {

    private final String author = "Jimi Hendrix";
    @Override
    public String getSong() {
        return author + " - The Wind Cries Mary";
    }
}
