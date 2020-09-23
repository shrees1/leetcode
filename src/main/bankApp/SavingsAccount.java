public class SavingsAccount extends BankAccount {
    @Override
    public Double getMinimumBalance() {
        return 10000.0;
    }

    @Override
    public Double getCurrentBalance() {
        return null;
    }

    @Override
    public Double getInterestRate() {
        return 0.045;
    }

    @Override
    public String getType() {
        return "Saving";
    }
}
