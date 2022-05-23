package movies;

// #3 - Java II - Arrays: Movie List
public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return this.name;
    }

    public String getMovieCategory() {
        return this.category;
    }

    public String setMovieName(String newName) {
        name = newName;
        return name;
    }

    public String setMovieCategory(String newCategory) {
        category = newCategory;
        return category;
    }

}
