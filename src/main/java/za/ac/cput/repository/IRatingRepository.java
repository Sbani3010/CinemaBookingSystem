package za.ac.cput.repository;
/*
IRatingRepository.java
IRatingRepository  class.
Luphiwe Sikupela(216060133)
04/April/2023
 */

import za.ac.cput.domain.Rating;


import java.util.Set;

public interface IRatingRepository extends IRepository<Rating,String> {
    Set<Rating> getAll();

}