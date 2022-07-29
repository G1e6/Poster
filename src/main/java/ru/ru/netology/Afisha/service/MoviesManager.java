package ru.ru.netology.Afisha.service;

public class MoviesManager {
    private int limit;

    public MoviesManager() {
        limit = 10;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    private String[] movies = new String[0];

    public void add(String movie) {
        String[] tmv = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmv[i] = movies[i];
        }
        tmv[tmv.length - 1] = movie;
        movies = tmv;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] tmv = new String[resultLength];
        for (int i = 0; i < tmv.length; i++) {
            tmv[i] = movies[movies.length - 1 - i];
        }
        return tmv;
    }

}
