package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("Alice Smith", "Alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        System.out.println(c1);
        System.out.println();

        c1.setName("Lucier trans");
        c1.setEmail("Lucy@example.com");
        c1.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("Etter oppdatering: ");
        System.out.println(c1);

        /*
         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
