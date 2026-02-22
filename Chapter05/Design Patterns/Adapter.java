

    public class PaymentAdapter implements PaymentProcessor {

        private ThirdPartyPayment thirdPartyPayment;

        public PaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
            this.thirdPartyPayment = thirdPartyPayment;
        }

        @Override
        public void processPayment(double amount) {
            thirdPartyPayment.makePayment(amount);
        }
    }

    public class Adapter {

        public static void main(String[] args) {

            ThirdPartyPayment thirdParty = new ThirdPartyPayment();
            PaymentProcessor paymentProcessor =
                    new PaymentAdapter(thirdParty);

            paymentProcessor.processPayment(2000);
        }
    }