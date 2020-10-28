package ru.springcourse.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstPlayer.playMusic();
        System.out.println(firstPlayer.getName());
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());
        secondPlayer.setVolume(42);
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());
        context.close();
    }
}
