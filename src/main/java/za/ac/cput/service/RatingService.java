package za.ac.cput.service;

import za.ac.cput.domain.Rating;

import java.util.Set;

public interface RatingService {

    Rating create(Rating rating);

    Rating read(String id);
    Rating update(Rating rating);
    boolean delete(String id);
    Set<Rating> getAll();
}


