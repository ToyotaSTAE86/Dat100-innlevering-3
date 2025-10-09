package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        double thresholdHytte = 1000;
        double thresholdHus = 5000;
        boolean cabinExceeded = MonthlyPower.exceedThreshold(power_usage_month, thresholdHytte);
        boolean houseExceeded = MonthlyPower.exceedThreshold(power_usage_month, thresholdHus);
        System.out.println("Hytte over grensen (1000 kWh)? " + cabinExceeded);
        System.out.println("Hus over grensen (5000 kWh)? " + houseExceeded);
        System.out.println();

        //a
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        //b
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

        //c
        double TotUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("%.2f", TotUsage);

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}