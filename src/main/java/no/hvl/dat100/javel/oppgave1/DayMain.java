package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // testdata fra DayPowerData
        double[] powerusage_day = DayPowerData.powerusage_day;
        double[] powerprices_day = DayPowerData.powerprices_day;

        // a) Strømpriser
        System.out.println("a) Strømpriser (NOK/kWh):");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // b) Strømforbruk
        System.out.println("b) Strømforbruk (kWh per time):");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // c) Totalt strømforbruk
        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.printf("c) Totalt strømforbruk for dagen: %.2f kWh%n", totalUsage);
        System.out.println();

        // d) Spotpris totalt
        double totalSpotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("d) Total spotpris (uten støtte): %.2f NOK%n", totalSpotPrice);
        System.out.println();

        // e og f) Strømstøtte
        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("e og f) Strømstøtte for dagen: %.2f NOK%n", totalSupport);
        System.out.println();

        // g) Norgespris
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("g) Norgespris for dagen (0.50 NOK/kWh): %.2f NOK%n", norgesPris);
        System.out.println();

        // h) Størst forbrukstime
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.printf("h) Høyeste timeforbruk: %.2f kWh%n", peakUsage);
        System.out.println();

        // i) Gjennomsnittlig forbruk
        double avgUsage = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("i) Gjennomsnittlig timeforbruk: %.2f kWh%n", avgUsage);
        System.out.println();
    }
}
