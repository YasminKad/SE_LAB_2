package Step_3_With_SOLID.PaymentServices;

public class OnlineOrderService implements OrderService {
    @Override
    public void orderPayment(int foodPrice){
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void orderRegister(String customerName){
        System.out.println("online order registered for " + customerName);
    }
}
