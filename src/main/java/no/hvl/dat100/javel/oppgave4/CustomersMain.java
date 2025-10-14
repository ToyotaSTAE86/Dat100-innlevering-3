package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave5.CustomerPowerUsageData;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        // Opprett Customers med kapasitet 5
        Customers customers = new Customers(6);


        // Opprett noen Customer-objekter
        Customer c1 = new Customer("Alice Smith", "alice@example.com",1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com",1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com",1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com",1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com",1005, PowerAgreementType.POWERSUPPORT);
        Customer c6 = new Customer("Frank Castle", "frank@example.com",1006, PowerAgreementType.SPOTPRICE);


        // Legg til 5 kunder
        System.out.println("Legger til 5 kunder...");
        System.out.println("legger til c1: " + customers.addCustomer(c1));
        System.out.println("legger til c2: " + customers.addCustomer(c2));
        System.out.println("legger til c3: " + customers.addCustomer(c3));
        System.out.println("legger til c4: " + customers.addCustomer(c4));
        System.out.println("legger til c5: " + customers.addCustomer(c5));


        // Tell
        System.out.println("\nAntall lagrede kunder: " + customers.countNonNull());

        // Hent kunde med id 1003
        Customer found = customers.getCustomer(1003);
        System.out.println("\nHenter kunde med ID 1003: " + (found != null ? found.getName() : "Ikke funnet"));


        // Slett kunde med id 1002
        Customer removed = customers.removeCustomer(1002);
        System.out.println("Fjernet kunde med ID 1002: " + (removed != null ? removed.getName() : "Ikke funnet"));


        // Legger til c6 og sier antall aktive kunder
        System.out.println("Legger til c6: " + customers.addCustomer(c6));
        System.out.println("Antall lagrede kunder nå: " + customers.countNonNull());


        // Vis alle nåværende kunder
        System.out.println("\nListe over aktive kunder:" );
        for (Customer c : customers.getCustomers()) {
            System.out.println(c.getCustomer_id() + " - " + c.getName() + " (" + c.getAgreement() + ")");
        }


        // Prøv å hente den fjernede kunden igjen
        System.out.println("\nPrøver hente fjernet kunde 1002: " + (customers.getCustomer(1002) == null ? "Ikke funnet" : "Fant"));


    }
}
