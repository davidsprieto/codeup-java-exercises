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

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
