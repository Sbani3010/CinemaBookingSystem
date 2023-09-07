package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Show;
@Repository
public interface ShowRepository extends JpaRepository<Show,Integer>{
}
