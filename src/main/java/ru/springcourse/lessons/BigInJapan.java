package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class BigInJapan implements Song {

    private String author = "Guano Apes";
    @Override
    public String getSong() {
        return author + " - BigInJapan";
    }
}