package ru.springcourse.lessons;

public class TheWindCriesMary implements Song {

    private final String author = "Jimi Hendrix";
    @Override
    public String getSong() {
        return author + " - The Wind Cries Mary";
    }
}
