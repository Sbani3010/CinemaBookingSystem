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

    public String getfName() {
        return firstName;
    }

    public String getlName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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

        public Builder setfName(String fName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setlName(String lName) {
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

        public Builder copy() {
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
