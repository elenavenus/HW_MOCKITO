package ru.netologia.homework;

public class FilmManager {
    private String[] filmArray;
    private final int limit;
    private int filmCounter;


    public FilmManager() {
        filmArray = new String[10];
        limit = 5;
    }

    public FilmManager(int limit) {
        filmArray = new String[10];
        this.limit = limit;
    }


    public String[] findAll() {
        String[] finded = new String[filmCounter];
        System.arraycopy(filmArray, 0, finded, 0, filmCounter);
        return finded;
    }

    public void add(String film) {
        if (filmCounter == filmArray.length) {
            extendArray();
        }
        filmArray[filmCounter] = film;
        filmCounter++;
    }

    private void extendArray() {
        String[] newArray = new String[filmArray.length * 2];
        System.arraycopy(filmArray, 0, newArray, 0, filmArray.length);
        filmArray = newArray;
    }

    public String[] findLast() {
        int resultLength;
        if (filmCounter < limit) {
            resultLength = filmCounter;
        } else {
            resultLength = limit;
        }
        String[] finded = new String[resultLength];
        for (int i = filmCounter - 1, j = 0; i >= filmCounter - resultLength; i--, j++) {
            finded[j] = filmArray[i];
        }
        return finded;
    }
}
