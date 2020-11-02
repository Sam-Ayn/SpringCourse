package ru.springcourse.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {

    private final ArrayList<Song>songs = new ArrayList<>();

    @Autowired
    private void setSongs(@Qualifier("whyDontYouDoRight") Song firstSong,
                          @Qualifier("shinyStockings") Song secondSong,
                          @Qualifier("onTheSunnySideOfTheStreet") Song thirdSong){
        songs.add(firstSong);
        songs.add(secondSong);
        songs.add(thirdSong);
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}