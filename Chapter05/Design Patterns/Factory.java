//1. Create Common Interface
public interface Payment {
    void pay(double amount);
}

//2. Create Implementation Classes
public class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

public class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

//3. Create Factory Class
public class PaymentFactory {

    public static Payment getPayment(String type) {

        if(type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        }
        else if(type.equalsIgnoreCase("upi")) {
            return new UpiPayment();
        }

        return null;
    }
}
//4. Client Code

public class Factory {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("upi");
        payment.pay(1000);
    }
}

