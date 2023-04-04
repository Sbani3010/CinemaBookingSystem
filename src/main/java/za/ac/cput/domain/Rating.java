package za.ac.cput.domain;
/*
Rating.java
Rating pojo class.
Luphiwe Sikupela(216060133)
02/April/2023
 */
public class Rating {
   private  String id;
    private int score;

    private Movie movie;

    private  User user;

    private Rating() {
    }

    private Rating(Builder builder){
        this.id=builder.id;
        this.score=builder.score;
        this.movie=builder.movie;
        this.user=builder.user;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public Movie getMovie() {return movie;}

    public User getUser() {return user;}

    public static class Builder{

        private String id;
        private int score;

        private Movie movie;

        private  User user;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setScore(int score) {
            this.score = score;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Rating build()  {
            return new Rating (this);
        }
    }
    }

