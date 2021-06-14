package DemoApp.paymentGateway;

import DemoApp.EPaymentMethod;
import DemoApp.model.IPaymentDetails;
import DemoApp.processor.IPaymentProcessor;
import DemoApp.processor.VisaPaymentProcessor;

public class VisaPaymentGateway implements IPaymentGateway{
    @Override
    public IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod) {
        System.out.println("VisaPaymentGateway selected");
        return this;
    }

    @Override
    public IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails) {
        return new  VisaPaymentProcessor();
    }
}
