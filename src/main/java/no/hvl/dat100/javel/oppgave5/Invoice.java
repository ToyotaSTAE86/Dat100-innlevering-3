package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    public void computeAmount() {
        double spotCost = 0.0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                spotCost += usage[i][j] * prices[i][j];
            }
        }

        if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
            amount = spotCost;

        } else if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
            amount = MonthlyPower.computeNorgesPrice(usage);

        } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {



            double support = MonthlyPower.computePowerSupport(usage, prices);
            amount = Math.max(0.0, spotCost - support);


        } else {
            amount = spotCost;
        }
    }

    public void printInvoice() {

        Double totalusage = 0.0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                totalusage += usage[i][j];
            }
        }

        System.out.println("========================");
        System.out.println("Customer number " + c.getCustomer_id());
        System.out.println("Name " + c.getName());
        System.out.println("Email " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage: " + totalusage + " Kwh ");
        System.out.printf("Amount: " + amount + " Nok ");
        System.out.println("========================");

    }
}
