package org.example.ServiceImpl;

import org.example.Entity.Cast;
import org.example.Entity.DataBase;
import org.example.Entity.Movie;
import org.example.Service.Findable;

import java.util.List;
import java.util.Scanner;

public class FindableImpl implements Findable {
   Scanner scanner = new Scanner(System.in);
  // private  DataBase dataBase ;

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
     System.out.println("Хотите отобразить все фильмы? (да нет)");
     String Movies = scanner.next().toLowerCase();
     if ("Да".equals(Movies)) {
      for (Movie movie : movies) {
       System.out.println(movie);
      }
     }else {
      System.out.println("Операция отменена пользователем");
     }
     return movies;
     }
    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
     System.out.println("Введите полное или неполное название фильма");
      String name = scanner.next();
      for (Movie movie: movies){
       if(movie.getName().contains(name)){
        System.out.println(movies);
        }
       }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
     System.out.println("Введите имя актера, фильмы которого хотите получить");
     String name = scanner.nextLine();
     for (Movie movie: movies){
      Cast cast = movie.getCast();
     if(name.contains(cast.getActorFullName())){
      System.out.println(movie);
      break;
     }
      }
     }
    @Override
    public void findMovieByYear(List<Movie> movies) {
     System.out.println("найти фильм по году");
      int year = scanner.nextInt();
      for (Movie movie: movies){
       if(year==movie.getYear()){
        System.out.println(movie);
     }
    }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies) {
     System.out.println("найти фильм по режиссёру");
      String name = scanner.nextLine();
      for (Movie movie: movies){
      if(name.equals(movie.getDirector().getName())){
       System.out.println(movie);
      }
     }
    }
    @Override
    public void findMovieByGenre(List<Movie> movies) {
     System.out.println("найти фильм по жанру");
     String genre = scanner.nextLine();
     for (Movie movie: movies){
      if(genre.equalsIgnoreCase(movie.getGenre().name())){
       System.out.println(movie);
      }
     }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
     System.out.println("найти фильм по роли");
     String role = scanner.nextLine();
     for (Movie movie: movies){
      Cast cast = movie.getCast();
      if (role.equals(cast.getRole())){
       System.out.println(movie);
      }
     }
    }
    }

