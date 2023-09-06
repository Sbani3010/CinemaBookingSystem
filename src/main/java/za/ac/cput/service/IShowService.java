package za.ac.cput.service;
import za.ac.cput.domain.Show;
import java.util.List;

public interface IShowService extends IService<Show,Integer>{
    public List<Show> getAll();
}
