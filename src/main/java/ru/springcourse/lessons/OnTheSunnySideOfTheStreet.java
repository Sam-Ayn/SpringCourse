package ru.springcourse.lessons;

public class OnTheSunnySideOfTheStreet implements Song {

    private final String author = "Louis Armstrong";
    @Override
    public String getSong() {
        return author + " - On The Sunny Side Of The Street";
    }
}