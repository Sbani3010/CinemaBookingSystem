/*User.java
 * Entity For the User
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 04 April 2023
 * */

package za.ac.cput.domain;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private User() {
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setfirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setlastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(User user) {
            this.id = user.id;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            this.password = user.password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
