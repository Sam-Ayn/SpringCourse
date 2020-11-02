package ru.springcourse.lessons;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class MusicPlayer {
    private final List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        return (musicList.get(getRandomGenre()).getSongs().get(getRandomSong())).getSong();
    }

    private int getRandomSong() {
        return (int) (Math.random() * 3);
    }

    private int getRandomGenre() {
        return (int) (Math.random() * 3);
    }
}
