package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;
        for (Customer c : customers) {
            if (c != null) {
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        for (Customer c : customers) {
            if (c != null && c.getCustomer_id() == customer_id) {
                return c;
            }
        }
        return null;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }
        return false; // ingen ledig plass
    }


    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                Customer removed = customers[i];
                customers[i] = null;
                return removed;
            }
        }
        return null;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {
        int count = countNonNull();
        Customer[] result = new Customer[count];
        int index = 0;
        for (Customer c : customers) {
            if (c != null) {
                result[index++] = c;
            }
        }
        return result;
    }
}