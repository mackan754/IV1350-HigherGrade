package se.kth.iv1350.processSaleMarcusHampus.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Outputs the total revenue to a file using the Template Method pattern.
 */
public class TotalRevenueFileLogger extends TotalRevenueTemplate {
    private PrintWriter logStream;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public TotalRevenueFileLogger() {
        try {
            logStream = new PrintWriter(new FileWriter("totalRevenue.txt", true), true);
        } catch (IOException ioe) {
            System.out.println("CAN NOT LOG.");
            ioe.printStackTrace();
        }
    }
    
    @Override
    protected void doShowTotalIncome(Amount totalRevenue) throws IOException {
        String timestamp = LocalDateTime.now().format(DATE_TIME_FORMATTER);
        logStream.println(timestamp + " Total Revenue: " + totalRevenue.getAmount());
    }

    @Override
    protected void handleErrors(Exception e) {
        e.printStackTrace();
    }
}
