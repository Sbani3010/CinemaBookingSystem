package za.ac.cput.service.impl;

import za.ac.cput.domain.Movie;
import za.ac.cput.repository.impl.MovieRepository;
import za.ac.cput.service.MovieService;

import java.util.Set;

public class MovieServiceImpl implements MovieService {
    private static MovieServiceImpl movieService=null;
    private MovieRepository repository=null;
    private MovieServiceImpl(){
        if(repository==null)repository=MovieRepository.getRepository();
    }
    public static MovieServiceImpl getMovieService(){
        if(movieService==null) movieService=new MovieServiceImpl();
        return movieService;
    }

    @Override
    public Movie create(Movie movie) {
        return repository.create(movie);
    }

    @Override
    public Movie read(String s) {
        return repository.read(s);
    }

    @Override
    public Movie update(Movie movie) {
        return repository.update(movie);
    }

    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }

    @Override
    public Set<Movie> getAll() {
        return repository.getAll();
    }
}
