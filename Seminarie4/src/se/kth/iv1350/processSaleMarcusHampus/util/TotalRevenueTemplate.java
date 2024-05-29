package se.kth.iv1350.processSaleMarcusHampus.util;

/**
 * Specifies a template for observing total revenue updates.
 */
public abstract class TotalRevenueTemplate implements TotalRevenueObserver {

    @Override
    public void updateTotalRevenue(Amount totalRevenue) {
        showTotalIncome(totalRevenue);
    }

    private void showTotalIncome(Amount totalRevenue) {
        try {
            doShowTotalIncome(totalRevenue);
        } catch (Exception e) {
            handleErrors(e);
        }
    }

    protected abstract void doShowTotalIncome(Amount totalRevenue) throws Exception;

    protected abstract void handleErrors(Exception e);
}
