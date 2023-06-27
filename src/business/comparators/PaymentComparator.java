package business.comparators;

import business.entities.Payment;

import java.util.Comparator;

public class PaymentComparator implements Comparator<Payment> {
    public int compare(Payment firstPayment, Payment secondPayment) {
        if (firstPayment.getAmount() < secondPayment.getAmount()) {
            return -1;
        }
        if (firstPayment.getAmount() == secondPayment.getAmount()) {
            return firstPayment.getDateOfPayment().compareTo(secondPayment.getDateOfPayment());
        }
        return 1;
    }
}
