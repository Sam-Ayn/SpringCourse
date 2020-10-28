package ru.springcourse.lessons;

public class RockMusic implements Music {

    private RockMusic(){}

    private static RockMusic getRockMusic(){
        return new RockMusic();
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
