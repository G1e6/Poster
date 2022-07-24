package ru.ru.netology.Afisha.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void addingMultipleMovies() {
        MoviesManager manager = new MoviesManager(3);
        manager.add("Ferst");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");

        String[] expected = {"Ferst", "Second", "Third", "Fourth", "Fifth"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noAddingMovies() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingAllMovies() {
        MoviesManager manager = new MoviesManager(12);
        manager.add("Ferst");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleven");
        manager.add("Twelve");

        String[] expected = {"Ferst", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth", "Eleven", "Twelve"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingSeveralMovies() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Ferst");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");


        String[] expected = {"Fifth", "Fourth", "Third", "Second", "Ferst"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingAllMoviesFindLast() {
        MoviesManager manager = new MoviesManager(11);
        manager.add("Ferst");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        manager.add("Eleven");

        String[] expected = {"Eleven", "Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
