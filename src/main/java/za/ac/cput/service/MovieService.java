package za.ac.cput.service;

import za.ac.cput.domain.Movie;

import java.util.Set;

public interface MovieService extends IService<Movie,String>{
    Set<Movie> getAll();
}
