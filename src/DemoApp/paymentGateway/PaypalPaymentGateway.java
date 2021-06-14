package DemoApp.paymentGateway;

import DemoApp.EPaymentMethod;
import DemoApp.model.IPaymentDetails;
import DemoApp.processor.IPaymentProcessor;
import DemoApp.processor.PaypalPaymentProcessor;

public class PaypalPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("PaypalPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new PaypalPaymentProcessor();
    }
}
