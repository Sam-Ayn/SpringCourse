package ru.springcourse.lessons.songs;

public class ShinyStockings implements Song {

    private final String author = "Count Basie";
    @Override
    public String getSong() {
        return author + " - Shiny Stockings";
    }
}