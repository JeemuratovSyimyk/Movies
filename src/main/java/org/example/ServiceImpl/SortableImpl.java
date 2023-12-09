package org.example.ServiceImpl;

import org.example.Entity.DataBase;
import org.example.Entity.Movie;
import org.example.Service.Sortable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortableImpl implements Sortable {
  Scanner scanner = new Scanner(System.in);
  int num;
   // private DataBase dataBase;

    @Override
    public void sortByMovieName(List<Movie> movies) {
        System.out.println("""
                Выберите способ сортировки
                1 - to sort from S to Z
                2 - to sort from Z to A""");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Sort from S to Z"); // Сортируем по возрастанию (от S до Z)
                Collections.sort(movies, Comparator.comparing(Movie::getName));
                break;

            case 2:
                System.out.println("Sort from Z to A");
                Collections.sort(movies, Comparator.comparing(Movie::getName));
                break;

            default:
                System.out.println("Неверный выбор");
                return;
        }
        System.out.println(" Отсортированный список по названию фильма: ");
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            System.out.println(movie);
        }

    }
    @Override
    public void sortByYear(List<Movie> movies) {
        System.out.println("сортировать по годам");
        int direction = scanner.nextInt();

        System.out.println("Выберите направление сортировки");
        System.out.println("1 - по возрастанию");
        System.out.println("2 - по убыванию");

    switch (direction) {
        case 1:
            System.out.println(" Сортировка по годам в порядке возрастания ");
            Collections.sort(movies, Comparator.comparing(Movie::getYear));
            break;
        case 2:
            System.out.println("Сортировка по годам в порядке убывания");
            Collections.sort(movies, Comparator.comparing(Movie::getYear).reversed());
            break;
        default:
            System.out.println("Неверный выбор направления сортировки");
            return;
    }
        System.out.println("Отсортированный список по годам");
    for (Movie movie: movies){
        System.out.println(movie.getName()+ "-" + movie.getYear());
    }
    }
    @Override
    public void sortByDirector(List<Movie> movies) {
        System.out.println("сортировать по директору");
        String director = scanner.next();

        switch (director){
            case "1":System.out.println("Сортировка по режиссеру 1");
                break;

            case "2":
                System.out.println("Сортировка по режиссеру 2");
                break;

            default:
                System.out.println("Неверный выбор режиссера");
                return;
        }

        System.out.println("\nОтсортированный список по режиссеру:");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getDirector());
        }


        }
    }


