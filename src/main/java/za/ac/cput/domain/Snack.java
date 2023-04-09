/* ShowTime.java
 Entity for the ShowTime
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.domain;
public class Snack {
    private String id;
    private String name;
    private double price;

    private Snack() {
    }

    private Snack(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
    }

    public static class Builder {
        private String id;
        private String name;
        private double price;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder copy(Snack snack) {
            this.id = snack.id;
            this.name = snack.name;
            this.price = snack.price;
            return this;
        }

        public Snack build() {
            return new Snack(this);
        }
    }
}
