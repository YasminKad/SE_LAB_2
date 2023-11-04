package Step_3_With_SOLID.PaymentServices;

public interface OrderService {
    public void orderRegister(String customerName);
    public void orderPayment(int foodPrice);

}
