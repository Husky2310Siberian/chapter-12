package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Customer;

public class CustomerMain {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setVatRegistrationNo("123456789");

        Customer anna = new Customer(2, "Anna", "987654321","1234567899",
                "699999999", "Attica" , "Central Attica", "Athens" , "Patision" , "11123");

        System.out.println("Anna's VAT :" + anna.getVatRegistrationNo());

        System.out.println("customer VAT: " + customer.getVatRegistrationNo());
    }
}

