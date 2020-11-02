package ru.springcourse.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private Music classicalMusic;
    @Autowired
    private Music rockMusic;
    @Autowired
    private Music jazzMusic;

    public String playMusic(MusicGenres musicGenres) {
        String result = "";
        switch (musicGenres) {
            case JAZZMUSIC: {
                result = "Playing: " + ((Song) jazzMusic.getSongs().get(getRandomSong())).getSong();
                break;
            }
            case CLASSICALMUSIC: {
                result = "Playing: " + ((Song) classicalMusic.getSongs().get(getRandomSong())).getSong();
                break;
            }
            case ROCKMUSIC: {
                result = "Playing: " + ((Song) rockMusic.getSongs().get(getRandomSong())).getSong();
                break;
            }
        }
        return result;
    }

    private int getRandomSong() {
        return (int) (Math.random() * 3);
    }
}
