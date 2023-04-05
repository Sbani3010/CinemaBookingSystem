package za.ac.cput.factory;

import za.ac.cput.domain.ProofOfPayment;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.util.Date;

public class ProofOfPaymentFactory {

    public static ProofOfPayment createProofOfPayment(User user, double amount, Date date) {
        if (Helper.isNullOrEmpty(user) || Helper.isNullOrEmpty(amount) || Helper.isNullOrEmpty(date) || Helper.isValidDate(date))
            return null;

        return new ProofOfPayment.Builder().setId(Helper.generateId())
                .setUser(user)
                .setAmount(amount)
                .setPaymentDate(date)
                .build();
    }
}
