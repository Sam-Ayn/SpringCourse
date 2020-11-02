package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class SmellsLikeTeenSpirit implements Song {

    private String author = "Nirvana";
    @Override
    public String getSong() {
        return author + " - Smells Like Teen Spirit";
    }
}