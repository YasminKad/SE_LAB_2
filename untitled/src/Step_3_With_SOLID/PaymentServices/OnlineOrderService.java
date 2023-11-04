package Step_3_With_SOLID.PaymentServices;

public class OnlineOrderService implements OrderService {
//    @Override
//    public void onSiteOrderRegister(String customerName) {
//        //Empty Body!
//    }
//
//    @Override
//    public void onlineOrderRegister(String customerName) {
//        System.out.println("online order registered for " + customerName);
//    }
//
//    @Override
//    public void onSiteOrderPayment(int foodPrice) {
//        //Empty Body
//    }
//
//    @Override
//    public void onlineOrderPayment(int foodPrice) {
//        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
//    }
//
//    @Override
//    public void phoneOrderRegister(String customerName) {
//        //Empty Body!
//    }
//
//    @Override
//    public void phoneOrderPayment(int foodPrice) {
//        //Empty Body!
//    }
    @Override
    public void orderRegister(String customerName){
        System.out.println("online order registered for " + customerName);
    }

}
