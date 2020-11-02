package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class TheWindCriesMary implements Song {

    private String author = "Jimi Hendrix";
    @Override
    public String getSong() {
        return author + " - The Wind Cries Mary";
    }
}
