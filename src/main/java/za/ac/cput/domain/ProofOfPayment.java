package za.ac.cput.domain;

import java.util.Date;

public class ProofOfPayment {
    private String id;
    private User user;
    private double amount;
    private Date paymentDate;
    private ProofOfPayment() {
    }

    public ProofOfPayment(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.amount = builder.amount;
        this.paymentDate = builder.paymentDate;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public static class Builder {
        private String id;
        private User user;
        private double amount;
        private Date paymentDate;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder copy(ProofOfPayment payment) {
            this.id = payment.id;
            this.user = payment.user;
            this.amount = payment.amount;
            this.paymentDate = payment.paymentDate;
            return this;
        }

        public ProofOfPayment build() {
            return new ProofOfPayment(this);
        }
    }


}
