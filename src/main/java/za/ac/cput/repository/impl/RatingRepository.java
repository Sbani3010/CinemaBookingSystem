package za.ac.cput.repository.impl;
/*
RatingRepository.java
RatingRepository  class.
Luphiwe Sikupela(216060133)
04/April/2023
 */


import za.ac.cput.domain.Rating;
import za.ac.cput.repository.IRatingRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class RatingRepository implements IRatingRepository {

    private static RatingRepository repository = null;
    private static Set<Rating> ratings = null;

    private RatingRepository(){
        ratings = new HashSet<>();
    }

    public static RatingRepository getRepository(){
        if (Helper.isNullOrEmpty(repository))
            repository = new RatingRepository();
        return repository;
    }

    @Override
    public Rating create (Rating rating){
        if (Helper.isNullOrEmpty(rating))
            return null;
        return ratings.add(rating)?rating:null;
    }

    @Override
    public Rating read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return ratings.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Rating update(Rating rating) {
        Rating rating1 = read(rating.getId());
        ratings.remove(rating1);
        return ratings.add(rating)?rating:null;
    }

    @Override
    public boolean delete(String id) {
        if (Helper.isNullOrEmpty(id))
            return false;
        return ratings.remove(read(id));
    }

    public Set<Rating> getAll(){
        return ratings;
    }
}


