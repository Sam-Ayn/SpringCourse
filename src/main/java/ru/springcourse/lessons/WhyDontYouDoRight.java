package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class WhyDontYouDoRight implements Song {

    private String author = "Benny Goodman";
    @Override
    public String getSong() {
        return author + " - Why Don't You Do Right";
    }
}