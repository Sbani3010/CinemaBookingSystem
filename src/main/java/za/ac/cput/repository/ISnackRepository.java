package za.ac.cput.repository;

import za.ac.cput.domain.Snack;

import java.util.Set;

public interface ISnackRepository extends IRepository<Snack,String>{
    Set<Snack>getAll();
}
