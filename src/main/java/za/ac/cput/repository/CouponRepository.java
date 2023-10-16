/*
 * CouponRepository.java
 * This is a repository for coupon entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */


package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Coupon;
@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
}
