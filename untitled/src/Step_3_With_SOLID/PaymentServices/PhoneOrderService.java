package Step_3_With_SOLID.PaymentServices;

public class PhoneOrderService implements OrderService {
    @Override
    public void orderPayment(int foodPrice){
        System.out.println("Phone Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void orderRegister(String customerName){
        System.out.println("on-site order registered for " + customerName);
    }
}
