package ru.netologia.homework;

public class Main {
    public static void main(String[] args) {
        FilmManager filmManager = new FilmManager();
        filmManager.add("Film 1");
        filmManager.add("Film 2");
        filmManager.add("Film 3");
        String[] films = filmManager.findLast();
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i]);
        }
    }
}
