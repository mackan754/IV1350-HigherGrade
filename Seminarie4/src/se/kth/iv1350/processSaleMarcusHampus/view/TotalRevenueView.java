package se.kth.iv1350.processSaleMarcusHampus.view;

import se.kth.iv1350.processSaleMarcusHampus.util.Amount;
import se.kth.iv1350.processSaleMarcusHampus.util.TotalRevenueTemplate;

/**
 * An observer that displays the total revenue in the user interface.
 */
public class TotalRevenueView extends TotalRevenueTemplate {
    @Override
    protected void doShowTotalIncome(Amount totalRevenue) {
        System.out.println("Total Revenue: " + totalRevenue.getAmount());
    }

    @Override
    protected void handleErrors(Exception e) {
        System.err.println("Failed to show total income: " + e.getMessage());
    }
}
