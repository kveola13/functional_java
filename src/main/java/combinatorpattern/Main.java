package combinatorpattern;

import java.time.LocalDate;

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
    }
}
