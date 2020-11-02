package ru.springcourse.lessons;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic implements Music {

    private final List<Song> songs;

    public JazzMusic(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}