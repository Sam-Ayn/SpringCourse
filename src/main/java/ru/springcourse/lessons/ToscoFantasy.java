package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

@Component
public class ToscoFantasy implements Song {

    private String author = "Antonio Vivaldi";
    @Override
    public String getSong() {
        return author + " - Tosco Fantasy";
    }
}