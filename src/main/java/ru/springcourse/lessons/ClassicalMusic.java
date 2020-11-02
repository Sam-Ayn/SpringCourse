package ru.springcourse.lessons;

import java.util.List;

public class ClassicalMusic implements Music {

    private final List<Song>songs;

    public ClassicalMusic(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }

}
