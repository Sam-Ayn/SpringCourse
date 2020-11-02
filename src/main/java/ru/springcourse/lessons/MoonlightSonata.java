package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class MoonlightSonata implements Song {

    private String author = "Ludwig van Beethoven";
    @Override
    public String getSong() {
        return author + " - Moonlight Sonata";
    }
}