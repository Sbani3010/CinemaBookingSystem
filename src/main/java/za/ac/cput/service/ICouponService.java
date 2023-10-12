/*
 * ICouponService.java
 * This is a service for coupon entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */


package za.ac.cput.service;

import za.ac.cput.domain.Coupon;

import java.util.List;
import java.util.Set;

public interface ICouponService extends IService<Coupon, Integer>{
    List<Coupon> getAll();
}
