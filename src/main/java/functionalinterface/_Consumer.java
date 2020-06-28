package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer lambert = new Customer("Lambert", "7894561223");
        greetCustomer(lambert);
        greetCustomerConsumer.accept(lambert);

        greetCustomerBiConsumer.accept(lambert, false);
        greetCustomerBiConsumer(lambert, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + ", registered with number "
                    + (showPhoneNumber ? customer.customerPhone : "*******"));

    static void greetCustomerBiConsumer(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName + ", registered with number "
                + (showPhoneNumber ? customer.customerPhone : "*******"));
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", registered with number: " + customer.customerPhone);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", registered with number: " + customer.customerPhone);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
