package ru.springcourse.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    private final ArrayList<Song>songs = new ArrayList<>();

    @Autowired
    private void setSongs(@Qualifier("moonlightSonata") Song firstSong,
                          @Qualifier("hungarianRapsody") Song secondSong,
                          @Qualifier("toscoFantasy") Song thirdSong){
        songs.add(firstSong);
        songs.add(secondSong);
        songs.add(thirdSong);
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Initializing ClassicalMusic bean");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroying ClassicalMusic bean");
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }

}
