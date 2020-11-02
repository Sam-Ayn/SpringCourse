package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class OnTheSunnySideOfTheStreet implements Song {

    private String author = "Louis Armstrong";
    @Override
    public String getSong() {
        return author + " - On The Sunny Side Of The Street";
    }
}