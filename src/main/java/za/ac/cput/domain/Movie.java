/* Movie.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.domain;

public class Movie {
    private String id;
    private String title;
    private String description;
    private String genre;
    private String director;
    private double duration;

    private Movie() {
    }

    private Movie(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.director = builder.director;
        this.duration = builder.duration;
        this.genre = builder.genre;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private String genre;
        private String director;
        private double duration;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setDirector(String director) {
            this.director = director;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder copy(Movie movie) {
            this.id = movie.id;
            this.title = movie.title;
            this.description = movie.description;
            this.genre = movie.genre;
            this.director = movie.director;
            this.duration = movie.duration;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
