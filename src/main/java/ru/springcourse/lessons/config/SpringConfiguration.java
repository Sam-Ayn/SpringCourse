package ru.springcourse.lessons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.google.common.collect.Lists;
import ru.springcourse.lessons.*;
import ru.springcourse.lessons.genres.ClassicalMusic;
import ru.springcourse.lessons.genres.JazzMusic;
import ru.springcourse.lessons.genres.Music;
import ru.springcourse.lessons.genres.RockMusic;
import ru.springcourse.lessons.songs.*;

import java.util.List;

@Configuration
@ComponentScan("ru.springcourse.lessons")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
    @Bean
    public BigInJapan bigInJapan(){
        return new BigInJapan();
    }

    @Bean
    public SmellsLikeTeenSpirit smellsLikeTeenSpirit(){
        return new SmellsLikeTeenSpirit();
    }

    @Bean
    public TheWindCriesMary theWindCriesMary(){
        return new TheWindCriesMary();
    }

    @Bean
    public List<Song> rockMusicList(){
        return Lists.newArrayList(bigInJapan(), smellsLikeTeenSpirit(), theWindCriesMary());
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic(rockMusicList());
    }

    @Bean
    public HungarianRapsody hungarianRapsody(){
        return new HungarianRapsody();
    }

    @Bean
    public ToscoFantasy toscoFantasy(){
        return new ToscoFantasy();
    }

    @Bean
    public MoonlightSonata moonlightSonata(){
        return new MoonlightSonata();
    }

    @Bean
    public List<Song> classicalMusicList(){
        return Lists.newArrayList(hungarianRapsody(), toscoFantasy(), moonlightSonata());
    }

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic(classicalMusicList());
    }

    @Bean
    public OnTheSunnySideOfTheStreet onTheSunnySideOfTheStreet(){
        return new OnTheSunnySideOfTheStreet();
    }

    @Bean
    public WhyDontYouDoRight whyDontYouDoRight(){
        return new WhyDontYouDoRight();
    }

    @Bean
    public ShinyStockings shinyStockings(){
        return new ShinyStockings();
    }

    @Bean
    public List<Song> jazzMusicList(){
        return Lists.newArrayList(onTheSunnySideOfTheStreet(), whyDontYouDoRight(), shinyStockings());
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic(jazzMusicList());
    }

    @Bean
    public List<Music> musicList(){
        return Lists.newArrayList(jazzMusic(), rockMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
