package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // Opprett kundene (fra tidligere oppgaver)
        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);

        // Hent forbruk (fra CustomerPowerUsageData)
        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;

        // Hent priser (fra MonthPowerData, oppgave 2)
        double[][] prices = MonthPowerData.powerprices_month;

        // Lag faktura-objekter
        Invoice inv1 = new Invoice(c1, "January", usage1, prices);
        Invoice inv2 = new Invoice(c2, "January", usage2, prices);
        Invoice inv3 = new Invoice(c3, "January", usage3, prices);

        // Sett alle fakturaene i en tabell
        Invoice[] invoices = { inv1, inv2, inv3 };

        // Bruk processInvoices() for å skrive ut alle
        Invoices.processInvoices(invoices);
    }
}