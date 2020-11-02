package ru.springcourse.lessons;

import java.util.List;

public class RockMusic implements Music {

    private final List<Song> songs;

    public RockMusic(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}