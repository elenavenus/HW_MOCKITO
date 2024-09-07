package ru.netologia.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    void addFilmsWithoutExtensionTest() {
        FilmManager filmManager = new FilmManager();
        for (int i = 0; i < 5; i++) {
            filmManager.add("film" + i);
        }
        int expectedSize = 5;
        int actualSize = filmManager.findAll().length;
        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    void addFilmsWithExtensionTest() {
        FilmManager filmManager = new FilmManager();
        for (int i = 0; i < 11; i++) {
            filmManager.add("film" + i);
        }
        int expectedSize = 11;
        int actualSize = filmManager.findAll().length;
        Assertions.assertEquals(expectedSize, actualSize);
    }

    @Test
    void findAllTest() {
        FilmManager filmManager = new FilmManager();
        String[] films = new String[]{"film1", "film2", "film3", "film4", "film5"};
        for (int i = 0; i < 5; i++) {
            filmManager.add(films[i]);
        }
        String[] actualFilms = filmManager.findAll();
        Assertions.assertArrayEquals(films, actualFilms);
    }

    @Test
    void findLastWithLimit() {
        FilmManager filmManager = new FilmManager(3);
        String[] films = new String[]{"film1", "film2", "film3", "film4", "film5"};
        for (int i = 0; i < 5; i++) {
            filmManager.add(films[i]);
        }
        String[] expectedFilms = new String[]{"film5", "film4", "film3"};
        String[] actualFilms = filmManager.findLast();
        Assertions.assertArrayEquals(expectedFilms, actualFilms);
    }

    @Test
    void findLastWithoutLimit() {
        FilmManager filmManager = new FilmManager(7);
        String[] films = new String[]{"film1", "film2", "film3", "film4", "film5"};
        for (int i = 0; i < 5; i++) {
            filmManager.add(films[i]);
        }
        String[] expectedFilms = new String[]{"film5", "film4", "film3", "film2", "film1"};
        String[] actualFilms = filmManager.findLast();
        Assertions.assertArrayEquals(expectedFilms, actualFilms);
    }


}
