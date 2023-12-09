package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class DataBase  {
    List<Movie> movies = new ArrayList<>();
    List<Director> directors = new ArrayList<>();
    List<Cast> casts = new ArrayList<>();

    }

