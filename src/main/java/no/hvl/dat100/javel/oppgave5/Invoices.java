package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        for (int i = 0; i < invoices.length; i++) {
            invoices[i].computeAmount();
            invoices[i].printInvoice();
            System.out.println();
        }
    }
}