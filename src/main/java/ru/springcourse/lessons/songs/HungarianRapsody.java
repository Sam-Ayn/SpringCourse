package ru.springcourse.lessons.songs;

import org.springframework.stereotype.Component;

@Component
public class HungarianRapsody implements Song {

    private final String author = "Ferenc Liszt";
    @Override
    public String getSong() {
        return author + " - Hungarian Rapsody";
    }
}
