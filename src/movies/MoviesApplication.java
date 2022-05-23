package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

// #3 - Java II - Arrays: Movie List
public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input(); // Allows access to the methods in the "Input" class under "util".
        Movie[] allMovies = MoviesArray.findAll();

        System.out.println("What would you like to do: \n 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view movies in the drama category \n 4 - view movies in the horror category \n 5 - view movies in the sci-fi category");
        System.out.print("Enter your choice --> ");
        int userDecision = input.getInt(0, 5);
            if(userDecision == 0) {
                System.out.println("Exit? Okay, that's cool.");
            } else if(userDecision == 1) {
                for(Movie movie : allMovies) {

                }
            }

    }

}
