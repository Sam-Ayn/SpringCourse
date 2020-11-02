package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class ShinyStockings implements Song {

    private String author = "Count Basie";
    @Override
    public String getSong() {
        return author + " - Shiny Stockings";
    }
}