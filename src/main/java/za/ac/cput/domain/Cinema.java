package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cinemaId;
    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private List<MovieRoom> movieRooms=new ArrayList<>();
    protected Cinema() {
    }

    private Cinema(Builder builder) {
        this.cinemaId = builder.cinemaId;
        this.movieRooms=builder.movieRooms;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public List<MovieRoom> getMovieRooms() {
        return movieRooms;
    }

    public static class Builder {
        private int cinemaId;
        private List<MovieRoom> movieRooms;

        public Builder setCinemaId(int cinemaId) {
            this.cinemaId = cinemaId;
            return this;
        }

        public Builder setMovieRooms(List<MovieRoom> movieRooms) {
            this.movieRooms = movieRooms;
            return this;
        }

        public Builder copy(Cinema cinema) {
            this.cinemaId = cinema.cinemaId;
            this.movieRooms=cinema.movieRooms;
            return this;
        }

        public Cinema build() {
            return new Cinema(this);
        }
    }
}
