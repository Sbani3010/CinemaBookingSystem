/* IRepository.java
 IRepository interface
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;
public interface IRepository <T,W>{
    T create(T obj);
    T read(W id);
    T update(T obj);
    boolean delete(W id);
}
