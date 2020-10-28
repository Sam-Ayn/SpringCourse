package ru.springcourse.lessons;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
    public void doInit(){
        System.out.println("Initializing ClassicalMusic bean");
    }
    public void doDestroy(){
        System.out.println("Destroying ClassicalMusic bean");
    }
}
