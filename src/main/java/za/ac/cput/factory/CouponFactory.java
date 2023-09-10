/*
 * CouponFactory.java
 * This is a factory for coupon entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */


package za.ac.cput.factory;

import za.ac.cput.domain.Coupon;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.util.Date;

public class CouponFactory {
    public static Coupon createCoupon(User userId, double balance, Date expDate){
        if (Helper.isNullOrEmpty(userId.getUserId()) || Helper.isNullOrEmpty(balance) || expDate == null)
            return null;
        int couponId = Helper.generateRandomId();
        return new Coupon.Builder()
                .setUserId(userId)
                .setBalance(balance)
                .setExpDate(expDate)
                .build();
    }
}
