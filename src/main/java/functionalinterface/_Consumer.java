package functionalinterface;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Lambert", "7894561223"));
    }

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
