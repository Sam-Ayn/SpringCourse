package ru.springcourse.lessons.genres;

import org.springframework.stereotype.Component;
import ru.springcourse.lessons.songs.Song;

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