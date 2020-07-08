package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "John Wick",
                "john@wick.com",
                "+4755597421",
                LocalDate.of(2001, 1, 1)
        );

        CustomerValidatorService service = new CustomerValidatorService();
        System.out.println(service.isValidCustomer(customer));

        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAdult()).apply(customer);
        System.out.println(result);

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
