package DemoApp.paymentGateway;

import DemoApp.EPaymentMethod;
import DemoApp.model.IPaymentDetails;
import DemoApp.processor.IPaymentProcessor;

public interface IPaymentGateway {
    IPaymentGateway withPaymentMethod(EPaymentMethod _ePaymentMethod);

    IPaymentProcessor withPaymentDetails(IPaymentDetails _paymentDetails);
}




