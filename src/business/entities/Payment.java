package business.entities;
import java.time.LocalDate;
import java.util.Objects;

public class Payment {

    private int paymentId;
    private LocalDate dateOfPayment;
    private double amount;
    private String typeOfPayment;
    private int customerId;

    public Payment(int paymentId, LocalDate dateOfPayment, double amount, String typeOfPayment, int customerId) {
        this.paymentId = paymentId;
        this.dateOfPayment = dateOfPayment;
        this.amount = amount;
        this.typeOfPayment = typeOfPayment;
        this.customerId = customerId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentId == payment.paymentId && Double.compare(payment.amount, amount) == 0 && customerId == payment.customerId && Objects.equals(dateOfPayment, payment.dateOfPayment) && Objects.equals(typeOfPayment, payment.typeOfPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, dateOfPayment, amount, typeOfPayment, customerId);
    }

    @Override
    public String toString() {
        return "Payment ={" +
                "paymentId=" + paymentId +
                ", dateOfPayment=" + dateOfPayment +
                ", amount=" + amount +
                ", typeOfPayment='" + typeOfPayment + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
