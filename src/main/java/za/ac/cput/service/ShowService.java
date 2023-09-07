package za.ac.cput.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Movie;
import za.ac.cput.domain.Show;
import za.ac.cput.repository.ShowRepository;
import java.util.List;
@Service
public class ShowService implements IShowService {
    private ShowRepository repository;

    @Autowired
    private ShowService(ShowRepository showRepository) {
        this.repository = showRepository;
    }

    @Override
    public Show create(Show show) {
        return this.repository.save(show);
    }

    @Override
    public Show read(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Show update(Show show) {
        return this.repository.existsById(show.getShowId()) ? this.repository.save(show) : null;
    }

    @Override
    public boolean delete(Integer id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public List<Show> getAll() {
        return this.repository.findAll();
    }

}
