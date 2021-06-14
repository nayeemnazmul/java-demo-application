package DemoApp.paymentGateway;

import DemoApp.EPaymentMethod;
import DemoApp.model.IPaymentDetails;
import DemoApp.processor.IPaymentProcessor;
import DemoApp.processor.AmexPaymentProcessor;

public class AmexPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("AmexPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new AmexPaymentProcessor(_paymentDetails);
    }
}
