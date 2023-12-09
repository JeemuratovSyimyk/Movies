package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Enum.Genre;
@Setter
@Getter
@ToString
public class Movie {
    private String name;
    private int year;
    private Genre genre;
    private Director director;
    private Cast cast;

    public Movie(String name, int year, Genre genre, Director director, Cast cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }
}
