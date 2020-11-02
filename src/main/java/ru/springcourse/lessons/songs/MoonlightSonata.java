package ru.springcourse.lessons.songs;

public class MoonlightSonata implements Song {

    private final String author = "Ludwig van Beethoven";
    @Override
    public String getSong() {
        return author + " - Moonlight Sonata";
    }
}