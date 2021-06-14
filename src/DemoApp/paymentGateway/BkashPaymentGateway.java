package DemoApp.paymentGateway;

import DemoApp.EPaymentMethod;
import DemoApp.model.IPaymentDetails;
import DemoApp.processor.IPaymentProcessor;
import DemoApp.processor.BkashPaymentProcessor;

public class BkashPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("BkashPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new BkashPaymentProcessor(_paymentDetails);
    }
}
