package Step_3_With_SOLID.PaymentServices;

public class OnSiteOrderService implements OrderService {
    @Override
    public void orderPayment(int foodPrice){
        System.out.println("on-site Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void orderRegister(String customerName){
        System.out.println("on-site order registered for " + customerName);
    }
}
