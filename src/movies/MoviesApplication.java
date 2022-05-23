package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

// #3 - Java II - Arrays: Movie List
public class MoviesApplication {

    // Main method to test/run our program.
    public static void main(String[] args) {
        userDisplayMovies();
    }

    // This method handles how the user wants to view/display the movies.
    public static void userDisplayMovies() {
        Input input = new Input(); // Creates a new instance of Input which is stored in a variable named "input" which allows access to the methods in the "Input" class under "util".
        Scanner scanner = new Scanner(System.in); // Method to allow user to enter desired/requested data, and then manipulate that data.
        Movie[] allMovies = MoviesArray.findAll(); // Accessing the Movie[] array in the findAll() method in the MoviesArray class which is stored in a variable named "allMovies".

        System.out.println("What would you like to do: \n 0 - exit \n 1 - view all movies \n 2 - view movies in the animated category \n 3 - view movies in the drama category \n 4 - view movies in the horror category \n 5 - view movies in the sci-fi category \n 6 - add a movie");
        System.out.print("Enter your choice --> ");
        int userDecision = input.getInt(0, 6);
        System.out.println();
        if(userDecision == 0) {
            System.out.println("Exit? Okay, that's cool.");
        } else if(userDecision == 1) {
            displayAllMovies(allMovies); // A call to the method that displays the entire list of movies with the "allMovies" array passed in.
            System.out.println(); // Prints a space between the list of movies and what the user decides to do.
            userDisplayMovies(); // Using recursion to have the program run until the user enters "0" to exit.
        } else if(userDecision == 2) {
            System.out.println("Printing a list of all animated movies: ");
            displayMovieByCategory(allMovies, "animated"); // A call to the method that displays the list of movies by category which accepts the passed in "allMovies" array and the String "animated".
            System.out.println();
            userDisplayMovies();
        } else if(userDecision == 3) {
            System.out.println("Printing a list of all drama movies: ");
            displayMovieByCategory(allMovies, "drama"); // A call to the method that displays the list of movies by category which accepts the passed in "allMovies" array and the String "drama".
            System.out.println();
            userDisplayMovies();
        } else if(userDecision == 4) {
            System.out.println("Printing a list of all horror movies: "); // A call to the method that displays the list of movies by category which accepts the passed in "allMovies" array and the String "horror".
            displayMovieByCategory(allMovies, "horror");
            System.out.println();
            userDisplayMovies();
        } else if(userDecision == 5) {
            System.out.println("Printing a list of all sci-fi movies: "); // A call to the method that displays the list of movies by category which accepts the passed in "allMovies" array and the String "sci-fi".
            displayMovieByCategory(allMovies, "sci-fi");
            System.out.println(); // Prints a space between the list of movies and what the user decides to do.
            userDisplayMovies(); // Using recursion to have the program run until the user enters "0" to exit.
        } else if(userDecision == 6) {
            System.out.println("Add a movie function:");
            System.out.print("Please enter the movie name: ");
            String userNewMovieName = scanner.nextLine(); // Grabbing user input and storing it in a variable called "userNewMovieName".
            System.out.print("Please enter the movie category: ");
            String userNewMovieCategory = scanner.nextLine(); // Grabbing user input and storing it in a variable called "userNewMovieCategory".
            Movie newUserMovie = new Movie(userNewMovieName, userNewMovieCategory); // Creating a new instance of Movie called "userNewMovie" and passing in the user input values for the movie name and movie category.
            allMovies = addMovie(allMovies, newUserMovie); // A call to the method "addMovie" which accepts the "allMovies" array and the variable "newUserMovie" (which contains the data for the new movie name and new movie category) and adds that data to the "allMovies" array."
            System.out.printf("You have added the movie: %nNAME: %s %nCATEGORY: %s%n", userNewMovieName, userNewMovieCategory);
            System.out.print("Do you wish to print the list of movies with yours added? (Yes/No): ");
            String userContinue = scanner.next();
            if(userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")) {
                System.out.println();
                displayAllMovies(allMovies);
                System.out.println();
                userDisplayMovies();
            } else {
                System.out.println();
                System.out.println("Going back to main menu.");
                System.out.println();
                userDisplayMovies();
            }
        }
    }

    // This method handles displaying all the movies.
    public static void displayAllMovies(Movie[] allMovies) {
        System.out.println("Printing a list of all movies: ");
        for(Movie movie : allMovies) {
            String movieName = movie.getMovieName();
            String movieCategory = movie.getMovieCategory();
            System.out.println("NAME: " + movieName + ", CATEGORY: " + movieCategory);
        }
    }

    // This method handles displaying the movies by category.
    public static void displayMovieByCategory(Movie[] allMovies, String category) {
        for(Movie movie : allMovies) {
            String movieCategory = movie.getMovieCategory();
            if(movieCategory.equalsIgnoreCase(category)) {
                System.out.println("NAME: " + movie.getMovieName() + ", CATEGORY: " + movie.getMovieCategory());
            }
        }
    }

    // This method handles adding a movie to the Movie[] array. Similar to #1 - Array Basics Exercise.
    public static Movie[] addMovie(Movie[] allMovies, Movie newMovie) {
        allMovies = Arrays.copyOf(allMovies, allMovies.length + 1);
        allMovies[allMovies.length - 1] = newMovie;
        return allMovies;
    }

}
