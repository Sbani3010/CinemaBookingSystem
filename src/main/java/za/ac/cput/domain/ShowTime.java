/* ShowTime.java
 Entity for the ShowTime
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.domain;
import java.util.Date;

public class ShowTime {
    private String id;
    private Movie movie;
    private Date date;

    private ShowTime(Builder builder) {
        this.id = builder.id;
        this.movie = builder.movie;
        this.date = builder.date;
    }

    private ShowTime() {
    }

    public static class Builder {
        private String id;
        private Movie movie;
        private Date date;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public Builder setData(Date date) {
            this.date = date;
            return this;
        }

        public Builder copy(ShowTime showTime) {
            this.id = showTime.id;
            this.movie = showTime.movie;
            this.date = showTime.date;
            return this;
        }

        public ShowTime build(){
            return new ShowTime(this);
        }
    }
}
