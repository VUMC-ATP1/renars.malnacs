package classroom.invoice;

public class Example {
    public static void main(String[] args) {

        Customer customer = new Customer(4310,"John Doe",25);
        Invoice invoice = new Invoice(112234,customer,26.99);

        System.out.println(invoice);
    }

}
