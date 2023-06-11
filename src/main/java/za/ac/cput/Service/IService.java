package za.ac.cput.Service;

public interface IService<T,ID> {
 T create (T t);
 T read(ID id);
 boolean update (T t);
 boolean delete(ID id);
}
