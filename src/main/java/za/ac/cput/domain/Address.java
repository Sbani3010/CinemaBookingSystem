/*
 * Address.java
 * Entity for address
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.domain;

public class Address {
    private String id;
    private String street;
    private String city;
    private String country;
    private int zipCode;

    private Address(){

    }
    private Address (Builder builder){
        this.id = builder.id;
        this.street = builder.street;
        this.city = builder.city;
        this.country = builder.country;
        this.zipCode = builder.zipCode;
    }

    public String getId(){
        return id;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public int getZipCode(){
        return zipCode;
    }

    public static class Builder{
        private String id;
        private String street;
        private String city;
        private String country;
        private int zipCode;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setStreet(String street){
            this.street = street;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public Builder setCountry(String country){
            this.country = country;
            return this;
        }

        public Builder setZipCode(int zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
